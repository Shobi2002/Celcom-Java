package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class EmployeeView {
	static Scanner sc = new Scanner(System.in);
	static int eid, esalary, dno;
	static String ename, dname;


	public static Employee insertEmployeeView() {
		System.out.println("Enter Employee Id, Name, Salary and Department no : ");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		Employee employee = new Employee(eid, ename, esalary, department);

		return employee;

	}

  public static int deleteEmployeeView() {
		System.out.println("Enter Employee Id :");
		return sc.nextInt();
	}

	public static Employee updateEmployeeView() {
		System.out.println("Enter Employee Id,Name, Salary and Department no  to update employee: ");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		Employee employee = new Employee(eid, ename, esalary, department);

		return employee;
	
}

public static int findEmployeeView() {
	System.out.println("Enter Employee Id :");
	return sc.nextInt();
}

}
