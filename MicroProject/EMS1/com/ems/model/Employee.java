package com.ems.model;

//bean class
/**
 * @author Shobana V
 * @version 1.1 
 * It is performing set the values and update the values
 */
public class Employee {
	private int eid;
	private String ename;
	private int esalary;
	private Department department;

	/**
	 * Default constructor
	 */
	public Employee() {
		super();

	}

	/**
	 * 
	 * @param eid
	 * @param ename
	 * @param esalary parameterized constructor
	 */
	public Employee(int eid, String ename, int esalary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", department=" + department
				+ "]";
	}

}
