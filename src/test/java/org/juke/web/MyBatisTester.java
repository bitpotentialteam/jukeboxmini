package org.juke.web;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class MyBatisTester {

	private SqlSessionFactory session;
	
	@Before
	public void setUp() throws Exception {
	
		System.out.println("---------SET UP---------");
		String resource = "classpath:/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		session = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
