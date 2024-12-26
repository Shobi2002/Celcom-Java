package com.tms.view;

import java.util.Scanner;

import com.tms.model.Customer;
import com.tms.model.Package;
/**
 * The `CustomerView` class provides methods for interacting with the user
 * to manage customer data in the Tourism Management System (TMS). It includes
 * methods to insert, update, delete, and find customer information by reading
 * input from the console.
 * <p>
 * This class serves as the user interface for performing customer-related operations.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class CustomerView {
	static Scanner sc = new Scanner(System.in);
	static int customerId;
	static String customerName;
	static int packageId;
	/**
     * Prints the result message to the console.
     * 
     * @param result The result message to be printed.
     */
	public static void printResult(String result) {
		System.out.println(result);
	}
	/**
     * Prompts the user to enter customer details and returns a new `Customer` object
     * based on the input.
     * <p>
     * This method reads the customer's id, name, and the associated package id, and
     * returns a `Customer` object with the provided information.
     * </p>
     * 
     * @return A new `Customer` object populated with user inputs.
     */

	public static Customer insertCustomerView() {
		System.out.println("Enter Customer Id :");
		customerId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name :");
		customerName = sc.nextLine();
		System.out.println("Enter Package Id:");
		packageId = sc.nextInt();

		Package pack = new Package();
		pack.setPackageId(packageId);

		Customer customer = new Customer(customerId, customerName, pack);

		return customer;
	}
	/**
     * Prompts the user to enter a customer ID and returns the entered customer ID.
     * 
     * @return The customer ID entered by the user.
     */
	public static int deleteCustomerView() {
		System.out.println("Enter Customer Id :");
		customerId = sc.nextInt();
		return customerId;
	}
	/**
     * Prompts the user to enter the details of a customer to be updated and returns
     * a new `Customer` object with the updated information.
     * <p>
     * This method allows the user to modify the customer ID, name, and associated
     * package ID.
     * </p>
     * 
     * @return A new `Customer` object with updated information.
     */
	public static Customer updateCustomerView() {
		System.out.println("Enter customer Id to update:");
		customerId = sc.nextInt();
		System.out.println("Enter customer Name to update :");
		customerName = sc.next();
		System.out.println("Enter Package Id to update :");
		packageId = sc.nextInt();

		Package pack = new Package();
		pack.setPackageId(packageId);

		Customer customer = new Customer(customerId, customerName, pack);

		return customer;
	}
	/**
     * Prompts the user to enter a customer ID and returns the entered customer ID.
     * 
     * @return The customer ID entered by the user.
     */
	public static int findCustomerView() {
		System.out.println("Enter Customer Id :");
		customerId = sc.nextInt();
		return customerId;
	}
}
