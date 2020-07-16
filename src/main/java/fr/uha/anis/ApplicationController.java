package fr.uha.anis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.services.ClientService;
import fr.uha.anis.services.EmployeeService;
import fr.uha.anis.services.SupplierService;
import fr.uha.anis.services.VehiculeService;

@Controller
public class ApplicationController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	ClientService  clientService;
	
	@Autowired
	SupplierService  supplierService;
	
	@Autowired
	VehiculeService  vehiculeService;
	
	
	@GetMapping("/index")
	public String index(Model model)
	{ model.addAttribute("employee_nb", employeeService.getCount());
	  model.addAttribute("client_nb", clientService.getCount());
	  model.addAttribute("supplier_nb", supplierService.getCount());
	  model.addAttribute("vehicule_nb", vehiculeService.getCount());
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
}
