package org.juke.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.juke.web.MemberController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		logger.info("LoginInterceptor......");
		
		if(request.getMethod().equals("GET")){
			return;
		}
		
		HttpSession session = request.getSession();
		
		Object value = modelAndView.getModel().get("value");
		
		if(value != null){
			session.setAttribute("LOGIN", value);
		}
		
		
	}
	
}
