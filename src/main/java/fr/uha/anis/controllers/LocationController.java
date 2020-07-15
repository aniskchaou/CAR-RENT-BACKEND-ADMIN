package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/locations")
	public String locations(Model model)
	{
		List<Location> locations=locationService.getLocations();
		model.addAttribute("locations", locations);
		return "location";
	}
}
