package org.juke.web;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String postLogin (MemberVO vo, Model model, HttpSession session) throws Exception {
		
		MemberVO login = service.login(vo);
		

		
		if (login != null) {
			model.addAttribute("value", vo);
			session.setAttribute("LOGIN", vo);
			
			return "music/playlist";

		} else {
			return "member/login";
		}
		
		 

	}

	@GetMapping
	public String logout(HttpSession session) {
		
		session.removeAttribute("LOGIN");
		session.invalidate();
		
		return "member/login";

	}
}