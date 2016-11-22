package org.juke.web;

import javax.inject.Inject;

import org.juke.dao.TimeDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class TimeTester {

	@Inject
	TimeDAO dao;

	@Test
	public void test()throws Exception {
	
		System.out.println(dao.getTime());
		
	}

}
