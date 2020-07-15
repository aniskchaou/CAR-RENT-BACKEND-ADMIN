package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public String getStates(Model model)
	{
		List<fr.uha.anis.models.country.State> states=stateService.getStates();
		model.addAttribute("states", states);
		return "state";
	}
}
