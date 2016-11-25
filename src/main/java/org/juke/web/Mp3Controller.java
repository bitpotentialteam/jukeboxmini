package org.juke.web;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.juke.domain.MusicVO;
import org.juke.mp3.Mp3Agic;
import org.juke.service.MusicServiceImpl;
import org.juke.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/music/*")
@Controller
public class Mp3Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mp3Controller.class);

	@PostMapping("/uploadFile")
	@ResponseBody 
	public MusicVO uploadFile(MultipartFile file, Model model) throws Exception {

		MusicServiceImpl service = new MusicServiceImpl();
		Mp3Agic mp3 = new Mp3Agic();
		ImageUtil util = new ImageUtil();
		
		String uploadName = util.setImageName(file);
		logger.info(uploadName);

		FileOutputStream fos = new FileOutputStream("C:\\jukebox\\" + uploadName);
		logger.info("fos:"+fos);
		
		IOUtils.copy(file.getInputStream(), fos);
		logger.info("copy");  
		
		MusicVO vo = mp3.getMp3(file, uploadName);
		logger.info("mp3 end");
		
		fos.close();

		return vo;
	}

	@GetMapping(value = "/show", produces = { "image/jpg", "image/jpeg", "image/png", "image/gif" })
	public @ResponseBody byte[] show(String name) throws Exception {

		InputStream in = new FileInputStream("C:\\zzz\\" + name);

		return IOUtils.toByteArray(in);

	}

}