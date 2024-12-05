package com.day2;

//class and object
class Employee {
	int empid;
	String empname;
	float salary;

	Employee(int empid, String empname, float salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee id:" + empid);
		System.out.println("Employee Name:" + empname);
		System.out.println("Employee Salary:" + salary);
		System.out.println("-------------------------");
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		Employee shobana = new Employee(105, "shobana", 30000);
		shobana.display();
		Employee pragathy = new Employee(106, "pragthy", 30000);
		pragathy.display();
		Employee hema = new Employee(107, "hema", 30000);
		hema.display();

	}

}
