package org.juke.web;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		
		return "redirect:../music/playlist";

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
			
			return "redirect:../music/playlist";

		} else {
			return "redirect:../member/login";
		}
		
		 

	}

	@GetMapping
	public String logout(HttpSession session) {
		
		session.removeAttribute("LOGIN");
		session.invalidate();
		
		return "redirect:../music/playlist";

	}
	

	@PostMapping(value = "/checkid")
	@ResponseBody
	public int checkid(HttpServletRequest req, HttpServletResponse res, MemberVO vo, Model model) throws Exception {

//		PrintWriter out = res.getWriter();
		try {

			// 넘어온 ID를 받는다.
			//String userid = (req.getParameter("userid") == null) ? "" : String.valueOf(req.getParameter("userid"));

			logger.info("-------------------------------");
			logger.info(""+req.getParameter("userid"));

			
			if(req.getParameter("userid") != null){
	
				int chkPoint = service.checkid(vo);
				logger.info(""+chkPoint);

				model.addAttribute("chkPoint", chkPoint);
				
				return chkPoint;
				
//				out.print(chkPoint);
//				out.flush();
//				out.close();
			}
			//vo.setUserid(userid.trim());

		} catch (Exception e) {
			e.printStackTrace();
//			out.print("1");
		}
		return 0;
	}
}