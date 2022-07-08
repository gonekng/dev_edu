package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);

	@Autowired
	private BoardMapper mapper;

	@Test
	public void testEnroll() {

		BoardVO vo = new BoardVO();

		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");

		mapper.enroll(vo);

	}

	/* 게시판 목록 테스트 */
	@Test
	public void testGetList() {

		List list = mapper.getList();

		/* for-each문(향상된 for문) */
		for (Object a : list) {
			log.info("" + a);
		}

	}

	/* 게시글 상세조회 테스트 */
	@Test
	public void testGetPage() {

		int bno = 3;

		log.info("" + mapper.getPage(bno));

	}

	/* 게시글 수정 테스트 */
	@Test
	public void testModify() {

		// given(준비), when(실행), then(리턴)

		BoardVO board = new BoardVO();
		board.setBno(2);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");

		int result = mapper.modify(board);
		log.info("result : " + result);

	}

	/* 게시판 삭제 테스트 */
	@Test
	public void testDelete() {

		int result = mapper.delete(4);
		log.info("result : " + result);

	}
	
	/* 전체 게시글 수 가져오기 테스트 */
	@Test
	public void testGetTotal() {

		Criteria cri = new Criteria();
		int total = mapper.getTotal(cri);
		log.info("등록된 총 게시글 수 : " + total);

	}

	/* 게시판 목록(페이징 적용)테스트 */
	@Test
	public void testGetListPaging() {

		Criteria cri = new Criteria();
		cri.setPageNum(100);
		List list = mapper.getListPaging(cri);
		list.forEach(board -> log.info("" + board));
		
	}

}