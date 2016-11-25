package org.juke.web;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.juke.mp3.Mp3Agic;
import org.juke.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {

	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);

	@PostMapping("/uploadFile")
	@ResponseBody // return���� ������ ���ڿ����� �˷��ش�.
	public String uploadFile(MultipartFile file) throws Exception {

//		UUID uid = UUID.randomUUID();
//
//		String fileName = file.getOriginalFilename();
//
//		String uploadName = uid + "_" + fileName;
		
		Mp3Agic mp3 = new Mp3Agic();
		ImageUtil util = new ImageUtil();
		
		String uploadName = util.setImageName(file);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SOAS\\git\\jukeboxmini\\src\\main\\resources\\" +
													uploadName + "\\mp3");

		IOUtils.copy(file.getInputStream(), fos);

		mp3.getMp3(file);
		
		fos.close();

		return uploadName;
	}

	@GetMapping(value = "/show", produces = { "image/jpg", "image/jpeg", "image/png", "image/gif" })
	public @ResponseBody byte[] show(String name) throws Exception {

		InputStream in = new FileInputStream("C:\\zzz\\" + name);

		return IOUtils.toByteArray(in);

	}

}
