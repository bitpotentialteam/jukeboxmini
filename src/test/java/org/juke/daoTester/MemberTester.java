package org.juke.daoTester;

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
	private MemberDAOImpl dao;

	@Test
	public void daoTest() throws Exception{
		System.out.println(dao);
	}

	
	@Test
	public void createTest() throws Exception {
		
		MemberVO vo = new MemberVO();
		
		vo.setUserid("usertest3");
		vo.setUserpw("usertest3");
		vo.setNick("ftest2");
		//�����
		System.out.println(vo);
		
		dao.create(vo);
		
		System.out.println(vo);
	}
	
	@Test
	public void readTest() throws Exception {
		
		MemberVO vo = new MemberVO();
		
	}
	

}
