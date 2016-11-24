package org.juke.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
	
	@GetMapping("/demo")
	public void demo() throws Exception{
		
	}

}
