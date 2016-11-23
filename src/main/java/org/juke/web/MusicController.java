package org.juke.web;

import java.util.List;

import javax.inject.Inject;

import org.juke.domain.MusicVO;
import org.juke.service.MusicService;
import org.juke.service.MusicServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin   
@RestController 
@RequestMapping("/music/*")
public class MusicController {

   private static final Logger logger = LoggerFactory.getLogger(MusicController.class);
   
   @Inject
   MusicService service = new MusicServiceImpl();
   
   @GetMapping("/list/{page}")
   public List<MusicVO> musicList(@PathVariable Integer page) throws Exception{
      
      return service.list(page);
   }
   
   @GetMapping("/view/{mno}")
   public MusicVO musicView(@PathVariable("mno") Integer mno) throws Exception{
      
      return service.search(mno);
   }
   
   
   @PostMapping("/register")
   public void musicRegister(MusicVO vo) throws Exception{
      service.register(vo);
   }
   
   @PutMapping("/modify/{mno}")
   @PatchMapping ("/modify/{mno}")
   public void musicModify(MusicVO vo) throws Exception{
      service.modify(vo);
   }
   
   @DeleteMapping("/delete/{mno}")
   public void musicDelete(@PathVariable("mno") Integer mno) throws Exception{
      service.delete(mno);
   }
}