package fr.uha.anis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries()
	{
		return countryRepository.findAll();
	}
	
	public void save(Country country)
	{
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id)
	{
		return countryRepository.findById(id);
	}
	
	public void delete(int id)
	{
		countryRepository.deleteById(id);
	}

}
