package com.capgemini.bnkmgt.service;



import java.sql.SQLException;

import com.capgemini.bnkmgt.exception.LoginException;

public interface LoginService {

	public void userLogin() throws LoginException, SQLException;
	
	
}


