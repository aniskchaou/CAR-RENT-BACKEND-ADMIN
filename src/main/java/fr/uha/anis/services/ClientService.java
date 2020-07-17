package fr.uha.anis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.repositories.ClientRepository;
import fr.uha.anis.repositories.CountryRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	

	
	public List<Client> getClients()
	{
		return clientRepository.findAll();
	}
	
	public long getCount()
	{
		return clientRepository.count();
	}

	public void save(Client client)
	{
		clientRepository.save(client);
	}
/*	
	public Optional<Country> findById(int id)
	{
		return countryRepository.findById(id);
	}
	
	public void delete(int id)
	{
		
		countryRepository.delete(countryRepository.getOne(id));
		
	}
*/

	public Optional<Client> findById(int id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}
}
