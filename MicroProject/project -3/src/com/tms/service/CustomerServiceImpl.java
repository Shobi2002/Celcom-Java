package com.tms.service;

import com.tms.model.Customer;
import com.tms.repo.CustomerRepoImpl;
/**
 * The `CustomerServiceImpl` class implements the `CustomerService` interface and provides 
 * business logic for customer management, including validation and CRUD operations.
 * This class interacts with the `CustomerRepoImpl` to perform database operations 
 * related to customers in the tourism application.
 * <p>
 * The methods in this class validate customer data and handle adding, updating, 
 * removing, and retrieving customer details from the system. It ensures that business 
 * rules (such as non-null fields and valid customer data) are applied before making 
 * any changes in the database.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class CustomerServiceImpl implements CustomerService {
	CustomerRepoImpl customerRepo = new CustomerRepoImpl();
	 /**
     * Validates and adds a new customer to the system.
     * <p>
     * This method checks if the `Customer` object is valid (i.e., not null and with valid fields) 
     * before calling the repository to insert the customer into the database.
     * </p>
     * 
     * @param customer The `Customer` object containing the details to be added.
     * @return A string message indicating the result of the operation (success or failure).
     */
	public String addCustomerValidation(Customer customer) {

		String result;

		if (customer == null) {
			result = "Customer Object is Null";
		} else if (customer.getCustomerId() == 0 || customer.getCustomerName() == null || customer.getPack().getPackageId() == 0) {
			result = "Invalid Customer Data ";
		} else {
			boolean flag = customerRepo.doInsertCustomer(customer);
			if (flag) {
				result = "Customer Object Saved";
			} else {
				result = "Customer Object not Saved";
			}
		}
		return result;
	}
	/**
     * Validates and removes an existing customer from the system by their ID.
     * <p>
     * This method checks if the provided ID is valid before calling the repository to delete the customer.
     * </p>
     * 
     * @param id The ID of the customer to be removed.
     * @return A string message indicating the result of the operation (success or failure).
     */

	public String removeCustomerValidation(int id) {

		String result;

		if (id == 0) {
			result = "Invalid Customer Id";
		} else {
			boolean flag = customerRepo.doDeleteCustomer(id);
			if (flag) {
				result = "Customer Object Deleted";
			} else {
				result = "Customer Object not Deleted";
			}
		}
		return result;
	}
	/**
     * Validates and updates an existing customer's details in the system.
     * <p>
     * This method checks if the `Customer` object is valid (i.e., not null and with valid fields) 
     * before calling the repository to update the customer in the database.
     * </p>
     * 
     * @param customer The `Customer` object containing the updated details.
     * @return A string message indicating the result of the operation (success or failure).
     */
	public String updateCustomerValidation(Customer customer) {

		String result;

		if (customer == null) {
			result = "Customer Object is Null";
		} else if (customer.getCustomerId() == 0 || customer.getCustomerName() == null || customer.getPack().getPackageId() == 0) {
			result = "Invalid Customer Data ";
		} else {
			boolean flag = customerRepo.doUpdateCustomer(customer);
			if (flag) {
				result = "Customer Object Updated";
		}
			else {
				result = "Customer Object not Found";
			}
		}
		return result;
	}
	/**
     * Validates and retrieves a customer's details by their ID.
     * <p>
     * This method checks if the provided customer ID is valid before retrieving the customer from the database.
     * </p>
     * 
     * @param id The ID of the customer to be retrieved.
     * @return A string message containing the customer's details or an error message if the customer is not found.
     */

	public String findCustomerValidation(int id) {

		String result;

		if (id == 0) {
			result = "Invalid Customer Id";
		} else {
			Customer customer = customerRepo.doFindCustomer(id);
			if (customer != null) {
				result = customer.toString();
			} else {
				result = "Customer Object not found";
			}
		}
		return result;
	}
	/**
     * Validates and retrieves all customers from the system.
     * <p>
     * This method fetches all customers from the database and returns their details as a string.
     * </p>
     * 
     * @return A string message containing a list of all customers or an error message if no customers are found.
     */
	public String findAllCustomerValidation() {
		return customerRepo.doFindAllCustomer().toString();
	}

}
