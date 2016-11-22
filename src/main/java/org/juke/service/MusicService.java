package org.juke.service;

import java.util.List;

import org.juke.domain.MemberVO;
import org.juke.domain.MusicVO;

public interface MusicService {
	
	
	public void register(MusicVO vo) throws Exception;
	
	public MusicVO search(Integer mno) throws Exception;
	
	public void delete(Integer mno) throws Exception;
	
	public void modify(MusicVO vo) throws Exception;
	
	public List<MusicVO> list(Integer page) throws Exception;

}
