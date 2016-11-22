package org.juke.web;

import org.juke.dao.MusicDAO;
import org.juke.domain.MusicVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MusicTester {
	
	@Autowired
	private MusicDAO dao;
	

	@Test
	public void createTest() throws Exception{
		
		MusicVO vo = new MusicVO();
	
		vo.setTitle("testTitle2");
		vo.setSinger("testSinger2");
		vo.setAlbum("testAlbum2");
		vo.setJacket("1111tset2");
		vo.setUserid("user03");
		
		System.out.println(vo);

		dao.create(vo);
	}
	
	
	@Test
	public void readTest() throws Exception{

		System.out.println(dao.read(1));
	}
	
	
	@Test
	public void deleteTest() throws Exception{

		dao.delete(2);
	}
	
	@Test
	public void updateTest() throws Exception{
		
		MusicVO vo = new MusicVO();
	
		vo.setMno(1);
		vo.setTitle("test");
		vo.setSinger("test");
		vo.setAlbum("test");
		vo.setJacket("111");

		dao.update(vo);
	}
	
	
	@Test
	public void listTest() throws Exception{
		
		MusicVO vo = new MusicVO();
		System.out.println(vo);

		dao.create(vo);
	}
}
