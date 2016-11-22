package org.juke.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class AbstractDAO<E, K> implements GenericDAO<E, K> {

	
	@Inject
	protected SqlSession sqlSession;
	
	protected String NAME;
	
	
	
	@Override
	public void create(E vo) throws Exception {
		
		sqlSession.insert(NAME+".create", vo);
		
	}

	
	@Override
	public E read(K key) throws Exception {
		
		return sqlSession.selectOne(NAME + ".read", key);
	}

	
	@Override
	public void update(E vo) throws Exception {
		
		sqlSession.update(NAME + ".update", vo);
	}
	

	@Override
	public void delete(K key) throws Exception {
		
		sqlSession.delete(NAME + ".delete", key);
	}
	

	@Override
	public List<E> list(K key) throws Exception {
		
		List<E> list = new ArrayList<E>();
		
		list = sqlSession.selectList(NAME + ".list", key);
		
		return list;
		
	}
	
	
	@Override
	public int getCount(K key) throws Exception {
		
		return sqlSession.delete(NAME + ".count", key);
	}
	
}
