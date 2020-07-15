package fr.uha.anis.init;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.country.State;
import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.models.invoice.InvoiceStatus;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.models.person.EmployeeType;
import fr.uha.anis.models.person.JobTitle;
import fr.uha.anis.models.user.User;
import fr.uha.anis.repositories.ClientRepository;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.EmployeeTypeRepository;
import fr.uha.anis.repositories.InvoiceRepository;
import fr.uha.anis.repositories.InvoiceStatusRepository;
import fr.uha.anis.repositories.JobTitleRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.StateRepository;
import fr.uha.anis.repositories.UserRepository;
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
		Location location=new Location(1, "", "", countryRepository.findById(1).get(),1, stateRepository.findById(1).get(),1, "New York", "");
		locationRepository.save(location);
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
		//Employee emp1=new Employee(1, "", lastname, othername, title, initials, socialSecurityNumber, gender, maritalStatus, country, countryid, state, stateid, dateOfBirth, city, address, phone, mobile, email, photo, employeeType, employeetypeid, photo2, username, jobTitle, jobtitleid, hireDate)
		//Employee emp2=new Employee(1, "", lastname, othername, title, initials, socialSecurityNumber, gender, maritalStatus, country, countryid, state, stateid, dateOfBirth, city, address, phone, mobile, email, photo, employeeType, employeetypeid, photo2, username, jobTitle, jobtitleid, hireDate)
	}

	@Override
	public void initContacts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSuppliers() {
		// TODO Auto-generated method stub
		
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

}
