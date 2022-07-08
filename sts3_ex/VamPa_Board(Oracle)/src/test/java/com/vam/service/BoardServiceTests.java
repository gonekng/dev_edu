package com.vam.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

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
public class BoardServiceTests {
	
    private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
        
    @Autowired
    private BoardService service;
    
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("service test");
        vo.setContent("service test");
        vo.setWriter("service test");
        
        service.enroll(vo);
        
        // BoardService 인터페이스의 enroll 함수를 호출하면
        // 매핑되어있는 BoardMapper.xml에 있는 id가 enroll인 쿼리가 실행됨
        
    }
        
    /* 게시판 목록 테스트 */
    @Test
    public void testGetList() {
        
    	// 람다식 활용
        service.getList().forEach(board -> log.info("" + board));        
        
    }
    
    /*게시글 상세조회 테스트*/
    @Test
    public void testGETPage() {
        
        int bno = 4;
        
        log.info("" + service.getPage(bno));
        
    }
    
    /* 게시글 수정 테스트 */
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(2);
        board.setTitle("수정된 제목2");
        board.setContent("수정된 내용2");
        
        int result = service.modify(board);
        log.info("result : " +result);
        
    } 
    
    /* 게시판 삭제 테스트 */
    @Test
    public void testDelete() {
        
        int result = service.delete(5);
        log.info("result : " + result);
        
    }
    
    /* 게시판 조회(페이징 적용) 테스트 */
    @Test
    public void testGetListPaging() {
        
        Criteria cri = new Criteria();
        
        List list = service.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
        
    }
 
}