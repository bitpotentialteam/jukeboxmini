package org.juke.service;

import javax.inject.Inject;

import org.juke.dao.MemberDAOImpl;
import org.juke.domain.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDAOImpl dao;
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.create(vo);
	}
	
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}

}
