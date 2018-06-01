package com.spring.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.domain.Path;
import com.spring.web.dto.BoardVo;
import com.spring.web.factory.ContextFactory;
import com.spring.web.service.BoardService;

@SessionAttributes("path,user")
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired Path path;
	@Autowired ContextFactory context;
	
	// 의존관계 주입 => BoardServiceImpl 생성
    // IoC 의존관계 역전
    @Inject
    BoardService boardService;
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String index() {
        return "board/main.tiles";
    }
	
	 // 01. 게시글 목록
    @RequestMapping("list.do")
    public ModelAndView list() throws Exception{
        List<BoardVo> list = boardService.listAll();
        // ModelAndView - 모델과 뷰
        ModelAndView mav = new ModelAndView();
        mav.setViewName("board/list"); // 뷰를 list.jsp로 설정
        mav.addObject("list", list); // 데이터를 저장
        return mav; // list.jsp로 List가 전달된다.
    }
    
    // 02_01. 게시글 작성화면
    // @RequestMapping("board/write.do")
    // value="", method="전송방식"
    @RequestMapping(value="write.do", method=RequestMethod.GET)
    public String write(){
        return "board/write"; // write.jsp로 이동
    }
    
    // 02_02. 게시글 작성처리
    @RequestMapping(value="insert.do", method=RequestMethod.POST)
    public String insert(@ModelAttribute BoardVo vo) throws Exception{
        boardService.create(vo);
        return "redirect:list.do";
    }
	
	
	//이전맵핑소스
	@RequestMapping(value = "/board/boardList", method = RequestMethod.GET)
	public String boardList() {
		return "board/boardList.tiles";
	}
	@RequestMapping(value = "/board/boardWrite", method = RequestMethod.GET)
	public String boardWrite() {
		return "board/boardWrite.tiles";
	}
	
	@RequestMapping(value = "/board", method = RequestMethod.POST)
    public String create(@ModelAttribute BoardVo title) {
        System.out.println(title.toString());
        return "redirect:/board.tiles";
}
	
}
