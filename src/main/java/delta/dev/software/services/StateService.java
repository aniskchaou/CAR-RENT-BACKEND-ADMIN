package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.country.State;
import delta.dev.software.repositories.StateRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class StateService {

	/**
	 * stateRepository
	 */
	@Autowired
	private StateRepository stateRepository;

	/**
	 * getStates
	 * 
	 * @return
	 */
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param state
	 */
	public void save(State state) {
		stateRepository.save(state);
	}
}
