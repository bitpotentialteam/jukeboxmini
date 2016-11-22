package org.juke.service;

import java.util.List;

import org.juke.dao.MusicDAO;
import org.juke.dao.MusicDAOImpl;
import org.juke.domain.MemberVO;
import org.juke.domain.MusicVO;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService  {

	MusicDAO dao = new MusicDAOImpl();
	
	
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
	public List<MemberVO> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
