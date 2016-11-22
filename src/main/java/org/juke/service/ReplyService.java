package org.juke.service;

import java.util.List;

import org.juke.domain.ReplyVO;

public interface ReplyService {
	
	
	public void register(ReplyVO vo) throws Exception;
	
	public ReplyVO search(Integer rno) throws Exception;
	
	public void delete(Integer rno) throws Exception;
	
	public void modify(ReplyVO vo) throws Exception;
	
	public List<ReplyVO> list() throws Exception;
	

}
