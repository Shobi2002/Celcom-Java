package com.tms.main;



import com.tms.model.Customer;
import com.tms.model.Package;
import com.tms.service.CustomerServiceImpl;
import com.tms.service.PackageServiceImpl;
import com.tms.view.PackageView;
import com.tms.view.CustomerView;
/**
 * Main class for the Tourism Application.
 * <p>
 * This class serves as the entry point for the application. It manages the interaction
 * between the user and the services for managing packages and customers. 
 * It provides a menu to perform CRUD operations on both packages and customers.
 * </p>
 * 
 * @author Shobana V
 * @version 1.0
 */
public class TourismApp {
	  /**
     * Main method that drives the application flow.
     * <p>
     * It displays the menu to the user and allows them to interact with the system.
     * Depending on the user's choice, the corresponding operation (e.g., add, update, delete, find) 
     * is performed for either packages or customers.
     * </p>
     * 
     * @param args Command line arguments (not used in this case).
     */
	public static void main(String[] args) {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		PackageServiceImpl packageService = new PackageServiceImpl();

		Package pack;
		Customer customer;
		int id;
		String msg = "";
		String result = "";

		do {

			int choice = PackageView.menu();

			switch (choice) {
			case 1:
				pack = PackageView.insertPackageView();
				result = packageService.addPackValidation(pack);
				PackageView.printResult(result);
				break;

			case 2:
				id = PackageView.deletePackageView();
				result = packageService.removePackValidation(id);
				PackageView.printResult(result);
				break;

			case 3:
				pack = PackageView.updatePackageView();
				result = packageService.updatePackValidation(pack);
				PackageView.printResult(result);
				break;

			case 4:
				id = PackageView.findPackageView();
				result = packageService.findPackValidation(id);
				PackageView.printResult(result);
				break;

			case 5:
				result = packageService.findAllPackageValidation();
				PackageView.printResult(result);
				break;
			case 6:
				customer = CustomerView.insertCustomerView();
				result = customerService.addCustomerValidation(customer);
				CustomerView.printResult(result);
				break;
			case 7:
				id = CustomerView.deleteCustomerView();
				result = customerService.removeCustomerValidation(id);
				CustomerView.printResult(result);
				break;
			case 8:
				customer = CustomerView.updateCustomerView();
				result = customerService.updateCustomerValidation(customer);
				CustomerView.printResult(result);
				break;
			case 9:
				id = CustomerView.findCustomerView();
				result = customerService.findCustomerValidation(id);
				CustomerView.printResult(result);
				break;
			case 10:
				result = customerService.findAllCustomerValidation();
				CustomerView.printResult(result);
				break;
			case 11:
				System.exit(0);
				break;

			default:
				PackageView.printInvalid();
			}
			msg = PackageView.continues();
		} while (msg.equalsIgnoreCase("Yes"));
	}
}
