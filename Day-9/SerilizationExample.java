package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

class Employee implements Serializable{
	//java Bean
	private int id;
	private String name;
	transient private double salary;
	//constructor 
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
public class SerilizationExample {

	public static void main(String[] args) throws Exception {
		
//		Employee emp1 = new Employee(101,"Shobana",20000);
//		//serialization
//		FileOutputStream fout = new FileOutputStream("D:\\Object.txt");
//		ObjectOutputStream objout = new ObjectOutputStream(fout);
//		
//		objout.writeObject(emp1);
//		objout.close();
//		fout.close();
//		 
//		System.out.println("Object copied Successfully to text file");
		
		//deserialization
		
		FileInputStream fin = new FileInputStream("D:\\Object.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		
		System.out.println("Object copied to the jvm Successfully ");
		
		System.out.println("Employee id : "+emp.getId());
		System.out.println("Employee name : "+emp.getName());
		System.out.println("Employee Salary : "+emp.getSalary());
	}
}
	


