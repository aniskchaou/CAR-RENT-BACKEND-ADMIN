package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String getEmployees(Model model)
	{
		List<Employee> employees=employeeService.getEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}
	
@PostMapping("/addemployee")
	
	public String addCountry(Employee e)
	{
		employeeService.save(e);
		return "redirect:/employee";
	}
	
}
