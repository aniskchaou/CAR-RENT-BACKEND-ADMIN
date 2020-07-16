package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeHire;
import fr.uha.anis.services.VehiculeHireService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;

@Controller
public class VehiculeHireController {

	@Autowired
	private VehiculeHireService vehiculeHireService;
	
	@GetMapping("/vehiculehire")
	public String getVehicules(Model model)
	{
		List<VehiculeHire> vehiculehires=vehiculeHireService.getVehiculeHires();
		model.addAttribute("vehiculehires", vehiculehires);
		return "vehicule_hires";
	}
}
