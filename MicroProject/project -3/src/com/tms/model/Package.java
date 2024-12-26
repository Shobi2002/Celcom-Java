package com.tms.model;

/**
 * The `Package` class represents a travel package in the tourism application.
 * <p>
 * This class holds details about a travel package, including its unique ID, name, and price.
 * It provides getter and setter methods to access and modify these details.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class Package {
	private int packageId;
	private String packageName;
	private int packagePrice;
	/**
     * Default constructor for the `Package` class.
     * <p>
     * Initializes a new `Package` object without setting any fields. This constructor
     * can be used when creating an empty `Package` object and setting the fields later.
     * </p>
     */
	public Package() {
		super();
	}
	 /**
     * Parameterized constructor for the `Package` class.
     * <p>
     * Initializes a new `Package` object with the specified package ID, name, and price.
     * </p>
     * 
     * @param packageId The unique identifier for the package.
     * @param packageName The name of the package.
     * @param packagePrice The price of the package.
     */

	public Package(int packageId, String packageName, int packagePrice) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packagePrice = packagePrice;
	}
	/**
     * Gets the unique identifier for the package.
     * 
     * @return The package ID.
     */

	public int getPackageId() {
		return packageId;
	}
	 /**
     * Sets the unique identifier for the package.
     * 
     * @param packageId The unique identifier to set.
     */

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	/**
     * Gets the name of the package.
     * 
     * @return The package name.
     */

	public String getPackageName() {
		return packageName;
	}
	 /**
     * Sets the name of the package.
     * 
     * @param packageName The name of the package to set.
     */

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	 /**
     * Gets the price of the package.
     * 
     * @return The package price.
     */

	public int getPackagePrice() {
		return packagePrice;
	}
	 /**
     * Sets the price of the package.
     * 
     * @param packagePrice The price of the package to set.
     */

	public void setPackagePrice(int packagePrice) {
		this.packagePrice = packagePrice;
	}
	/**
     * Returns a string representation of the `Package` object.
     * <p>
     * This method overrides the default `toString()` method to return a custom string
     * representation of the package, including the package ID, name, and price.
     * </p>
     * 
     * @return A string representation of the package.
     */

	@Override
	public String toString() {
		return "\nPackage [packId=" + packageId + ", packName=" + packageName + ", packPrice=" + packagePrice + "]";
	}

}
