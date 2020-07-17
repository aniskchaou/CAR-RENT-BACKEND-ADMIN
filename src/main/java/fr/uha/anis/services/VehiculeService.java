package fr.uha.anis.services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.person.JobTitle;
import fr.uha.anis.models.vehicule.VehicleModel;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.JobTitleRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.StateRepository;
import fr.uha.anis.repositories.VehiculeModelRepository;
import fr.uha.anis.repositories.VehiculeRepository;

@Service
public class VehiculeService {

	@Autowired
	private VehiculeRepository vehiculeRepository;
	

	
	public List<Vehicule> getVehicules()
	{
		List<Vehicule> vehicules=vehiculeRepository.findAll();
		 Collections.reverse(vehicules);
		 return vehicules;
	}
	
	public long getCount()
	{
		return vehiculeRepository.count();
	}

	public void save(Vehicule vehicule)
	{
		vehiculeRepository.save(vehicule);
	}
	
	public Optional<Vehicule> findById(int id)
	{
		return vehiculeRepository.findById(id);
	}
	
	public void delete(int id)
	{
		
		vehiculeRepository.delete(vehiculeRepository.getOne(id));
		
	}


	
}
