package org.juke.web;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {

	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);

	@PostMapping("/uploadFile")
	@ResponseBody // return값이 순수한 문자열임을 알려준다.
	public String uploadFile(MultipartFile file) throws Exception {

		UUID uid = UUID.randomUUID();

		String fileName = file.getOriginalFilename();

		String uploadName = uid + "_" + fileName;

		FileOutputStream fos = new FileOutputStream("C:\\zzz\\" + uploadName);

		IOUtils.copy(file.getInputStream(), fos);

		fos.close();

		return uploadName;
	}

	@GetMapping(value = "/show", produces = { "image/jpg", "image/jpeg", "image/png", "image/gif" })
	public @ResponseBody byte[] show(String name) throws Exception {

		InputStream in = new FileInputStream("C:\\zzz\\" + name);

		return IOUtils.toByteArray(in);

	}

}
