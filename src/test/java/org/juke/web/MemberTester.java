package org.juke.web;


import org.juke.dao.MemberDAOImpl;
import org.juke.domain.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberTester {
	
	@Autowired
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
