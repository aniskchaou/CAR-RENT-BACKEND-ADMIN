package fr.uha.anis.services;

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
import fr.uha.anis.models.vehicule.VehiculeMaintenance;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.JobTitleRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.StateRepository;
import fr.uha.anis.repositories.VehiculeMaintenanceRepository;
import fr.uha.anis.repositories.VehiculeModelRepository;

@Service
public class VehiculeMaintenanceService {

	@Autowired
	private VehiculeMaintenanceRepository vehiculeMaintenanceRepository;
	

	
	public List<VehiculeMaintenance> getVehiculeMaintenances()
	{
		return vehiculeMaintenanceRepository.findAll();
	}
	
	public void save(VehiculeMaintenance m)
	{
		vehiculeMaintenanceRepository.save(m);
	}
	
	public Optional<VehiculeMaintenance> findById(int id)
	{
		return vehiculeMaintenanceRepository.findById(id);
	}
	/*
	public void delete(int id)
	{
		
		countryRepository.delete(countryRepository.getOne(id));
		
	}
*/

	public void delete(int id) {
		vehiculeMaintenanceRepository.delete(vehiculeMaintenanceRepository.findById(id).get());
		
	}
}
