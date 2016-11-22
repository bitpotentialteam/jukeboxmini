package org.juke.serviceTester;

import javax.inject.Inject;

import org.juke.domain.ReplyVO;
import org.juke.service.ReplyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ReplyTester {

	@Inject
	ReplyService service;

	@Test
	public void registerTest() throws Exception {
		ReplyVO vo = new ReplyVO();

		vo.setMno(4);
		vo.setUserid("user01");
		vo.setContent("Å°¿¹ÇìÇìÇìÂm ¸Þ·ÕÀÌ´Ù ÀÌ°Íµé¾Æ");

		service.register(vo);
	}

	@Test
	public void searchTest() throws Exception {
		System.out.println(service.search(4));
	}

	@Test
	public void deleteTest() throws Exception {
		service.delete(4);
	}

	@Test
	public void modifyTest() throws Exception {
		ReplyVO vo = new ReplyVO();
		vo.setRno(1);
		vo.setContent("°«È¿½Å Â¯Â¯¸Ç");
		service.modify(vo);
	}
}
