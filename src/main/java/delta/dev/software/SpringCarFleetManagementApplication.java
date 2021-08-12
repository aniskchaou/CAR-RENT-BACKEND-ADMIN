package delta.dev.software;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import delta.dev.software.init.CarFleetInitDB;

/**
 * @version 0.1
 * @author Delta Dev Software @
 */
@SpringBootApplication()
public class SpringCarFleetManagementApplication implements CommandLineRunner {

	/**
	 * CarFleetInitDB
	 */
	@Autowired
	CarFleetInitDB carFleetInit;

	/**
	 * main : the main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCarFleetManagementApplication.class, args);
	}

	/**
	 * run : insert data to database
	 * @param
	 */
	@Override
	public void run(String... args) throws Exception {
		carFleetInit.initCounties();
		carFleetInit.initStates();
		carFleetInit.initLocations();
		carFleetInit.initUsers();
		carFleetInit.initJobTitles();
		carFleetInit.initVehiculeStatus();
		carFleetInit.initVehiculeModel();
		carFleetInit.initVehiculeType();
		carFleetInit.initEmployeeTypes();
		carFleetInit.initEmployees();
		carFleetInit.initClients();
		carFleetInit.initVehicules();
		carFleetInit.initVehiculehire();
		carFleetInit.initInvoiceStatus();
		carFleetInit.initInvoices();
		carFleetInit.initSuppliers();
		carFleetInit.initVehiculeMaintenance();
	}

}
