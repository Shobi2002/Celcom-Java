import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class InputUser{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your employee id:");
	int id=sc.nextInt();
	System.out.println("Enter your employee name:");
	String name=sc.next();
	System.out.println("Enter your employee salary:");
	float salary=sc.nextFloat();

	System.out.println("Employee id: "+id);
	System.out.println("Employee name: "+name);
	System.out.println("Employee salary: "+salary);

			
}
}