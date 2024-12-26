package com.tms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.tms.model.Package;
import com.tms.model.Customer;
import com.tms.util.DBUtil;
/**
 * Implementation of the `CustomerRepo` interface. This class provides methods to interact
 * with the database for performing CRUD (Create, Read, Update, Delete) operations on the `Customer` entities.
 * <p>
 * This class uses JDBC to execute SQL queries and updates in the database for managing customer data.
 * It also uses a `PackageRepo` instance to handle the retrieval of package details for customers.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */

public class CustomerRepoImpl implements CustomerRepo {
	Customer customer = null;
	PackageRepo packageRepo = new PackageRepoImpl();
	/**
     * Inserts a new customer into the database.
     * 
     * @param customer The `Customer` object containing the details to be inserted.
     * @return `true` if the customer was successfully inserted, `false` otherwise.
     */
	public boolean doInsertCustomer(Customer customer) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Tourism_Customer values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getCustomerName());
			ps.setInt(3, customer.getPack().getPackageId());

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Insert query not Executed");
		}
		return flag;
	}
	 /**
     * Deletes an existing customer from the database.
     * 
     * @param id The ID of the customer to be deleted.
     * @return `true` if the customer was successfully deleted, `false` otherwise.
     */
	public boolean doDeleteCustomer(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete Tourism_Customer where custid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete query not Executed");
		}
		return flag;
	}
	/**
     * Updates the details of an existing customer in the database.
     * 
     * @param customer The `Customer` object with the updated details.
     * @return `true` if the customer was successfully updated, `false` otherwise.
     */
	public boolean doUpdateCustomer(Customer customer) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update Tourism_Customer set  CustName = ?,PackId = ? where CustId =?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, customer.getCustomerName());
			ps.setInt(2, customer.getPack().getPackageId());
			ps.setInt(3, customer.getCustomerId());

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Update query not Executed");
		}
		return flag;
	}
	/**
     * Finds a customer by their unique ID from the database.
     * 
     * @param id The ID of the customer to be retrieved.
     * @return A `Customer` object if found, `null` if no customer exists with the given ID.
     */

	public Customer doFindCustomer(int id) {

		int packageNo = 0;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Tourism_Customer where CustId = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt("CustId"));
				customer.setCustomerName(rs.getString("CustName"));
				packageNo = rs.getInt("PackId");
				Package pack = packageRepo.doFindPackage(packageNo);
				customer.setPack(pack);
			}

		} catch (SQLException e) {
			System.out.println("Find query not Executed");
		}
		return customer;
	}
	/**
     * Retrieves all customers from the database.
     * 
     * @return A list of all `Customer` objects from the database.
     */

	public List<Customer> doFindAllCustomer() {
		List<Customer> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Tourism_Customer";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt("CustId"));
				customer.setCustomerName(rs.getString("CustName"));
				int packageNo = rs.getInt("PackId");
				Package pack = packageRepo.doFindPackage(packageNo);
				customer.setPack(pack);

				list.add(customer);
			}

		} catch (SQLException e) {
			System.out.println("FindAll query not Executed");
		}
		return list;
	}

}
