package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			// Step-1 : Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step-2 :Making Connection With Database
			con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training",
					"Celcom123");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not connect with driver");
		} catch (SQLException e) {
			System.out.println("Could not connect with Database");
		}
		return con;
	}

}
