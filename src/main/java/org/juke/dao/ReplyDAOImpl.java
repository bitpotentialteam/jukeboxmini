package org.juke.dao;

import org.juke.domain.ReplyVO;

public class ReplyDAOImpl extends AbstractDAO<ReplyVO, Integer> implements ReplyDAO{


	public ReplyDAOImpl(){
		this.NAME = "org.juke.replyMapper";
	}
}
