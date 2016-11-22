package org.juke.web;

import javax.inject.Inject;

import org.juke.dao.MemberDAOImpl;
import org.juke.domain.MemberVO;
import org.junit.Test;

public class MemberTester {
	
	@Inject
	MemberDAOImpl dao;

	@Test
	public void daoTest() throws Exception{
		System.out.println(dao);
	}
	
	@Test
	public void createTest() throws Exception {
		
		dao = new MemberDAOImpl();
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user22");
		vo.setUserpw("user22");
		vo.setNick("유저이이");
		
		System.out.println(vo);
		
		dao.create(vo);
		
		System.out.println(vo);
	}

}
