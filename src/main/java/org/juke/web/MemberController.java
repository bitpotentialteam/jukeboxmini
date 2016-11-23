package org.juke.web;

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

@Service
@CrossOrigin
@Controller
@RequestMapping("/member/*")
public class MemberController {

   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

   @PostMapping("/signup")
   public void signup(@RequestBody String userid, String userpw, String nick) {

      logger.info("vo" + userid + userpw+ nick);

     
   }

   @GetMapping("/login")
   public void getLogin() {
    
   }

   @PostMapping("/login")
   public void registPOST(String userid, String userpw, Model model){
     logger.info("인생 로그인");
     logger.info("userid" + userid);
     logger.info("userpw" + userpw);
    
      model.addAttribute("value",userid);
   }
   
   @PostMapping
   public void logout(){
      logger.info("인생 로그아웃");
   }
}