
/*Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
*/
package com.assessment;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

		display();
	}

	void display() {
		System.out.println("The Person Name  : " + name);
		System.out.println("The Person Age   : " + age);

	}
}

public class ProblemOne {

	public static void main(String[] args) {

		Person personone = new Person("shobana", 22);

		Person persontwo = new Person("puviarasi", 23);

	}

}
