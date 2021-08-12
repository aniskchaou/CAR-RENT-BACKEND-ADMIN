package delta.dev.software.init;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.client.Client;
import delta.dev.software.models.client.Supplier;
import delta.dev.software.models.country.Country;
import delta.dev.software.models.country.Location;
import delta.dev.software.models.country.State;
import delta.dev.software.models.invoice.Invoice;
import delta.dev.software.models.invoice.InvoiceStatus;
import delta.dev.software.models.person.Employee;
import delta.dev.software.models.person.EmployeeType;
import delta.dev.software.models.person.JobTitle;
import delta.dev.software.models.user.Userss;
import delta.dev.software.models.vehicule.VehicleModel;
import delta.dev.software.models.vehicule.VehicleStatus;
import delta.dev.software.models.vehicule.Vehicule;
import delta.dev.software.models.vehicule.VehiculeHire;
import delta.dev.software.models.vehicule.VehiculeMaintenance;
import delta.dev.software.models.vehicule.VehiculeType;
import delta.dev.software.repositories.ClientRepository;
import delta.dev.software.repositories.CountryRepository;
import delta.dev.software.repositories.EmployeeRepository;
import delta.dev.software.repositories.EmployeeTypeRepository;
import delta.dev.software.repositories.InvoiceRepository;
import delta.dev.software.repositories.InvoiceStatusRepository;
import delta.dev.software.repositories.JobTitleRepository;
import delta.dev.software.repositories.LocationRepository;
import delta.dev.software.repositories.StateRepository;
import delta.dev.software.repositories.SupplierRepository;
import delta.dev.software.repositories.UserRepository;
import delta.dev.software.repositories.VehiculeHireRepository;
import delta.dev.software.repositories.VehiculeMaintenanceRepository;
import delta.dev.software.repositories.VehiculeModelRepository;
import delta.dev.software.repositories.VehiculeRepository;
import delta.dev.software.repositories.VehiculeStatusRepository;
import delta.dev.software.repositories.VehiculeTypeRepository;

