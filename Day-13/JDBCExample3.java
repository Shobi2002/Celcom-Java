package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample3 {

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
		String sql = "select * from shobi_employee";
		PreparedStatement ps = con.prepareStatement(sql);

		// step -4:Executing the Query
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		for (int i = 1; i <= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}

		while (rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("esalary") + " "
					+ rs.getInt("dno"));

		}

		// step -5 : Closing
		rs.close();
		ps.close();
		con.close();

	}

}
