package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;

/**
 * @author Shobana V
 * @version 1.1
 * It is performing Validation of CRUD operation
 */
public class EmployeeService {
	// EmployeeRepo employeeRepo = new EmployeeRepo();//for list
	EmployeeRepo employeeRepo = new EmployeeRepo();

	/**
	 * 
	 * @param employee
	 * @return String
	 * It is validating Insert operation 
	 */
	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		}
		else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0 || employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
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
	public String deleteEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
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

	public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0 || employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);
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

	public String findEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
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
	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAllEmployee().toString();
	}
}
