package fr.uha.anis.init;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.country.State;
import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.models.invoice.InvoiceStatus;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.models.person.EmployeeType;
import fr.uha.anis.models.person.JobTitle;
import fr.uha.anis.models.user.User;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.VehicleStatus;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeHire;
import fr.uha.anis.models.vehicule.VehiculeMaintenance;
import fr.uha.anis.models.vehicule.VehiculeType;
import fr.uha.anis.repositories.ClientRepository;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.EmployeeRepository;
import fr.uha.anis.repositories.EmployeeTypeRepository;
import fr.uha.anis.repositories.InvoiceRepository;
import fr.uha.anis.repositories.InvoiceStatusRepository;
import fr.uha.anis.repositories.JobTitleRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.StateRepository;
import fr.uha.anis.repositories.SupplierRepository;
import fr.uha.anis.repositories.UserRepository;
import fr.uha.anis.repositories.VehiculeHireRepository;
import fr.uha.anis.repositories.VehiculeMaintenanceRepository;
import fr.uha.anis.repositories.VehiculeModelRepository;
import fr.uha.anis.repositories.VehiculeRepository;
import fr.uha.anis.repositories.VehiculeStatusRepository;
import fr.uha.anis.repositories.VehiculeTypeRepository;
@Service
@Transactional
public class CarFleetInitDB implements ICarFleetInit{
     
	@Autowired
	CountryRepository countryRepository;
	@Autowired
	StateRepository stateRepository;
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	InvoiceStatusRepository   invoiceStatusRepository;
	@Autowired
	InvoiceRepository invoiceRepository;
	@Autowired
	JobTitleRepository jobTitleRepository;
	@Autowired
	EmployeeTypeRepository  employeeTypeRepository;
	@Autowired
	SupplierRepository supplierRepository;
	@Autowired
	VehiculeModelRepository vehiculeModelRepository;
	@Autowired
	VehiculeStatusRepository vehiculeStatusRepository;
	@Autowired
	VehiculeTypeRepository  vehiculeTypeRepository;
	@Autowired
	EmployeeRepository  employeeRepository;
	@Autowired
	VehiculeRepository vehiculeRepository;
	@Autowired
	VehiculeHireRepository vehiculeHireRepository;
	@Autowired
	VehiculeMaintenanceRepository  vehiculeMaintenanceRepository;
	
	@Override
	public void initCounties() {
		Country country=new Country(1,"2FECE","Paris","France","French","Europe");
		Country country2=new Country(2,"23DAE","New York","USA","American","America");
	
		countryRepository.save(country);
		countryRepository.save(country2);
	}

	@Override
	public void initStates() {
		
			State state=new State(1,"Ile de France", "Paris", "0OAE", countryRepository.findById(1).get(),1, "");
			State state2=new State(2,"New York", "New York", "03DAE", countryRepository.findById(2).get(),2, "");
			stateRepository.save(state);
			stateRepository.save(state2);
			
			
		
		
	}

	@Override
	public void initLocations() {
		Location locatio=new Location(1, "", "", countryRepository.findById(1).get(),1, stateRepository.findById(1).get(),1, "New York", "");
		locationRepository.save(locatio);
	}

	@Override
	public void initUsers() {
	User user =new User(1, "admin", "admin");
	User user2 =new User(1, "user", "user");
	userRepository.save(user);
	userRepository.save(user2);
	}

	@Override
	public void initEmployeeTypes() {
	   EmployeeType employeeType1=new EmployeeType(1,"Full-Time","");
	   EmployeeType employeeType2=new EmployeeType(2,"Part-Time","");
	   employeeTypeRepository.save(employeeType1);
	   employeeTypeRepository.save(employeeType2);
	}

	@Override
	public void initJobTitles() {
		// TODO Auto-generated method stub
		
		
		JobTitle jobTitle=new JobTitle(1, "Manager", "");
		JobTitle jobTitle2=new JobTitle(2, "Executive", "");
		jobTitleRepository.save(jobTitle);
		jobTitleRepository.save(jobTitle2);
	}

