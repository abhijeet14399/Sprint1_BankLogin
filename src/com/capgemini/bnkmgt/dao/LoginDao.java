package com.capgemini.bnkmgt.dao;
import java.sql.SQLException;

import com.capgemini.bnkmgt.dto.Login;



public interface LoginDao {

	public boolean LoginUser(Login login)  throws SQLException;
	
	
}

