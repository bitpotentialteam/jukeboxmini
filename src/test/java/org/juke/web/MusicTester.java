package org.juke.web;

import org.juke.dao.MusicDAO;
import org.juke.domain.MusicVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MusicTester {
	
	@Autowired
	private MusicDAO dao;
	

	@Test
	public void createTest() throws Exception{
		
		MusicVO vo = new MusicVO();
	
		vo.setTitle("testTitle");
		vo.setSinger("testSinger");
		vo.setAlbum("testAlbum");
		vo.setJacket("1111tset");
		vo.setUserid("user03");
		
		System.out.println(vo);

		
		dao.create(vo);
	}
}