	@Override
	public void initEmployees() {
		Employee emp1=new Employee(1, "", "Bud Y. ", "Farmer", 
				"worker", "", "9G979H8G", "Male", "married",
				countryRepository.findById(2).get(), 2, stateRepository.findById(1).get(), 
				2, new Date(), "Oakland", "2885 Station Street\r\n Oakland, CA 94612", "133434", "31431341",
				"bud.farmer@gmail.com", "bud.jpg", employeeTypeRepository.findById(1).get(), 1, "",
				"", jobTitleRepository.findById(1).get(), 1, new Date());
		employeeRepository.save(emp1);
	}

	@Override
	public void initContacts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSuppliers() {
		Supplier supplier=new Supplier(1, "Donald M. Ellis", "651 Lilac Lane Darien, GA 31305", "California", "13434134", "4232352", "www.google.com", "dobald.ellis@gmail.com", countryRepository.findById(2).get(), 2, stateRepository.findById(2).get(), 2, "");
		supplierRepository.save(supplier);
		
	}

	@Override
	public void initClients() {
		Client c=new Client(1, "Christopher F. Neal", "75 Stadium Drive\r\n" + 
				"Franklin, MA 02038", "New york", "0989870997", "8786585765", "", "n.f@test.us", countryRepository.findById(1).get(), 1, stateRepository.findById(1).get(), 1, "");
		clientRepository.save(c);
	}

	@Override
	public void initInvoiceStatus() {
		InvoiceStatus invoiceStatus=new InvoiceStatus(1, "valid", "");
		invoiceStatusRepository.save(invoiceStatus);
	}

	@Override
	public void initInvoices() {
		Invoice invoice=new Invoice(1, new Date(), invoiceStatusRepository.findById(1).get(), 1, clientRepository.findById(1).get(), 1, "");
		invoiceRepository.save(invoice);
	}

	@Override
	public void initVehiculeMaintenance() {
		//VehiculeMaintenance vehiculeMaintenance=new VehiculeMaintenance(1,
		VehiculeMaintenance vehiculeMaintenance=new VehiculeMaintenance(1, vehiculeRepository.findById(1).get(), 1, new Date(), new Date(), 22.0, supplierRepository.findById(1).get(), 1, "");
	    vehiculeMaintenanceRepository.save(vehiculeMaintenance);
	}

	@Override
	public void initVehiculeModel() {
		// TODO Auto-generated method stub
		VehicleModel vehiculeModel=new VehicleModel(1, "Toyota", "");
		vehiculeModelRepository.save(vehiculeModel);
	}

	@Override
	public void initVehiculeStatus() {
		VehicleStatus vehiculeStatus=new VehicleStatus(1,"good","");
		VehicleStatus vehiculeStatus2=new VehicleStatus(2,"bad","");
		vehiculeStatusRepository.save(vehiculeStatus);
		vehiculeStatusRepository.save(vehiculeStatus2);
		
	}

	@Override
	public void initVehiculeType() {
     VehiculeType vehiculeType=new VehiculeType(1, "sedan", "");
     VehiculeType vehiculeType2=new VehiculeType(2, "hatchback", "");
     vehiculeTypeRepository.save(vehiculeType);
     vehiculeTypeRepository.save(vehiculeType2);
	}

	@Override
	public void initVehicules() {
		// TODO Auto-generated method stub
		Vehicule v=new Vehicule(1, "Toyota", vehiculeTypeRepository.findById(1).get(),
				1, "32D2D22", new Date(), new Date(), "", "", "",
				vehiculeStatusRepository.findById(1).get(), 1, "22", employeeRepository.findById(1).get(), 
				1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "");
		vehiculeRepository.save(v);
	}

	@Override
	public void initVehiculehire() {
		// TODO Auto-generated method stub
		VehiculeHire vehiculeHire=new VehiculeHire(1, vehiculeRepository.findById(1).get(), 1, new Date(), new Date(), new Date(), new Date(), clientRepository.findById(1).get(),1, locationRepository.findById(1).get(), 1, 33.3, "");
		vehiculeHireRepository.save(vehiculeHire);
	}

	

}
