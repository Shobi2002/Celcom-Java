package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step -1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step -2 :Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training","Celcom123");

		// step -3: Creating Statement
		String sql = "insert into shobi_employee values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step -4:Executing the Query
		ps.setInt(1, 204);
		ps.setString(2, "sundhar");
		ps.setInt(3, 20000);
		ps.setInt(4, 10);
		
		
		int n = ps.executeUpdate();// Insert,Delete,Update Query

		if (n == 1) {
			System.out.println("Recored Inserted Successfully");
		} else {
			System.out.println("Employee Record Not Inserted");
		}
		// step -5 : Closing
		ps.close();
		con.close();

	}

}
