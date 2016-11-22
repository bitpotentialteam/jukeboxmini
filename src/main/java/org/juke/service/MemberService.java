package org.juke.service;

import org.juke.domain.MemberVO;

public interface MemberService {
	
	
	public void signup(MemberVO vo) throws Exception;
	
	public void login(MemberVO vo) throws Exception;
}
