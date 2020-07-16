package fr.uha.anis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import fr.uha.anis.init.CarFleetInitDB;
import fr.uha.anis.init.ICarFleetInit;


@SpringBootApplication()
public class SpringCarFleetManagementApplication implements CommandLineRunner {

	@Autowired
	CarFleetInitDB carFleetInit;
	public static void main(String[] args) {
		SpringApplication.run(SpringCarFleetManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
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
