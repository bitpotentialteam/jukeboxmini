package org.juke.serviceTester;

import javax.inject.Inject;

import org.juke.domain.MemberVO;
import org.juke.service.MemberService;
import org.juke.service.MemberServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberTester {

	private static final Logger logger = LoggerFactory.getLogger(MemberTester.class);
	
	@Inject
	MemberService service;

	@Test
	public void signupTest() throws Exception{
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user01dfg");
		vo.setUserpw("user01111");
		vo.setNick("하하하ㅏ");
		
		service.signup(vo);
	}
	

}
