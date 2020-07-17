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

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeHire;
import fr.uha.anis.models.vehicule.VehiculeType;
import fr.uha.anis.services.ClientService;
import fr.uha.anis.services.LocationService;
import fr.uha.anis.services.VehiculeHireService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;
import fr.uha.anis.services.VehiculeTypeService;

@Controller
public class VehiculeHireController {

	@Autowired
	private VehiculeHireService vehiculeHireService;

	@Autowired
	VehiculeService vehiculeService;

	@Autowired
	ClientService clientService;

	@Autowired
	LocationService locationService;

	@GetMapping("/vehiculehire")
	public String getVehicules(Model model) {
		List<VehiculeHire> vehiculehires = vehiculeHireService.getVehiculeHires();
		model.addAttribute("vehiculehires", vehiculehires);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		List<Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);

		return "vehicule_hires";
	}

	@PostMapping("/addvehiculehire")

	public String addVehiculeHire(VehiculeHire vehiculeHire) {
		vehiculeHireService.save(vehiculeHire);
		return "redirect:/vehiculehire";
	}

	@RequestMapping("/vehiculehire/{id}")
	public String findById(@PathVariable("id") int id, Model model) {


		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		List<Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		
		VehiculeHire vehiculeHire = vehiculeHireService.findById(id).get();
		model.addAttribute("vehiculeHire", vehiculeHire);
		return "editHire";
	}

	@PostMapping("/updatevehiculehire/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated VehiculeHire vehicule, BindingResult result,
			Model model) {

		vehiculeHireService.save(vehicule);
		return "redirect:/vehiculeshire";
	}
//
//@GetMapping("/deletevehicule/{id}")
//@Transactional
//public String deleteCountry(@PathVariable("id") int id) {
//	vehiculeService.delete(id);
//	return "redirect:/vehicules";
//}
}
