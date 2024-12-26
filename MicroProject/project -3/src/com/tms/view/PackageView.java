package com.tms.view;

import java.util.Scanner;
import com.tms.model.Package;

/**
 * The `CustomerView` class provides methods for interacting with the user to
 * manage customer data in the Tourism Management System (TMS). It includes
 * methods to insert, update, delete, and find customer information by reading
 * input from the console.
 * <p>
 * This class serves as the user interface for performing customer-related
 * operations.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class PackageView {
	static Scanner sc = new Scanner(System.in);
	static int packageId, packagePrice;
	static String packageName;

	/**
	 * Displays the main menu of the Tourism Management System, where the user can
	 * choose from various operations related to packages and customers.
	 * 
	 * @return The user's choice (as an integer) corresponding to the selected menu
	 *         option.
	 */
	public static int menu() {
		System.out.println("======Tourism Management======");
		System.out.println("1.Add Package");
		System.out.println("2.Delete Package");
		System.out.println("3.Update Packge");
		System.out.println("4.Find Package");
		System.out.println("5.View All Package");
		System.out.println("6.Add Customer");
		System.out.println("7.Remove Customer");
		System.out.println("8.Update Customer");
		System.out.println("9.Find Customer");
		System.out.println("10.View All Customer");
		System.out.println("11.Exit");
		System.out.println("Enter you Choice:");
		int choice = sc.nextInt();
		return choice;
	}

	/**
	 * Prints an error message indicating that the user's choice was invalid.
	 */
	public static void printInvalid() {
		System.out.println("Invalid Choice");
	}

	/**
	 * Prompts the user to decide whether they want to continue performing more
	 * actions. The method returns the user's response.
	 * 
	 * @return The user's response as a string, either "yes" or "No".
	 */
	public static String continues() {
		System.out.println("Do you Want to Continue [yes | No ] : ");
		return sc.next();
	}

	/**
	 * Prints the result message to the console.
	 * 
	 * @param result The result message to be printed.
	 */
	public static void printResult(String result) {
		System.out.println(result);
	}

	/**
	 * Prompts the user to input details for a new package (ID, name, and price) and
	 * returns a `Package` object populated with the provided information.
	 * 
	 * @return A new `Package` object with the user's input.
	 */
	public static Package insertPackageView() {
		System.out.println("Enter Package Id :");
		packageId = sc.nextInt();
		System.out.println("Enter Package Name :");
		packageName = sc.next();
		System.out.println("Enter Package Price");
		packagePrice = sc.nextInt();

		Package pack = new Package(packageId, packageName, packagePrice);

		return pack;
	}

	/**
	 * Prompts the user to input a package ID for deletion and returns the entered
	 * ID.
	 * 
	 * @return The package ID entered by the user.
	 */
	public static int deletePackageView() {
		System.out.println("Enter Package Id :");
		packageId = sc.nextInt();
		return packageId;
	}

	/**
	 * Prompts the user to input updated package details (ID, name, and price) and
	 * returns a `Package` object with the updated information.
	 * 
	 * @return A new `Package` object with the updated details.
	 */

	public static Package updatePackageView() {
		System.out.println("Enter Package Id to update:");
		packageId = sc.nextInt();
		System.out.println("Enter Package Name to update :");
		packageName = sc.next();
		System.out.println("Enter Package Price to update :");
		packagePrice = sc.nextInt();

		Package pack = new Package(packageId, packageName, packagePrice);

		return pack;
	}

	/**
	 * Prompts the user to input a package ID to search for and returns the entered
	 * ID.
	 * 
	 * @return The package ID entered by the user.
	 */
	public static int findPackageView() {
		System.out.println("Enter Package Id :");
		packageId = sc.nextInt();
		return packageId;
	}
}
