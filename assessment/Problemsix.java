/* Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
*/
package com.assessment;

class Employee {
	private String name;
	private String jobTitle;
	private float salary;

	public Employee(String name, String jobTitle, float salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return salary * 12;
	}

	void display() {
		System.out.println("Employee Name : " + name);
		System.out.println("Job Title     : " + jobTitle);
		System.out.println("Monthly Salary: " + salary);
		System.out.println("Annual Salary : " + calculateSalary());
	}
}

public class Problemsix {

	public static void main(String[] args) {

		Employee employee = new Employee("Shobana", "Software Engineer", 25000);
		employee.display();
		employee.setSalary(50000);
		System.out.println("\n-------\nAfter changing Value\n------");
		employee.display();
	}

}
