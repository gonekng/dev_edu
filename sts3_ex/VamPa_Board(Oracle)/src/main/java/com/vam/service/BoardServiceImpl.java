package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.BoardMapper;
import com.vam.model.BoardVO;
import com.vam.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	public BoardMapper mapper;
    // Spring이 관리하는 객체(Bean)은 Singleton 패턴으로 관리됨 (1개의 인스턴스만 유지)
    // Autowired를 통해서 new 생성자 호출 없이도 그 객체를 사용할 수 있게 함
		
	@Override
	public void enroll(BoardVO board) {
		// enroll 함수 안에서는 BoardMapper의 인스턴스를 사용해야 하는데,
		// 그 인스턴스를 enroll 함수 안에서가 아니라 외부에서 생성된 것을 주입받아 사용함
		mapper.enroll(board);

	}
	
    @Override
    public List<BoardVO> getList() {
        
        return mapper.getList();
    }
    
    /* 게시판 목록(페이징 적용) */
    @Override
    public List<BoardVO> getListPaging(Criteria cri) {
        
        return mapper.getListPaging(cri);
    }
    
    /* 게시글 조회 */
    @Override
    public BoardVO getPage(int bno) {
         
        return mapper.getPage(bno);
    } 
    
    /* 게시글 수정 */
    @Override
    public int modify(BoardVO board) {
        
        return mapper.modify(board);
    }
    
    /* 게시판 삭제 */
    @Override
    public int delete(int bno) {
        
        return mapper.delete(bno);
    }
    
    /* 게시글 총 갯수 */
    @Override
    public int getTotal(Criteria cri) {
        
        return mapper.getTotal(cri);
    } 

}
