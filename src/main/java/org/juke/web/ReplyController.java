package org.juke.web;

import java.util.ArrayList;
import java.util.List;

import org.juke.domain.ReplyVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin	
@RestController 
@RequestMapping("/reply/*")
public class ReplyController {

	
	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);

	
	@GetMapping("/list/{page}")	// ´ñ±Û ¸®½ºÆ®.
	public List<ReplyVO> replyList(@PathVariable("page") Integer page){
		
		List<ReplyVO> list = new ArrayList<ReplyVO>();
		
		for (ReplyVO replyVO : list) {
			list.add(replyVO);
		}
		
		return list;
	}
	
	@PostMapping("/register")	// ´ñ±Û µî·Ï.
	public void replyRegister(){
		
	}
	
	@DeleteMapping("/delete/{num}")
	public void replyDelete(@PathVariable("num") Integer num){
		
	}
}
