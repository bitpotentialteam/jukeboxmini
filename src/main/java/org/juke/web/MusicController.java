package org.juke.web;

import java.util.ArrayList;
import java.util.List;

import org.juke.domain.MusicVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin	
@RestController 
@RequestMapping("/music/*")
public class MusicController {

	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);
	
	@GetMapping("/list/{page}")
	public List<MusicVO> musicList(@PathVariable("page") Integer page){
		
		List<MusicVO> list = new ArrayList<MusicVO>();
		
		for (MusicVO musicVO : list) {
			list.add(musicVO);
		}
		
		return list;
	}
	
	@GetMapping("/view/{mno}")
	public MusicVO musicView(@PathVariable("mno") Integer mno){
		
		return null;
	}
	
	
	@PostMapping("/register")
	public void musicRegister(MusicVO vo){
		
	}
	
	@PutMapping
	@PatchMapping("/modify/{mno}")
	public void musicModify(MusicVO vo){
		
	}
	
	@DeleteMapping("/delete/{mno}")
	public void musicDelete(@PathVariable("mno") Integer mno){
		
	}
}
