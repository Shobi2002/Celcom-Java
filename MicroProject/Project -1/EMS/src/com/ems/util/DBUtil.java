package com.ems.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
/**
 * @author Shobana V
 * @version 1.0
 * It is  Storing the all employee
 */

public class DBUtil {
	private static List<Employee> list = new LinkedList<>();
	private static Map<Integer, Employee> map = new HashMap<>();
/**
 * 
 * @return list
 * It is performing get LIST DB
 */
	public static List<Employee> getListDBInstance() {
		return list;
	}

	/**
	 * 
	 * @return Map
	 * It is performing get Map DB
	 */
	public static Map<Integer, Employee> getMapDBInstance() {
		return map;
	}
}
