package com.capgemini.bnkmgt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection connection;

	/*static {
		try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/

	public static Connection myconnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
		return connection;
	}
}