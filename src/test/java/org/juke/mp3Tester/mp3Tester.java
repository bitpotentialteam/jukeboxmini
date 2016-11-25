package org.juke.mp3Tester;

import java.io.File;
import java.io.FileOutputStream;

import org.juke.domain.MusicVO;
import org.juke.mp3.Mp3Agic;
import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;

public class mp3Tester {
	
	Mp3Agic mp3 = new Mp3Agic();
	MusicVO vo = new MusicVO();

	@Test
	public void test() throws Exception {
		
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\SOAS\\git\\jukeboxmini\\src\\main\\resources\\mp3\\TT.mp3");

		MultipartFile file = ;
		
		mp3.getMp3(file);
		
		System.out.println(vo.getAlbum());
		System.out.println(vo.getJacket());
		System.out.println(vo.getTitle());
		System.out.println(vo.getImageType());
		System.out.println(vo.getSinger());
	}

}
