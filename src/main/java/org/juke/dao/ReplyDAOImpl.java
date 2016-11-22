package org.juke.dao;

import org.juke.domain.ReplyVO;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAOImpl extends AbstractDAO<ReplyVO, Integer> implements ReplyDAO{


	public ReplyDAOImpl(){
		this.NAME = "org.juke.ReplyMapper";
	}
}
