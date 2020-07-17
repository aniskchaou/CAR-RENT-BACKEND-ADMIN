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

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.country.State;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.services.ClientService;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.EmployeeService;
import fr.uha.anis.services.LocationService;
import fr.uha.anis.services.StateService;
@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	@GetMapping("/clients")
	public String getClients(Model model)
	{
		List<Client> clients=clientService.getClients();
		model.addAttribute("clients", clients);
		
		List<State> states=stateService.getStates();
		model.addAttribute("states", states);
		
		List<Country> countries=countryService.getCountries();
		model.addAttribute("countries", countries);
		
		return "clients";
	}
	
@PostMapping("/addclient")
	
	public String addClient(Client client)
	{
	clientService.save(client);
		return "redirect:/clients";
	}

@RequestMapping("/client/{id}")
public String findById(@PathVariable("id") int id, Model model)
{
	List<State> states=stateService.getStates();
	model.addAttribute("states", states);
	
	List<Country> countries=countryService.getCountries();
	model.addAttribute("countries", countries);
 Client client=clientService.findById(id).get();
 model.addAttribute("client", client);
 return "editClient";
}

@PostMapping("/updateclient/{id}")
public String updateCountry(@PathVariable("id") long id,@Validated Client client, 
		  BindingResult result, Model model)
{
	
	clientService.save(client);
	return "redirect:/clients";
}
	
}
