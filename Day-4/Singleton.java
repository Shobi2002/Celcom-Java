package com.day4;

class Employee {
	private static Employee emp = null;
	
	private Employee() {
		System.out.println("Hello");
	}
	

	public static Employee getEmployee() {
		if (emp == null) {
			emp = new Employee();
		} else {
			emp = null;
		}
		return emp;
	}

	public void display() {
		System.out.println("Hi Shobana");
	}
}

public class Singleton {

	public static void main(String[] args) {

		Employee emp = Employee.getEmployee();
		emp.display();
		System.gc();
		Runtime.getRuntime().gc();

	}

}
