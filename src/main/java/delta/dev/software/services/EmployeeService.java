package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.person.Employee;
import delta.dev.software.repositories.EmployeeRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class EmployeeService {

	/**
	 * employeeRepository
	 */
	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * getEmployees
	 * 
	 * @return
	 */
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return employeeRepository.count();
	}

	/**
	 * save
	 * 
	 * @param e
	 */
	public void save(Employee e) {
		employeeRepository.save(e);
	}
}
