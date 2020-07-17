package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.country.State;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/states")
	public String getStates(Model model)
	{
		List<fr.uha.anis.models.country.State> states=stateService.getStates();
		model.addAttribute("states", states);
		List<Country> countries=countryService.getCountries();
		model.addAttribute("countries", countries);
		
		return "state";
	}
	
@PostMapping("/addstate")
	
	public String addState(State state)
	{
		stateService.save(state);
		return "redirect:/states";
	}
}
