package org.juke.service;

import org.juke.dao.MemberDAOImpl;
import org.juke.domain.MemberVO;

public class MemberServiceImpl implements MemberService{

	MemberDAOImpl dao = new MemberDAOImpl();
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.create(vo);
	}
	
	@Override
	public void login(MemberVO vo) throws Exception {
		dao.login(vo);
	}

}
