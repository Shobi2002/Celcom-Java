package com.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * The `DBUtil` class is a utility class that provides a method to establish 
 * a connection to the database using JDBC. It encapsulates the details of 
 * connecting to the Oracle database and handles exceptions related to loading 
 * the database driver and establishing the connection.
 * <p>
 * This class is used throughout the application whenever a connection to 
 * the database is required. It follows the JDBC standard for establishing 
 * connections.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class DBUtil {
	/**
     * Establishes a connection to the Oracle database using JDBC.
     * <p>
     * This method loads the JDBC driver for Oracle (`oracle.jdbc.driver.OracleDriver`) 
     * and attempts to establish a connection to the database. It handles any exceptions 
     * related to loading the driver or connecting to the database.
     * </p>
     * 
     * @return A `Connection` object if the connection to the database is successful, 
     *         or `null` if the connection fails.
     */
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
