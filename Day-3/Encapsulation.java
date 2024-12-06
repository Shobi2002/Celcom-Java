package com.day3;

class Employee {
	private int empId;
	private String empName;
	private double salary;

	/*public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

		display();
	}*/

	/**
	 * @return
	 */
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void display() {

		System.out.println("The Employee Id:" + empId);
		System.out.println("The Employee Name:" + empName);
		System.out.println("The Employee salary:" + salary);
		System.out.println("----------------------------");

	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Employee shobana = new Employee();
		shobana.display();
		shobana.setEmpId(101);
		shobana.setEmpName("shobana");
		shobana.setSalary(50000);
		shobana.display();

	}

}
