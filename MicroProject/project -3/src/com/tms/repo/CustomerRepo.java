package com.tms.repo;

import java.util.List;

import com.tms.model.Customer;
/**
 * The `CustomerRepo` interface defines the operations for interacting with the data source
 * for `Customer` entities in the tourism application.
 * <p>
 * This interface provides methods for performing CRUD (Create, Read, Update, Delete) operations
 * on customer data. It is expected that the implementation of this interface will interact
 * with a database or another form of data storage.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public interface CustomerRepo {
	public boolean doInsertCustomer(Customer customer);

	public boolean doDeleteCustomer(int id);

	public boolean doUpdateCustomer(Customer customer);

	public Customer doFindCustomer(int id);

	public List<Customer> doFindAllCustomer();
}
