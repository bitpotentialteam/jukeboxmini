package org.juke.mp3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.juke.domain.MusicVO;
import org.juke.util.ImageUtil;
import org.springframework.web.multipart.MultipartFile;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;

public class Mp3Agic {

	public MusicVO getMp3(MultipartFile file) throws Exception {
		
		MusicVO vo = new MusicVO();
		ImageUtil util = new ImageUtil();
		
		String imageName = util.setImageName(file);	
		
		
		Mp3File mp3file = new Mp3File("src/main/resources/mp3/" + imageName + ".mp3");	// mp3agic ����.
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

		byte[] imageData = id3v2Tag.getAlbumImage();	
		String mimeType = id3v2Tag.getAlbumImageMimeType();	

		Path mp3Path = Paths.get("C:\\Users\\SOAS\\git\\jukeboxmini\\src\\main\\resources\\images",
									(imageName+".mp3"));
		
		// jdk 7ver 이상부터 바이트 배열의 데이터를 저장 가능 (절대경로).
		imageData = Files.readAllBytes(mp3Path);

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
