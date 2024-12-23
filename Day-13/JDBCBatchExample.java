package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBatchExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step -1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step -2 :Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");
		DatabaseMetaData dbData = con.getMetaData();
		System.out.println(dbData.getDatabaseProductName());
		System.out.println(dbData.getDatabaseProductVersion());
		System.out.println(dbData.getDriverName());

		// step -3: Creating Statement
		String sql = "insert into shobi_employee values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step -4 :Executing the Query

		Object employee[][] = new Object[][] { { 601, "valan", 2000, 10 }, { 602, "kishore", 3000, 10 },
				{ 603, "ajay", 4000, 10 }, { 604, "naveen", 5000, 10 },

		};
		for (int i = 0; i < employee.length; i++) {

			ps.setInt(1, (Integer) employee[i][0]);
			ps.setString(2, (String) employee[i][1]);
			ps.setInt(3, (Integer) employee[i][2]);
			ps.setInt(4, (Integer) employee[i][3]);

			ps.addBatch();
		}

		ps.executeBatch();
		System.out.println("Record batched Successfully");

		ps.close();
		con.close();

	}
}