package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.EmployeeRepo;

/**
 * @author Shobana V
 * @version 1.0
 * It is performing Validation of CRUD operation
 */
public class DepartmentService {
	// EmployeeRepo employeeRepo = new EmployeeRepo();//for list
	DepartmentRepo departmentRepo = new DepartmentRepo();

	/**
	 * 
	 * @param employee
	 * @return String
	 * It is validating Insert operation 
	 */
	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is Null";
		}
		else if (department.getDno() == 0 || department.getDname() == null ) {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not Saved";
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
	public String deleteDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department object Deleted";
			} else {
				result = "Department object  Not Found";
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

	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Employee Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Updated ";
			} else {
				result = "Department Object Not Found ";
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

	public String findDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Department department= departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department object  Not Found";
			}
		}
		return result;
	}
	/**
	 * 
	 * @return String
	 * It is validating all Employee list
	 */
	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}
}
