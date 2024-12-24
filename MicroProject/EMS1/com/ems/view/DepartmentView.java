package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentView {
	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;
	


	public static Department insertDepartmentView() {
		System.out.println("Enter Department no and Department Name : ");
		dno = sc.nextInt();
		dname = sc.next();

		Department department = new Department(dno, dname);

		return department;

	}

  public static int deleteDepartmentView() {
		System.out.println("Enter Department Number :");
		return sc.nextInt();
	}

	public static Department updateDepartmentView() {
		System.out.println("Enter  Department no  and Department Name to update Department: ");
		dno = sc.nextInt();
		dname = sc.next();

		Department department = new Department(dno, dname);

		return department;
	
}

public static int findDepartmentView() {
	System.out.println("Enter Department no :");
	return sc.nextInt();
}

}
