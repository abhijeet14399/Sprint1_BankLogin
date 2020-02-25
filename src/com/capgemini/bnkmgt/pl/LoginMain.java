package com.capgemini.bnkmgt.pl;

import java.sql.SQLException;

import com.capgemini.bnkmgt.exception.LoginException;
import com.capgemini.bnkmgt.service.LoginService;
import com.capgemini.bnkmgt.service.LoginServiceImpl;

;

public class LoginMain {

	public static void main(String[] args) {

		try {
			LoginService loginService = new LoginServiceImpl();
			loginService.userLogin();

		} catch (SQLException | LoginException e) {
			System.err.println(e.getMessage());

			e.printStackTrace();
		}

	}
}
