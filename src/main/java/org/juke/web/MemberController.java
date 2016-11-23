package org.juke.web;

import javax.inject.Inject;

import org.juke.domain.MemberVO;
import org.juke.service.MemberService;
import org.juke.service.MemberServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/member/*")
public class MemberController {

   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
   
   @Inject
   MemberService service = new MemberServiceImpl();
   
   
   
   @PostMapping("/signup")
   public void signup(MemberVO vo) throws Exception {
	   service.signup(vo);
   }

   @GetMapping("/login")
   public void getLogin() {
	   
   }

   @PostMapping("/login")
   public void registPOST(MemberVO vo, Model model) throws Exception{
	  service.login(vo);
      model.addAttribute("value", vo);
   }
   
   @PostMapping
   public void logout(){
     
   }
}