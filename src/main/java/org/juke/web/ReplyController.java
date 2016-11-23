package org.juke.web;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.juke.domain.ReplyVO;
import org.juke.service.ReplyServiceImpl;
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

	@Inject
	ReplyServiceImpl service;
	
	@GetMapping("/list/{page}")	
	public List<ReplyVO> replyList(@PathVariable("page") Integer page) throws Exception{
		
		return service.list();
	}
	
	@PostMapping("/register")	
	public void replyRegister(ReplyVO vo) throws Exception{
		
		service.register(vo);
	
	}
	
	@DeleteMapping("/delete/{rno}")
	public void replyDelete(@PathVariable("rno") Integer rno) throws Exception{
	
		service.delete(rno);
	}
}
