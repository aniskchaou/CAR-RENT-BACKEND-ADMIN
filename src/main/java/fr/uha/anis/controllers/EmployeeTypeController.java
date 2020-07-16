package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import fr.uha.anis.services.EmployeeTypesService;

@Controller
public class EmployeeTypeController {

	

	@Autowired
	private EmployeeTypesService employeeTypeService;
	
	@GetMapping("/employeetypes")
	public String getEmployeeTypes(Model model)
	{
		List<fr.uha.anis.models.person.EmployeeType> employeetypes=employeeTypeService.getEmployeeTypess();
		model.addAttribute("employeetypes", employeetypes);
		return "employee_type";
	}
}
