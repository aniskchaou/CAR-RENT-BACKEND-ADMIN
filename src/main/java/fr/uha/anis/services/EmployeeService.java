package fr.uha.anis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.repositories.ClientRepository;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	
	public List<Employee> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public long getCount()
	{
		return employeeRepository.count();
	}
/*	
	public void save(Country country)
	{
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id)
	{
		return countryRepository.findById(id);
	}
	
	public void delete(int id)
	{
		
		countryRepository.delete(countryRepository.getOne(id));
		
	}
*/
}
