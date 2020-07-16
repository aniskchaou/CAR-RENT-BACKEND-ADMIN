package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.services.ClientService;
import fr.uha.anis.services.EmployeeService;
import fr.uha.anis.services.SupplierService;
@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping("/suppliers")
	public String getSuppliers(Model model)
	{
		List<Supplier> suppliers=supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);
		return "suppliers";
	}
}
