package com.capgemini.bnkmgt.test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.bnkmgt.dao.LoginDao;
import com.capgemini.bnkmgt.dao.LoginDaoImpl;
import com.capgemini.bnkmgt.dto.Login;

public class LoginDaoImplTest {
	LoginDao dao;

	@Before
	public void setUp() throws Exception {

		dao = new LoginDaoImpl();
	}

	@After
	public void tearDown() throws Exception {

		dao = null;
	}

	@Test
	public void testLoginUser() throws SQLException {
		Login login = new Login();
		login.setId("abhijeet");
		login.setPassword("singh");
		login.setUserType("Employee");

		assertTrue(dao.LoginUser(login));

		login.setId("ishaan");
		login.setPassword("singh");
		login.setUserType("Customer");
		assertTrue(dao.LoginUser(login));

		login.setId("prateek");
		login.setPassword("goel");
		login.setUserType("Customer");
		assertTrue(dao.LoginUser(login));

	}

}
