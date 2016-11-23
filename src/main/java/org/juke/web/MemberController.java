package org.juke.web;

import javax.inject.Inject;

import org.juke.domain.MemberVO;
import org.juke.service.MemberServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping("/member/*")
public class MemberController {

   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

   @PostMapping("/signup")
   public String signup(@RequestBody MemberVO vo) {

      logger.info("vo" + vo);

      return "success";
   }

   @GetMapping("/login")
   public void getLogin() {
	 
   }

   @PostMapping("/login")
   public void registPOST(MemberVO vo, Model model) throws Exception{
      
      
     }
}