package org.juke.web;

import javax.inject.Inject;

import org.juke.domain.MemberVO;
import org.juke.service.MemberService;
import org.juke.service.MemberServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@CrossOrigin
@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	MemberService service = new MemberServiceImpl();

	@GetMapping("/signup")
	public void getSignup() throws Exception {

	}

	@PostMapping("/signup")
	
	public String signup( MemberVO vo) throws Exception {
		service.signup(vo);
		
		return "music/playlist";

	}

	@GetMapping("/login")
	public void getLogin() {

	}

	@PostMapping("/login")
	public String registPOST(MemberVO vo, Model model) throws Exception {
		service.login(vo);
		model.addAttribute("value", vo);
		
		return "music/playlist";

	}

	@PostMapping
	public void logout() {

	}
}