package com.tms.repo;

import java.util.List;

import com.tms.model.Package;
/**
 * The `PackageRepo` interface defines the operations for interacting with the data source
 * for `Package` entities in the tourism application.
 * <p>
 * This interface provides methods to perform CRUD (Create, Read, Update, Delete) operations
 * on package data. The implementation of this interface is responsible for interacting with 
 * the database or another form of data storage for package-related operations.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public interface PackageRepo {
	public boolean doInsertPackage(Package pack);

	public boolean doDeletePackage(int id);

	public boolean doUpdatePackage(Package pack);

	public Package doFindPackage(int id);

	public List<Package> doFindAllPackage();
}
