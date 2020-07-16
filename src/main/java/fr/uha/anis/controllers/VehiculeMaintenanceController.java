package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeMaintenance;
import fr.uha.anis.services.VehiculeMaintenanceService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;

@Controller
public class VehiculeMaintenanceController {

	@Autowired
	private VehiculeMaintenanceService vehiculeMaintenanceService;
	
	@GetMapping("/vehiculemaintenance")
	public String getVehiculeMaintenances(Model model)
	{
		List<VehiculeMaintenance> vehiculeMaintenances=vehiculeMaintenanceService.getVehiculeMaintenances();
		model.addAttribute("vehiculeMaintenances", vehiculeMaintenances);
		return "vehicule_maintenance";
	}
}
