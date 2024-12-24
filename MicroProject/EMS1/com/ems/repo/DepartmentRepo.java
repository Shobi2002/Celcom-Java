package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

//storing Employee Object
/**
 * @author Shobana V
 * @version 1.1 
 * It is performing all the CRUD operations on list DB.
 */
public class DepartmentRepo {
	/**
	 * 
	 * @param employee
	 * @return boolean 
	 * It is performing create employee on list DB
	 */
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into shobana_department values (? ,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());  
			ps.setString(2, department.getDname());
			

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Insert Query not Executed");
		}
		return flag;
	}
	/**
	 * 
	 * @param id
	 * @return boolean 
	 * It is performing Delete employee on list DB
	 */
	public boolean doDeleteDepartment(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete shobana_department where dno = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);  
			
			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Delete Query not Executed"+e);
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean 
	 * It is performing update employee on list DB
	 */
	public boolean doUpdateDepartment(Department department) {
		
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update shobana_department set dname = ? where dno = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			
			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());  

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Update Query not Executed");
		}
		return flag;
		
	}

	/**
	 * 
	 * @param id
	 * @return Employee 
	 * It is performing Find employee on Map DB
	 */
	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from shobana_department where dno = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);  
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));
			}
			
		}catch(SQLException e) {
			System.out.println("Find Query not Executed");
		}
		return department;
	}
	/**
	 * 
	 * @return list
	 * It is display All employee
	 */
	public List<Department> doFindAllDepartment() {
		List<Department> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from shobana_department "; 
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Department department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));
				
				
				list.add(department);
			}
			
		}catch(SQLException e) {
			System.out.println("FindAll Query not Executed");
		}
		
		return list;
		
	}

}
