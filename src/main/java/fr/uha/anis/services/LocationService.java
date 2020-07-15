package fr.uha.anis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	

	
	public List<Location> getLocations()
	{
		return locationRepository.findAll();
	}
}
