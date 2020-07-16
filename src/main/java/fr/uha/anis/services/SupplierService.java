package fr.uha.anis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.repositories.ClientRepository;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository  supplierRepository;
	

	
	public List<Supplier> getSuppliers()
	{
		return supplierRepository.findAll();
	}
	public long getCount()
	{
		return supplierRepository.count();
	}
/*	
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
		
		countryRepository.delete(countryRepository.getOne(id));
		
	}
*/
}
