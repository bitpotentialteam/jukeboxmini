package org.juke.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.juke.dao.MusicDAO;
import org.juke.domain.MemberVO;
import org.juke.domain.MusicVO;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService  {

	@Inject
	MusicDAO dao;
	
	
	@Override
	public void register(MusicVO vo) throws Exception {
		dao.create(vo);
		
	}

	
	@Override
	public MusicVO search(Integer mno) throws Exception {
		return dao.read(mno);
	}

	
	@Override
	public void delete(Integer mno) throws Exception {
		dao.delete(mno);
	}
	

	@Override
	public void modify(MusicVO vo) throws Exception {
		dao.update(vo);
	}

	
	@Override
	public List<MusicVO> list(Integer page) throws Exception {
		List<MusicVO> list = new ArrayList<MusicVO>();
		list = dao.list(page);
		return list;
	}
	
	

}
