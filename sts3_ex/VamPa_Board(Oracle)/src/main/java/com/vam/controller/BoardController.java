package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;
import com.vam.model.PageMakerDTO;
import com.vam.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
    @Autowired
    private BoardService bservice;
    
    /* 게시판 목록 페이지 접속 */
	/*
	 * @GetMapping("/list") // => @RequestMapping(value="list",
	 * method=RequestMethod.GET) public String boardListGET(Model model) {
	 * 
	 * log.info("게시판 목록 페이지 진입"); model.addAttribute("list", bservice.getList());
	 * 
	 * return "board/list";
	 * 
	 * }
	 */
	
    /* 게시판 목록 페이지 접속(페이징 적용) */
    @GetMapping("/list")
    public void boardListGET(Model model, Criteria cri) {
        
        log.info("boardListGET");
        model.addAttribute("list", bservice.getListPaging(cri));
        
        int total = bservice.getTotal(cri);
        PageMakerDTO pageMake = new PageMakerDTO(cri, total);
        model.addAttribute("pageMaker", pageMake);
        
    }
    
    /* 게시글 등록 페이지 접속 */
	@GetMapping("/enroll")
		// => @RequestMapping(value="enroll", method=RequestMethod.GET)
	public void boardEnrollGET() {

		log.info("게시판 등록 페이지 진입");

	}

	@GetMapping("/custom")
		// => @RequestMapping(value="custom", method=RequestMethod.GET)
	public void boardCustomGET() {
		
		log.info("커스텀 페이지 진입");
		
	}
	
    /* 게시판 등록 처리 */
    @PostMapping("/enroll")
    public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
        
        log.info("BoardVO : " + board);
        bservice.enroll(board);
        
        rttr.addFlashAttribute("result", "enroll success");
        return "redirect:/board/list";
        
    }
    
    /* 게시글 상세조회 */
    // get 요청은 페이지 이동이 반복되는 동안 이전 페이지들의 요청 정보를 기억하고 있어야 함
    // 이때 URL에 파라미터가 누적되어 전달되는데, 이것을 URL Rewrite 처리라고 함
    @GetMapping("/get")
    public void boardGetPageGET(int bno, Model model, Criteria cri) {
        
        model.addAttribute("pageInfo", bservice.getPage(bno));
        model.addAttribute("cri", cri);
        
    }
    
    /* 수정 페이지 이동 */
    @GetMapping("/modify")
    public void boardModifyGET(int bno, Model model, Criteria cri) {
        
        model.addAttribute("pageInfo", bservice.getPage(bno));
        model.addAttribute("cri", cri);
        
    }
    
    /* 글 수정 */
    @PostMapping("/modify")
    public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
        
        bservice.modify(board);
        
        rttr.addFlashAttribute("result", "modify success");
        
        return "redirect:/board/list";
        
    }
    
    /* 글 삭제 */
    @PostMapping("/delete")
    public String boardDeletePOST(int bno, RedirectAttributes rttr) {
        
        bservice.delete(bno);
        
        rttr.addFlashAttribute("result", "delete success");
        
        return "redirect:/board/list";
    }
    
}
