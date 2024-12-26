package com.tms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.tms.model.Package;

import com.tms.util.DBUtil;
/**
 * Implementation of the `PackageRepo` interface. This class handles CRUD operations (Create, 
 * Read, Update, Delete) for `Package` entities in the database. It interacts with the database
 * using JDBC to perform the necessary operations on the `Tourism_Package` table.
 * <p>
 * The `PackageRepoImpl` class provides methods for inserting, updating, deleting, and fetching
 * package data. Each method uses prepared statements to securely execute SQL queries.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class PackageRepoImpl implements PackageRepo {
	Package pack = null;
	/**
     * Inserts a new package into the database.
     * 
     * @param pack The `Package` object containing the details to be inserted into the database.
     * @return `true` if the package was successfully inserted, otherwise `false`.
     */
	public  boolean doInsertPackage(Package pack) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Tourism_Package values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, pack.getPackageId());
			ps.setString(2, pack.getPackageName());
			ps.setInt(3, pack.getPackagePrice());

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
     * Deletes an existing package from the database by its ID.
     * 
     * @param id The ID of the package to be deleted.
     * @return `true` if the package was successfully deleted, otherwise `false`.
     */
	
	public  boolean doDeletePackage(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete Tourism_Package where PackId = ?";
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
     * Updates an existing package in the database.
     * 
     * @param pack The `Package` object containing the updated details.
     * @return `true` if the package was successfully updated, otherwise `false`.
     */
	
	public  boolean doUpdatePackage(Package pack) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update Tourism_Package set  PackName = ?, PackPrice =? where PackId =?";
			PreparedStatement ps = con.prepareStatement(sql);

			
			ps.setString(1, pack.getPackageName());
			ps.setInt(2, pack.getPackagePrice());
			ps.setInt(3, pack.getPackageId());

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
     * Finds a package by its unique ID from the database.
     * 
     * @param id The ID of the package to be retrieved.
     * @return A `Package` object if found, otherwise `null`.
     */
	public  Package doFindPackage(int id) {
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Tourism_Package where PackId = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				pack = new Package();
				pack.setPackageId(rs.getInt("packId"));
				pack.setPackageName(rs.getString("packName"));
				pack.setPackagePrice(rs.getInt("packPrice"));
			}
			
		} catch (SQLException e) {
			System.out.println("Select query not Executed");
		}
		return pack;
	}
	/**
     * Retrieves all packages from the database.
     * 
     * @return A list of all `Package` objects in the database.
     */
	public  List<Package> doFindAllPackage() {
		List<Package> list = new LinkedList<>();
		Package pack = null;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Tourism_Package ";
			PreparedStatement ps = con.prepareStatement(sql);

			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pack = new Package();
				pack.setPackageId(rs.getInt("packId"));
				pack.setPackageName(rs.getString("packName"));
				pack.setPackagePrice(rs.getInt("packPrice"));
				
				list.add(pack);
			}
			
		} catch (SQLException e) {
			System.out.println("SelectAll query not Executed");
		}
		return list;
	}

}
