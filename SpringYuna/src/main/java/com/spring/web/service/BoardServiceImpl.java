package com.spring.web.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.spring.web.board.dao.BoardDAO;
import com.spring.web.dto.BoardVo;

public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO boardDao; 
	
	//01.게시글쓰기
	@Override
	public void create(BoardVo vo) throws Exception {
		String title = vo.getTitle();
		String author = vo.getAuthor();
        String content = vo.getContent();
        // *태그문자 처리 (< ==> &lt; > ==> &gt;)
        // replace(A, B) A를 B로 변경
        title = title.replace("<", "&lt;");
        title = title.replace("<", "&gt;");
        author = author.replace("<", "&lt;");
        author = author.replace("<", "&gt;");
        // *공백문자 처리
        title = title.replace("  ",    "&nbsp;&nbsp;");
        author = author.replace("  ",    "&nbsp;&nbsp;");
        // *줄바꿈 문자처리
        content = content.replace("\n", "<br>");
        vo.setTitle(title);
        vo.setContent(content);
        vo.setAuthor(author);
        boardDao.create(vo);
	}

	@Override
	public BoardVo read(int no) throws Exception {
		return boardDao.read(no);
	}

	@Override
	public List<BoardVo> listAll() throws Exception {
		
		return boardDao.listAll();
	}

	@Override
	public void update(BoardVo vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseViewcnt(int bno, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
