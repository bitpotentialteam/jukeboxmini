package org.juke.service;

import java.util.List;

import javax.inject.Inject;

import org.juke.dao.ReplyDAO;
import org.juke.domain.ReplyVO;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	ReplyDAO dao;
	
	@Override
	public void register(ReplyVO vo) throws Exception {
		dao.create(vo);
	}

	
	@Override
	public ReplyVO search(Integer rno) throws Exception {
		return dao.read(rno);
	}

	
	@Override
	public void delete(Integer rno) throws Exception {
		dao.delete(rno);
	}

	
	@Override
	public void modify(ReplyVO vo) throws Exception {
		dao.update(vo);
	}

	
	@Override
	public List<ReplyVO> list() throws Exception {
		return null;
	}

	
	
}
