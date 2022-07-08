package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// Data Access Object : 데이터에 접근하는 역할을 맡은 객체
public class BbsDAO {

	private Connection conn; // 자바와 DB 연결하는 객체
	private PreparedStatement pstmt; // 쿼리 준비
	private ResultSet rs; // 쿼리 실행 후 결과를 담을 객체

	public BbsDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/JSP_TEST?serverTimezone=UTC";
			// jdbc : Java DataBase Connectivity
			String dbID = "root";
			String dbPW = "system123";

			Class.forName("com.mysql.cj.jdbc.Driver");
			// 데이터베이스 드라이버를 로드할 뿐, 연결에 대한 행동은 하지 않음
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 글쓰기 화면에서 내용 작성 후 글쓰기 버튼 누르면 실행되는 함수
	// 아이디, 제목, 내용, 작성자, 작성시간, 삭제여부를 DB에 저장
	public int write(String bbsTitle, String userID, String bbsContent) {
		String SQL = "insert into bbs values (?,?,?,?,?,?)";
		// 실행할 쿼리 (사용자가 입력한 아이디에 해당하는 비밀번호 추출)

		try {
			int num = getNext();
			String date = getDate();

			pstmt = conn.prepareStatement(SQL); // 문자열 쿼리 대입
			
			pstmt.setInt(1, num);
			pstmt.setString(2, bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, date);
			pstmt.setString(5, bbsContent);
			pstmt.setInt(6, 1);
			

			return pstmt.executeUpdate(); // 쿼리 실행 및 결과값 대입

		} catch (Exception e) {
			e.printStackTrace(); // 데이터베이스 오류
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public int getNext() {
		String SQL = "select max(bbsID) from bbs";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public String getDate() {
		String SQL = "select NOW() from dual";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
			return "2022-01-01";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
	
	// 글 목록 가져오는 함수
	// 쿼리 : 인자로 전달받은 글부터 최신순으로 10개만 가져오기
	public ArrayList<Bbs> getList(int pageNumber){
		String SQL = "select * from BBS where bbsID < ? and bbsAvailable = 1 order by bbsID desc limit 10";
		
		ArrayList<Bbs> list = new ArrayList<Bbs>();	//껍데기 리스트
		try {
			
			int nextNum = getNext();
			int startNum = nextNum - (pageNumber - 1)*10;
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, startNum);	//해당페이지의 시작번호

			rs =  pstmt.executeQuery(); //select문에 쓰는 함수
			while(rs.next()) {
				 Bbs bbs = new Bbs();
				 bbs.setBbsID(rs.getInt(1));
				 bbs.setBbsTitle(rs.getString(2));
				 bbs.setWriter(rs.getString(3));
				 bbs.setCrDate(rs.getString(4));
				 bbs.setBbsContent(rs.getString(5));
				 bbs.setBbsAvailable(rs.getInt(6));
				 list.add(bbs);	//검색된 글들을 하나하나 리스트에 쌓기
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;	//다쌓은 리스트를 반환
	}

}
