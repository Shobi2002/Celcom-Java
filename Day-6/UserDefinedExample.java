package com.day6;
import java.util.Scanner;
class AgeException extends Exception {
    public String toString() {
        return "Invalid age for voting";
    }
}

class MyClass1 {
    // Checked Exception or throws keyword
    void myMethod(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException(); // Throw exception if age is less than 18
        }
        System.out.println("Age is valid for voting.");
    }

    void myMethod1() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your age : ");
    	int age = sc.nextInt();
        try {
            // Assuming you want to check a user age here.
             // Example: age is less than 18 to trigger exception
            myMethod(age);
        } catch (AgeException e) {
            // Handling the exception with a message and not causing recursion.
            System.out.println("Caught exception: " + e);
            // You could add logic here to ask the user for another input or stop the process.
        }
    }
}

public class UserDefinedExample {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1();
        obj1.myMethod1();  // Call the method that checks age and handles exception
    }
}
