package org.juke.dao;

import org.juke.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl extends AbstractDAO<MemberVO, String> implements MemberDAO {


	public MemberDAOImpl(){
		this.NAME = "org.juke.MemberMapper";
		
	}
	
	
	public void login(MemberVO vo)throws Exception{
	
		sqlSession.selectOne(NAME + ".login", vo);
		

	}
	
}
