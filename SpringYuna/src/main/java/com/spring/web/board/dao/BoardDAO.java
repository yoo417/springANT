package com.spring.web.board.dao;

import java.util.List;

import com.spring.web.dto.BoardVo;

public interface BoardDAO {
	// 01. 게시글 작성
    public void create(BoardVo vo) throws Exception;
    // 02. 게시글 상세보기
    public BoardVo read(int no) throws Exception;
    // 03. 게시글 수정
    public void update(BoardVo vo) throws Exception;
    // 04. 게시글 삭제
    public void delete(int no) throws Exception;
    // 05. 게시글 전체 목록
    public List<BoardVo> listAll() throws Exception;
    // 06. 게시글 조회 증가
    public void increaseViewcnt(int no) throws Exception;
	
}