/**
 * 
 * @author Admin
 * @version 0.1
 */
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
	
	/**
	 * initCounties
	 */
	@Override
	public void initCounties() {
		Country country=new Country(1,"2FECE","Paris","France","French","Europe");
		Country country2=new Country(2,"23DAE","New York","USA","American","America");
	
		countryRepository.save(country);
		countryRepository.save(country2);
	}

	/**
	 * initStates
	 */
	@Override
	public void initStates() {
		
			State state=new State(1,"Ile de France", "Paris", "0OAE", countryRepository.findById(1).get(),1, "none");
			State state2=new State(2,"New York", "New York", "03DAE", countryRepository.findById(2).get(),2, "none");
			stateRepository.save(state);
			stateRepository.save(state2);	
	}

	/**
	 * initLocations
	 */
	@Override
	public void initLocations() {
		Location locatio=new Location(1, "New York", "New York", countryRepository.findById(1).get(),1, stateRepository.findById(1).get(),1, "New York", "");
		locationRepository.save(locatio);
	}

	/**
	 * initUsers
	 */
	@Override
	public void initUsers() {
	Userss user =new Userss(1, "admin", "admin");
	Userss user2 =new Userss(2, "user", "user");
	userRepository.save(user);
	userRepository.save(user2);
	}

	/**
	 * initEmployeeTypes
	 */
	@Override
	public void initEmployeeTypes() {
	   EmployeeType employeeType1=new EmployeeType(1,"Full-Time","Full-Time");
	   EmployeeType employeeType2=new EmployeeType(2,"Part-Time","Part-Time");
	   employeeTypeRepository.save(employeeType1);
	   employeeTypeRepository.save(employeeType2);
	}

	/**
	 * initJobTitles
	 */
	@Override
	public void initJobTitles() {
		JobTitle jobTitle=new JobTitle(1, "Manager", "Manager");
		JobTitle jobTitle2=new JobTitle(2, "Executive", "Executive");
		jobTitleRepository.save(jobTitle);
		jobTitleRepository.save(jobTitle2);
	}

	/**
	 * initEmployees
	 */
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
		
	}

	/**
	 * initSuppliers
	 */
	@Override
	public void initSuppliers() {
		Supplier supplier=new Supplier(1, "Donald M. Ellis", "651 Lilac Lane Darien, GA 31305", "California", "13434134", "4232352", "www.google.com", "dobald.ellis@gmail.com", countryRepository.findById(2).get(), 2, stateRepository.findById(2).get(), 2, "none");
		supplierRepository.save(supplier);
		
	}

	/**
	 * initClients
	 */
	@Override
	public void initClients() {
		Client c=new Client(1, "Christopher F. Neal", "75 Stadium Drive\r\n" + 
				"Franklin, MA 02038", "New york", "0989870997", "8786585765", "", "n.f@test.us", countryRepository.findById(1).get(), 1, stateRepository.findById(1).get(), 1, "none");
		clientRepository.save(c);
	}

	/**
	 * initInvoiceStatus
	 */
	@Override
	public void initInvoiceStatus() {
		InvoiceStatus invoiceStatus=new InvoiceStatus(1, "Valid", "none");
		InvoiceStatus invoiceStatus2=new InvoiceStatus(2, "Expired", "none");
		invoiceStatusRepository.save(invoiceStatus);
		invoiceStatusRepository.save(invoiceStatus2);
	}

	/**
	 * initInvoices
	 */
	@Override
	public void initInvoices() {
		Invoice invoice=new Invoice(1, new Date(), invoiceStatusRepository.findById(1).get(), 1, clientRepository.findById(1).get(), 1, "none");
		invoiceRepository.save(invoice);
	}

	/**
	 * initVehiculeMaintenance
	 */
	@Override
	public void initVehiculeMaintenance() {
		VehiculeMaintenance vehiculeMaintenance=new VehiculeMaintenance(1, vehiculeRepository.findById(1).get(), 1, new Date(), new Date(), 22.0, supplierRepository.findById(1).get(), 1, "none");
	    vehiculeMaintenanceRepository.save(vehiculeMaintenance);
	}

	/**
	 * initVehiculeModel
	 */
	@Override
	public void initVehiculeModel() {
		VehicleModel vehiculeModel=new VehicleModel(1, "Toyota", "Toyota");
		vehiculeModelRepository.save(vehiculeModel);
	}

	/**
	 * initVehiculeStatus
	 */
	@Override
	public void initVehiculeStatus() {
		VehicleStatus vehiculeStatus=new VehicleStatus(1,"Good","Good");
		VehicleStatus vehiculeStatus2=new VehicleStatus(2,"Bad","Bad");
		vehiculeStatusRepository.save(vehiculeStatus);
		vehiculeStatusRepository.save(vehiculeStatus2);
		
	}

	/**
	 * initVehiculeType
	 */
	@Override
	public void initVehiculeType() {
     VehiculeType vehiculeType=new VehiculeType(1, "Sedan", "Sedan");
     VehiculeType vehiculeType2=new VehiculeType(2, "Hatchback", "Hatchback");
     vehiculeTypeRepository.save(vehiculeType);
     vehiculeTypeRepository.save(vehiculeType2);
	}

	/**
	 * initVehicules
	 */
	@Override
	public void initVehicules() {
		Vehicule v=new Vehicule(1, "Toyota", vehiculeTypeRepository.findById(1).get(),
				1, "32D2D22", new Date(), new Date(), "", "", "",
				vehiculeStatusRepository.findById(1).get(), 1, "22", employeeRepository.findById(1).get(), 
				1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "none");
		vehiculeRepository.save(v);
	}

	/**
	 * initVehiculehire
	 */
	@Override
	public void initVehiculehire() {
		VehiculeHire vehiculeHire=new VehiculeHire(1, vehiculeRepository.findById(1).get(), 1, new Date(), new Date(), new Date(), new Date(), clientRepository.findById(1).get(),1, locationRepository.findById(1).get(), 1, 33.3, "none");
		vehiculeHireRepository.save(vehiculeHire);
	}

	

}
