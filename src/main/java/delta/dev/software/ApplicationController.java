package delta.dev.software;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.services.ClientService;
import delta.dev.software.services.EmployeeService;
import delta.dev.software.services.SupplierService;
import delta.dev.software.services.VehiculeService;

/**
 * ApplicationController
 * @author Delta dev Software
 * @version 0.1
 */
@Controller
public class ApplicationController {

	/**
	 * EmployeeService
	 */
	@Autowired
	EmployeeService employeeService;

	/**
	 * @ ClientService
	 */
	@Autowired
	ClientService clientService;

	/**
	 * supplierService
	 */
	@Autowired
	SupplierService supplierService;

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculeService vehiculeService;

	/**
	 * index: redirect to index page
	 * 
	 * @param model
	 * @return index page
	 */
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("employee_nb", employeeService.getCount());
		model.addAttribute("client_nb", clientService.getCount());
		model.addAttribute("supplier_nb", supplierService.getCount());
		model.addAttribute("vehicule_nb", vehiculeService.getCount());
		return "index";
	}

	/**
	 * login : redirects to login page
	 * 
	 * @return login page
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * logout : redirects to logout page
	 * 
	 * @return logout page
	 */
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

	/**
	 * register : redirects to register page
	 * 
	 * @return register page
	 */
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
