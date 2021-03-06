package com.capgemini.bnkmgt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.bnkmgt.dto.Login;
import com.capgemini.bnkmgt.util.DatabaseUtil;

public class LoginDaoImpl implements LoginDao {

	Connection connection;
	PreparedStatement pst;
	ResultSet rs;

	public LoginDaoImpl() throws SQLException {
		connection = DatabaseUtil.myconnection();
	}

	@Override

	public boolean LoginUser(Login login) throws SQLException {
		pst = connection.prepareStatement("select * from login where id=? and password=? and usertype=?");
		pst.setString(1, login.getId());
		pst.setString(2, login.getPassword());
		pst.setString(3, login.getUserType());

		System.out.println(login);

		rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			
		return false;
	}

}
