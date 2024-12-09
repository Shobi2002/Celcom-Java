/*Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
*/
package com.assessment;

//import java.lang.classfile.AnnotationValue.OfString;
import java.util.Arrays;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private String isbn;

	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String toString() {
		return " Title : " + title + " Author : " + author + " isbn : " + isbn;
	}

}

public class ProblemFive {

	private Book[] books;
	private int size;

	ProblemFive(int capacity) {
		books = new Book[capacity];
		size = 0;
	}

	public void addBook(Book book) {
		if (size < books.length) {
			books[size] = book;
			size++;
			System.out.println("Book added Successfully.\n");

		} else {
			System.out.println("Collection is full.Unable to add more Book");
		}

	}

	public void removeBook(String isbn) {
		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				for (int j = 0; j < size - 1; j++) {

					books[j] = books[j + 1];
				}

				books[size - 1] = null;
				size--;
				System.out.println("Book Removed Successfully\n");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Book with ISBN" + isbn + "not found");
		}
	}

	public void displayBooks() {
		if (size == 0) {
			System.out.println("No Book Found in the Collection.\n");
		} else {
			System.out.println(
					"--------------------------\n Available Books in the Library\n------------------------------");
			for (int i = 0; i < size; i++) {
				System.out.println(books[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the maximum number of books to Add in the collection :");
		int capacity = sc.nextInt();

		ProblemFive collection = new ProblemFive(capacity);

		while (true) {
			System.out.println("\nMenu");
			System.out.println("\n1.Add a Book");
			System.out.println("2.Remove a Book");
			System.out.println("3.Dispaly All");
			System.out.println("4.Exit");
			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (collection.size <= capacity) {
					System.out.println("Enter Title : ");
					String title = sc.next();
					System.out.println("Enter Author Name : ");
					String author = sc.next();
					System.out.println("Enter ISBN  : ");
					String isbn = sc.next();
					collection.addBook(new Book(title, author, isbn));
				} else {
					System.out.println("Collection is full cannot add More Books.");
				}
				break;
				
			case 2:
				System.out.println("Enter ISBN of the book to remove:");
				String removeIsbn = sc.next();
				collection.removeBook(removeIsbn);
				break;
			case 3:
				collection.displayBooks();
				break;
			case 4:
				System.out.println("Exiting program.");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice.Please try Again");

			}
		}

	}

}
