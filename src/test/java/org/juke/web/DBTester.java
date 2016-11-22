package org.juke.web;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.juke.dao.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBTester {

	@Inject
	private DataSource ds;
	

	@Test
	public void testDB() throws Exception {
		Connection con = ds.getConnection();
		System.out.println(con);
		con.close();
	}

	@Test
	public void testDBConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.0.32:1521:XE",
				"bit88",
				"bit88");

		System.out.println(con);
		con.close();

	}

}
