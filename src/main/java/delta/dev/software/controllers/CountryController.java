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

import delta.dev.software.models.country.Country;
import delta.dev.software.services.CountryService;

/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 */
@Controller
public class CountryController {

	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/countries")
	public String getCountries(Model model) {
		List<Country> countrries = countryService.getCountries();
		model.addAttribute("countries", countrries);
		return "country";
	}

	/**
	 * addCountry
	 * @param country
	 * @param model
	 * @return
	 */
	@PostMapping("/addcountry")
	public String addCountry(Country country, Model model) {
		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/findbyid/{id}")
	public String findById(@PathVariable("id") int id, Model model) {

		Country country = countryService.findById(id).get();
		model.addAttribute("country", country);

		return "editCountry";
	}

	/**
	 * updateCountry
	 * @param id
	 * @param country
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecountry/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated Country country, BindingResult result,
			Model model) {

		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * deleteCountry
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecountry/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") int id) {
		countryService.delete(id);
		return "redirect:/countries";
	}

}
