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
 * @version 1.1 It is performing all the CRUD operations on list DB.
 */
public class EmployeeRepo {
	/**
	 * 
	 * @param employee
	 * @return boolean It is performing create employee on list DB
	 */
	DepartmentRepo deptRepo = new DepartmentRepo();
	
	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into shobi_employee values (? ,?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEid());  
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());

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
	 * @return boolean It is performing Delete employee on list DB
	 */
	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete shobi_employee where eid = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);  
			
			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Delete Query not Executed");
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing update employee on list DB
	 */
	public boolean doUpdateEmployee(Employee employee) {
		
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update shobi_employee set ename = ?, esalary = ?, dno = ? where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			
			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());  

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
	public Employee doFindEmployee(int id) {
		Employee employee = null;
		int deptNo = 0;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from shobi_employee where eid = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);  
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				deptNo = rs.getInt("dno");
				Department department = deptRepo.doFindDepartment(deptNo);
				employee.setDepartment(department);
;			}
			
			
			
		}catch(SQLException e) {
			System.out.println("Find Query not Executed");
		}
		return employee;
	}
	/**
	 * 
	 * @return list
	 * It is display All employee
	 */
	public List<Employee> doFindAllEmployee() {
		List<Employee> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from shobi_employee "; 
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				int  deptNo = rs.getInt("dno");
				Department department = deptRepo.doFindDepartment(deptNo);
				employee.setDepartment(department);
				
				list.add(employee);
			}
			
		}catch(SQLException e) {
			System.out.println("FindAll Query not Executed");
		}
		
		return list;
		
	}

}
