package fr.uha.anis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.Location;
import fr.uha.anis.models.country.State;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.StateRepository;

@Service
public class StateService {


	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getStates()
	{
		return stateRepository.findAll();
	}

	public void save(State state) {
		// TODO Auto-generated method stub
		stateRepository.save(state);
	}
}
