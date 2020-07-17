package fr.uha.anis.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import fr.uha.anis.models.person.Employee;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.VehicleStatus;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeType;
import fr.uha.anis.services.EmployeeService;
import fr.uha.anis.services.LocationService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;
import fr.uha.anis.services.VehiculeStatusService;
import fr.uha.anis.services.VehiculeTypeService;

@Controller
public class VehiculeController {

	@Autowired
	private VehiculeService vehiculeService;
	@Autowired
	private VehiculeTypeService vehiculeTypeService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private VehiculeModelService vehiculeModelService;

	@Autowired
	private VehiculeStatusService vehiculeStatusService;

	@GetMapping("/vehicules")
	public String getVehicules(Model model) {
		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		List<fr.uha.anis.models.country.Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		List<VehicleModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		List<VehicleStatus> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		return "vehicules";
	}

	@PostMapping("/addvehicule")

	public String addCountry(Vehicule v) {
		vehiculeService.save(v);
		return "redirect:/vehicules";
	}

	@RequestMapping("/vehicule/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		List<fr.uha.anis.models.country.Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		List<VehicleModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		List<VehicleStatus> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		Vehicule vehicule = vehiculeService.findById(id).get();
		model.addAttribute("vehicule", vehicule);
		return "editVehicule";
	}

	@PostMapping("/updatevehicule/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated Vehicule vehicule, BindingResult result,
			Model model) {

		vehiculeService.save(vehicule);
		return "redirect:/vehicules";
	}
	@GetMapping("/deletevehicule/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") int id) {
		vehiculeService.delete(id);
		return "redirect:/vehicules";
	}
}
