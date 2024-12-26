package com.tms.model;
/**
 * The `Customer` class represents a customer in the tourism application.
 * <p>
 * A customer is identified by a unique customer ID, has a name, and is associated
 * with a specific travel package. This class provides methods to get and set
 * the customer's ID, name, and associated package.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class Customer {
	private int customerId;
	private String customerName;
	private Package pack;
	/**
     * Default constructor for the `Customer` class.
     * <p>
     * Initializes a new `Customer` object without setting any fields. This is typically used 
     * when creating an empty `Customer` object and setting fields later.
     * </p>
     */
	public Customer() {
		super();

	}
	/**
     * Parameterized constructor for the `Customer` class.
     * <p>
     * Initializes a new `Customer` object with the specified customer ID, name, and package.
     * </p>
     * 
     * @param customerId The unique identifier for the customer.
     * @param customerName The name of the customer.
     * @param pack The package associated with the customer.
     */
	
	public Customer(int customerId, String customerName, Package pack) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.pack = pack;
	}
	 /**
     * Gets the unique identifier for the customer.
     * 
     * @return The customer ID.
     */
	public int getCustomerId() {
		return customerId;
	}
	 /**
     * Sets the unique identifier for the customer.
     * 
     * @param customerId The unique identifier to set.
     */

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
     * Gets the name of the customer.
     * 
     * @return The customer's name.
     */

	public String getCustomerName() {
		return customerName;
	}
	 /**
     * Sets the name of the customer.
     * 
     * @param customerName The customer's name to set.
     */

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	 /**
     * Gets the package associated with the customer.
     * 
     * @return The customer's associated package.
     */

	public Package getPack() {
		return pack;
	}
	 /**
     * Sets the package associated with the customer.
     * 
     * @param pack The package to associate with the customer.
     */

	public void setPack(Package pack) {
		this.pack = pack;
	}
	/**
     * Returns a string representation of the `Customer` object.
     * <p>
     * This method overrides the default `toString()` method to return a custom string
     * representation of the customer, including the customer ID, name, and associated package ID.
     * </p>
     * 
     * @return A string representation of the customer.
     */
	
	@Override
	public String toString() {
		return "\nCustomer [custId=" + customerId + ", custName=" + customerName + ", pack=" + pack.getPackageId()
				+ "]";
	}

}
