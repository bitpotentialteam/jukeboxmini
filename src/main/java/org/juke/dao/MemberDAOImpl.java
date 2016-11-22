package org.juke.dao;

import org.juke.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl extends AbstractDAO<MemberVO, String> implements MemberDAO {


	public MemberDAOImpl(){
		this.NAME = "org.juke.MemberMapper";
		
	}
	
	
	public boolean login(MemberVO vo)throws Exception{
	
		Object login = sqlSession.selectOne(NAME + ".login", vo);
		
		if(login!=null){
			return true;
			
		}else{
			return false;
		}
	}
	
}
