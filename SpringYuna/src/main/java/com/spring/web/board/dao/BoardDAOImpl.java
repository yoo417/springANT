package com.spring.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.spring.web.dto.BoardVo;

@Repository    // 현재 클래스를 dao bean으로 등록
public class BoardDAOImpl implements BoardDAO {
	@Inject
    /*SqlSession SqlSession;*/
	
	
	@Override
	public void create(BoardVo vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardVo read(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardVo vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int no) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardVo> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseViewcnt(int no) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
