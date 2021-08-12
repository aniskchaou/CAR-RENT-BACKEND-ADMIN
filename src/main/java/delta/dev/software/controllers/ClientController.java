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

import delta.dev.software.models.client.Client;
import delta.dev.software.models.country.Country;
import delta.dev.software.models.country.State;
import delta.dev.software.services.ClientService;
import delta.dev.software.services.CountryService;
import delta.dev.software.services.StateService;

/**
 * 
 * @author Delta dev Software
 * @version 0.1
 */
@Controller
public class ClientController {
	/**
	 * clientService
	 */
	@Autowired
	private ClientService clientService;

	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	/**
	 * stateService
	 */
	@Autowired
	private StateService stateService;

	/**
	 * getClients
	 * @param model
	 * @return
	 */
	@GetMapping("/clients")
	public String getClients(Model model) {
		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		List<State> states = stateService.getStates();
		model.addAttribute("states", states);

		List<Country> countries = countryService.getCountries();
		model.addAttribute("countries", countries);

		return "clients";
	}

	/**
	 * addClient
	 * @param client
	 * @return
	 */
	@PostMapping("/addclient")

	public String addClient(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/client/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		List<State> states = stateService.getStates();
		model.addAttribute("states", states);

		List<Country> countries = countryService.getCountries();
		model.addAttribute("countries", countries);
		Client client = clientService.findById(id).get();
		model.addAttribute("client", client);
		return "editClient";
	}

	/**
	 * updateClient
	 * @param id
	 * @param client
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateclient/{id}")
	public String updateClient(@PathVariable("id") long id, @Validated Client client, BindingResult result,
			Model model) {

		clientService.save(client);
		return "redirect:/clients";
	}

	/**
	 * deleteClient
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteclient/{id}")
	@Transactional
	public String deleteClient(@PathVariable("id") int id) {
		clientService.delete(id);
		return "redirect:/clients";
	}
}
