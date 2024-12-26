package com.tms.service;

import com.tms.model.Package;
/**
 * The `PackageService` interface defines the contract for package-related operations
 * in the tourism management application. It includes methods for adding, updating,
 * removing, and finding packages, along with validation for these operations.
 * <p>
 * The `PackageService` is responsible for performing business logic related to 
 * packages in the system. Each method validates the input data before interacting 
 * with the underlying repository and database to manage the package information.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public interface PackageService {
	
	public String addPackValidation(Package pack);
	public String removePackValidation(int id);
	public String updatePackValidation(Package pack);
	public String findPackValidation(int id);
	public String findAllPackageValidation();

}
