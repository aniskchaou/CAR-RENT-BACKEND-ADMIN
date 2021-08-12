package delta.dev.software.controllers;

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

import delta.dev.software.models.person.Employee;
import delta.dev.software.models.vehicule.VehicleModel;
import delta.dev.software.models.vehicule.VehicleStatus;
import delta.dev.software.models.vehicule.Vehicule;
import delta.dev.software.models.vehicule.VehiculeType;
import delta.dev.software.services.EmployeeService;
import delta.dev.software.services.LocationService;
import delta.dev.software.services.VehiculeModelService;
import delta.dev.software.services.VehiculeService;
import delta.dev.software.services.VehiculeStatusService;
import delta.dev.software.services.VehiculeTypeService;

@Controller
public class VehiculeController {

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculeService vehiculeService;

	/**
	 * vehiculeTypeService
	 */
	@Autowired
	VehiculeTypeService vehiculeTypeService;

	/**
	 * employeeService
	 */
	@Autowired
	EmployeeService employeeService;

	/**
	 * locationService
	 */
	@Autowired
	LocationService locationService;

	/**
	 * vehiculeModelService
	 */
	@Autowired
	VehiculeModelService vehiculeModelService;

	/**
	 * vehiculeStatusService
	 */
	@Autowired
	VehiculeStatusService vehiculeStatusService;

	/**
	 * getVehicules
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehicules")
	public String getVehicules(Model model) {
		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		List<delta.dev.software.models.country.Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		List<VehicleModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		List<VehicleStatus> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		return "vehicules";
	}

	/**
	 * addVehicule
	 * 
	 * @param v
	 * @return
	 */
	@PostMapping("/addvehicule")
	public String addVehicule(Vehicule v) {
		vehiculeService.save(v);
		return "redirect:/vehicules";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehicule/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		List<delta.dev.software.models.country.Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		List<VehicleModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		List<VehicleStatus> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		Vehicule vehicule = vehiculeService.findById(id).get();
		model.addAttribute("vehicule", vehicule);
		return "editVehicule";
	}

	/**
	 * updateVehicule
	 * 
	 * @param id
	 * @param vehicule
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehicule/{id}")
	public String updateVehicule(@PathVariable("id") long id, @Validated Vehicule vehicule, BindingResult result,
			Model model) {

		vehiculeService.save(vehicule);
		return "redirect:/vehicules";
	}

	/**
	 * deleteVehicule
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehicule/{id}")
	@Transactional
	public String deleteVehicule(@PathVariable("id") int id) {
		vehiculeService.deleteById(id);
		return "redirect:/vehicules";
	}
}
