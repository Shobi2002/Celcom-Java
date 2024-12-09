/*Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
*/
package com.assessment;

class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	void display() {
		System.out.println("The Dog Name  : " + name);
		System.out.println("The Dog Breed : " + breed);

	}
}

public class ProblemTwo {

	public static void main(String[] args) {

		Dog dogone = new Dog("Jack", "Golden Retriever");
		Dog dogtwo = new Dog("Puppy", "German Shepherd");
		dogone.display();
		dogtwo.display();
		dogone.setName("Bruno");
		dogone.setBreed("Poodle");
		System.out.println("\n--------\nAfter Changing value using setter method\n--------\n");
		dogone.display();

	}

}
