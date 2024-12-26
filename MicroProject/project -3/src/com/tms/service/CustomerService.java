package com.tms.service;

import com.tms.model.Customer;
/**
 * The `CustomerService` interface defines methods for performing various validation and 
 * business logic operations related to `Customer` entities in the tourism application.
 * This interface serves as the contract for managing customer-related operations, 
 * including adding, removing, updating, and retrieving customer details.
 * <p>
 * The implementation of this interface should provide the necessary logic to validate
 * and handle customer-related data. It interacts with the `CustomerRepo` and possibly other 
 * services to ensure business rules are applied during each operation.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public interface CustomerService {
	public String addCustomerValidation(Customer customer);
	public String removeCustomerValidation(int id);
	public String updateCustomerValidation(Customer customer);
	public String findCustomerValidation(int id);
	public String findAllCustomerValidation();
	
}
