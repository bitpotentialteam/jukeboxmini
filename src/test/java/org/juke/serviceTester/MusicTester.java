package org.juke.serviceTester;

import javax.inject.Inject;

import org.juke.domain.MusicVO;
import org.juke.service.MusicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MusicTester {

	@Inject
	MusicService service;

	@Test
	public void registerTest() throws Exception {
		MusicVO vo = new MusicVO();

		vo.setTitle("야생화");
		vo.setSinger("갓효신");
		vo.setAlbum("야생화");
		vo.setJacket("효신갓");
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
		vo.setSinger("트와이스");
		vo.setAlbum("미나");
		vo.setJacket("모모");
		service.modify(vo);

	}

}
