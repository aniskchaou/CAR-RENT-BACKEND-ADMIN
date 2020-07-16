package fr.uha.anis.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.services.CountryService;
import fr.uha.anis.services.VehiculeModelService;

@Controller
public class VehiculeModelController {
	
	@Autowired
	private VehiculeModelService vehiculeModelService;
	
	@GetMapping("/vehiculemodels")
	public String getCountries(Model model)
	{
		List<VehicleModel> vehiculemodels=vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculemodels", vehiculemodels);
		return "vehicule_models";
	}
	/*
	@PostMapping("/addcountry")
	
	public String addCountry(Country country)
	{
		System.out.println(country.toString());
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping("/findbyid/{id}")
	public String findById(@PathVariable("id") int id, Model model)
	{
		
	 Country country=countryService.findById(id).get();
	 model.addAttribute("country", country);
	 return "editCountryForm";
	}
	
	@PostMapping("/updatecountry/{id}")
	public String updateCountry(@PathVariable("id") long id,@Validated Country country, 
			  BindingResult result, Model model)
	{
		
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@GetMapping("/deletecountry/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") int id)
	{
		countryService.delete(id);
		return  "redirect:/countries";
	}
	*/
}
