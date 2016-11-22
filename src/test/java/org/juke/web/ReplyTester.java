package org.juke.web;

import org.juke.dao.ReplyDAOImpl;
import org.juke.domain.ReplyVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ReplyTester {

	@Autowired
	ReplyDAOImpl dao;

	@Test
	public void test() throws Exception {
		
		ReplyVO vo = new ReplyVO();
		
		vo.setMno(1);
		vo.setUserid("user22");
		vo.setContent("TEST");
		
		dao.create(vo);
		
		
	}

}
