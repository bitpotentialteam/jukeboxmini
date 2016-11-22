package org.juke.dao;

import org.juke.domain.MusicVO;
import org.springframework.stereotype.Repository;

@Repository
public class MusicDAOImpl extends AbstractDAO<MusicVO, Integer> implements MusicDAO{
	
	
	public MusicDAOImpl(){
		this.NAME = "org.juke.MusicMapper";
		
	}
	

}
