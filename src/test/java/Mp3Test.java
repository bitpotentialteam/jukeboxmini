import org.juke.domain.MusicVO;
import org.juke.mp3.Mp3Agic;
import org.junit.Before;
import org.junit.Test;

public class Mp3Test {

	Mp3Agic mp3;
	
	@Before
	public void setUp(){
		mp3 = new Mp3Agic();
	}
	
	
	@Test
	public void mp3AgicTest() throws Exception {
		
		MusicVO vo = new MusicVO();
		
		vo.setTitle("TT");
		
		mp3.getMp3(vo);
		
		System.out.println("Album : " + vo.getAlbum());
		System.out.println("Jacket : " +vo.getJacket());
		System.out.println("Singer : " +vo.getSinger());
		System.out.println("RegDate : " +vo.getRegdate());
		System.out.println("Title : " +vo.getTitle());
		System.out.println("MineType : " +vo.getImageType());

	}
	
	
}
