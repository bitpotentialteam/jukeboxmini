package org.juke.mp3;

import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.juke.domain.MusicVO;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;

public class Mp3Agic {

	public MusicVO getMp3(MusicVO vo) throws Exception {


		Mp3File mp3file = new Mp3File("src/main/resources/mp3/" + vo.getTitle() + ".mp3");	// mp3agic ¼±¾ð.
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

		byte[] imageData = id3v2Tag.getAlbumImage();	// imageName
		String mimeType = id3v2Tag.getAlbumImageMimeType();	//imageType

		String jacket = imageData.toString();

		vo.setJacket(jacket);
		vo.setImageType(mimeType);

		return vo;
		
	}

}
