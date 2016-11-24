package org.juke.dao;

import java.util.List;

import org.juke.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl extends AbstractDAO<MemberVO, String> implements MemberDAO {

	public MemberDAOImpl() {
		this.NAME = "org.juke.MemberMapper";

	}

	public MemberVO login(MemberVO vo) throws Exception {

		return sqlSession.selectOne(NAME + ".login", vo);
	}

}
