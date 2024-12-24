package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;
/**
 * @author Shobana V
 * @version 1.0
 * It is performing Validation of CRUD operation
 */
public class EmployeeService {
	// EmployeeRepo employeeRepo = new EmployeeRepo();//for list
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	/**
	 * 
	 * @param employee
	 * @return String
	 * It is validating Insert operation 
	 */
	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Saved";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String
	 * It is validating delete operation
	 */
	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee object Deleted";
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
	/**
	 * 
	 * @param employee
	 * @return String
	 * It is validating Update operation
	 * 
	 */

	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee Object Updated ";
			} else {
				result = "Employee Object Not Found ";
			}
		}
		return result;
	}
	/**
	 * 
	 * @param id
	 * @return String
	 * It is validating Find employee operation
	 */

	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
	/**
	 * 
	 * @return String
	 * It is validating all Employee list
	 */
	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}
}
