package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.VehicleStatus;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeMaintenance;
import fr.uha.anis.models.vehicule.VehiculeType;
import fr.uha.anis.services.SupplierService;
import fr.uha.anis.services.VehiculeMaintenanceService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;

@Controller
public class VehiculeMaintenanceController {

	@Autowired
	private VehiculeMaintenanceService vehiculeMaintenanceService;
	@Autowired
	VehiculeService vehiculeService;
	@Autowired
	SupplierService supplierService;

	@GetMapping("/vehiculemaintenance")
	public String getVehiculeMaintenances(Model model) {
		List<VehiculeMaintenance> vehiculeMaintenances = vehiculeMaintenanceService.getVehiculeMaintenances();
		model.addAttribute("vehiculeMaintenances", vehiculeMaintenances);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);

		return "vehicule_maintenance";
	}

	@PostMapping("/addvehiculemaintenance")

	public String addVehiculeMaintenance(VehiculeMaintenance vehiculeMaintenance) {
		vehiculeMaintenanceService.save(vehiculeMaintenance);
		return "redirect:/vehiculemaintenance";
	}
	
	@RequestMapping("/vehiculemaintenance/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		VehiculeMaintenance vehiculeMaintenance = vehiculeMaintenanceService.findById(id).get();
		model.addAttribute("vehiculeMaintenance", vehiculeMaintenance);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);
		return "editMaintenance";
	}
	
	@PostMapping("/updatevehiculemaintenance/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated VehiculeMaintenance vehicule, BindingResult result,
			Model model) {

		vehiculeMaintenanceService.save(vehicule);
		return "redirect:/vehiculemaintenance";
	}
}
