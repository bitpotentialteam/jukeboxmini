package org.juke.web;

import java.util.List;

import javax.inject.Inject;

import org.juke.domain.MusicVO;
import org.juke.service.MusicService;
import org.juke.service.MusicServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping("/music/*")
public class MusicController {

	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);

	@Inject
	MusicService service = new MusicServiceImpl();

	@GetMapping("/list/{page}")
	public List<MusicVO> musicList(@PathVariable Integer page) throws Exception {

		return service.list(page);
	}

	@GetMapping("/view/{mno}")
	public MusicVO musicView(@PathVariable("mno") Integer mno) throws Exception {

		return service.search(mno);
	}
	
	@GetMapping("/register")
	public void musicRegister() throws Exception {
	
	}

	@PostMapping("/register")
	public void musicRegister(@RequestBody MusicVO vo) throws Exception {
		service.register(vo);
	}

	@PostMapping("/modify/{mno}")
	public void musicModify(@PathVariable("mno") Integer mno, MusicVO vo) throws Exception {

		service.modify(vo);

	}

	@DeleteMapping("/delete/{mno}")
	public void musicDelete(@PathVariable("mno") Integer mno) throws Exception {
		service.delete(mno);
	}

	@PostMapping("/playlist")
	public void playList() throws Exception {
	}
	
	@GetMapping("/playlist")
	public void getPlayList(Model model) throws Exception {
		
		model.addAttribute("list", service.list(1));
	}

}