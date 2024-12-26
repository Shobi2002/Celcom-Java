package com.tms.service;

import com.tms.repo.PackageRepoImpl;
import com.tms.model.Package;
import com.tms.repo.PackageRepo;
/**
 * The `PackageServiceImpl` class provides the implementation of the business logic
 * for managing package-related operations in the tourism management system.
 * <p>
 * This class validates and performs operations like adding, updating, removing,
 * and finding packages in the system by interacting with the `PackageRepo` (repository) 
 * to persist the changes to the database.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class PackageServiceImpl {

	PackageRepo packageRepo = new PackageRepoImpl();
	/**
     * Validates the package data and adds it to the system if valid.
     * <p>
     * This method performs validation on the `Package` object to ensure all required fields
     * are provided and valid before calling the repository to insert the package into the database.
     * </p>
     * 
     * @param pack The `Package` object to be added.
     * @return A string message indicating the result of the operation (success or failure).
     */
	public String addPackValidation(Package pack) {

		String result;

		if (pack == null) {
			result = "Package Object is Null";
		} else if (pack.getPackageId() == 0 || pack.getPackageName() == null || pack.getPackagePrice() == 0) {
			result = "Invalid Package ";
		} else {
			boolean flag = packageRepo.doInsertPackage(pack);
			if (flag) {
				result = "Package Object Saved";
			} else {
				result = "Package Object not Saved";
			}
		}
		return result;
	}
	/**
     * Validates and removes a package from the system based on the package ID.
     * <p>
     * This method checks if the package ID is valid before calling the repository to delete the package 
     * from the database.
     * </p>
     * 
     * @param id The ID of the package to be deleted.
     * @return A string message indicating the result of the operation (success or failure).
     */

	public String removePackValidation(int id) {

		String result;

		if (id == 0) {
			result = "Invalid Package Id";
		} else {
			boolean flag = packageRepo.doDeletePackage(id);
			if (flag) {
				result = "Package Object Deleted";
			} else {
				result = "Package Object not Deleted";
			}
		}
		return result;
	}
	 /**
     * Validates the package data and updates the package details in the system.
     * <p>
     * This method checks if the `Package` object is valid (i.e., not null and with valid fields) 
     * before updating the package information in the database.
     * </p>
     * 
     * @param pack The `Package` object with updated details.
     * @return A string message indicating the result of the operation (success or failure).
     */
	public String updatePackValidation(Package pack) {

		String result;

		if (pack == null) {
			result = "Package Object is Null";
		} else if (pack.getPackageId() == 0 || pack.getPackageName() == null || pack.getPackagePrice() == 0) {
			result = "Invalid Package ";
		} else {
			boolean flag = packageRepo.doUpdatePackage(pack);
			if (flag) {
				result = "Package Object Updated";
			} else {
				result = "Package Object not Found";
			}
		}
		return result;
	}
	/**
     * Validates the package ID and retrieves the package details from the system.
     * <p>
     * This method checks if the provided package ID is valid before querying the database to retrieve the package.
     * If found, it returns the package details as a string.
     * </p>
     * 
     * @param id The ID of the package to be retrieved.
     * @return A string message containing the package's details or an error message if the package is not found.
     */
	public String findPackValidation(int id) {

		String result;

		if (id == 0) {
			result = "Invalid Package Id";
		} else {
			Package pack = packageRepo.doFindPackage(id);
			if (pack != null) {
				result = pack.toString();
			} else {
				result = "Package Object not found";
			}
		}
		return result;
	}
	 /**
     * Retrieves and returns all packages from the system.
     * <p>
     * This method queries the repository for all available packages in the database
     * and returns their details as a string.
     * </p>
     * 
     * @return A string message containing the details of all packages or an error message if no packages are found.
     */

	public String findAllPackageValidation() {
		return packageRepo.doFindAllPackage().toString();
	}
}
