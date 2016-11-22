package org.juke.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TimeDAO {

   @Inject
   private SqlSession sqlSession;
   
   public String getTime()throws Exception{
      
      return sqlSession.selectOne("org.juke.TimeMapper.getTime");
   }
   
}