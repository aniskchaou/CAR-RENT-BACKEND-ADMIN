package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.person.EmployeeType;
import delta.dev.software.repositories.EmployeeTypeRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class EmployeeTypesService {
	/**
	 * employeeTypesRepository
	 */
	@Autowired
	private EmployeeTypeRepository employeeTypesRepository;

	/**
	 * getEmployeeTypess
	 * 
	 * @return
	 */
	public List<EmployeeType> getEmployeeTypess() {
		return employeeTypesRepository.findAll();
	}

}
