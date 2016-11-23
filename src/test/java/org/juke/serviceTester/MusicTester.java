package org.juke.serviceTester;

import javax.inject.Inject;

import org.juke.domain.MusicVO;
import org.juke.service.MusicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MusicTester {

	private static final Logger logger = LoggerFactory.getLogger(MemberTester.class);

	
	@Inject
	MusicService service;

	@Test
	public void registerTest() throws Exception {
		MusicVO vo = new MusicVO();

		vo.setTitle("占쌩삼옙화");
		vo.setSinger("占쏙옙효占쏙옙");
		vo.setAlbum("占쌩삼옙화");
		vo.setJacket("효占신곤옙");
		vo.setUserid("user01");

		System.out.println(vo);
		service.register(vo);
	}

	@Test
	public void SearchTest() throws Exception {
		MusicVO vo = new MusicVO();
		System.out.println(service.search(3));

	}

	@Test
	public void deleteTest() throws Exception {
		service.delete(3);
	}

	@Test
	public void modifyTest() throws Exception {
		MusicVO vo = new MusicVO();

		vo.setMno(1);
		vo.setTitle("TT");
		vo.setSinger("트占쏙옙占싱쏙옙");
		vo.setAlbum("占싱놂옙");
		vo.setJacket("占쏙옙占�");
		service.modify(vo);

	}
	
	@Test
	public void listTest() throws Exception{
					
		
		logger.info("" + service.list(1));
		
	}

}
