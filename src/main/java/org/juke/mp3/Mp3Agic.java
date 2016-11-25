package org.juke.mp3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.juke.domain.MusicVO;
import org.juke.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;

public class Mp3Agic {

	private static final Logger logger = LoggerFactory.getLogger(Mp3Agic.class);

	public MusicVO getMp3(MultipartFile file, String uploadName) throws Exception {
		
		MusicVO vo = new MusicVO();
		ImageUtil util = new ImageUtil();
		
		Mp3File mp3file = new Mp3File("C:\\jukebox\\" + uploadName);	// 어떤 mp3를?
		
		logger.info(mp3file.toString());
		
		ID3v2 id3v2Tag = mp3file.getId3v2Tag();

		String singer = id3v2Tag.getArtist();	// singer
		vo.setSinger(singer);

		String title = id3v2Tag.getTitle();	// title
		vo.setTitle(title);

		String album = id3v2Tag.getAlbum();	// album
		vo.setAlbum(album);

		String regDate = id3v2Tag.getYear();	// regDate

		DateFormat format = new SimpleDateFormat("yyyy");
		Date date = format.parse(regDate);
		vo.setRegdate(date);

//		String imageName = util.setImageName(file);	// 이미지 네임 저장
		String imageName = uploadName.substring(0,uploadName.length()-3)+"jpg";
				
		byte[] imageData = id3v2Tag.getAlbumImage();	
		String mimeType = id3v2Tag.getAlbumImageMimeType();	

		FileOutputStream fos = new FileOutputStream("C:\\jukebox\\"+imageName);
		FileInputStream fis = new FileInputStream("C:\\jukebox\\"+imageName);
		
		// image 추출 후 복사... --> (imageName)
		IOUtils.copy(fis, fos);
		
		fis.close();
		fos.close();
		
//		Path imagePath = Paths.get("C:\\jukebox\\",imageName);
		
		// jdk 7ver 이상부터 바이트 배열의 데이터를 저장 가능 (절대경로).
//		imageData = Files.readAllBytes(imagePath);

//		ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
//		BufferedImage bufferedImage = new ImageIO.read(inputStream);
//
//		ImageIO.write(bufferedImage, "jpg", new File("C:/saveImage/" + "fileNm"));

		
//		String jacket = imageData.toString();
//		vo.setJacket(jacket);
		vo.setImageType(mimeType);
		return vo;
	
		
	}

}
