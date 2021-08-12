package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import delta.dev.software.models.country.Country;
import delta.dev.software.models.country.State;
import delta.dev.software.services.CountryService;
import delta.dev.software.services.StateService;

/**
 * 
 * @author Delta Dev Software
 * @version 1.0
 */
@Controller
public class StateController {

	/**
	 * stateService
	 */
	@Autowired
	private StateService stateService;

	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	/**
	 * getStates
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/states")
	public String getStates(Model model) {
		List<delta.dev.software.models.country.State> states = stateService.getStates();
		model.addAttribute("states", states);
		List<Country> countries = countryService.getCountries();
		model.addAttribute("countries", countries);

		return "state";
	}

	/**
	 * addState
	 * 
	 * @param state
	 * @return
	 */
	@PostMapping("/addstate")
	public String addState(State state) {
		stateService.save(state);
		return "redirect:/states";
	}
}
