package org.juke.util;

import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public class ImageUtil {
	
	
	public String setImageName(MultipartFile file){
		
		UUID uid = UUID.randomUUID();

		String fileName = file.getOriginalFilename();

		String uploadName = uid + "_" + fileName;
		
		return uploadName;
	}

}
