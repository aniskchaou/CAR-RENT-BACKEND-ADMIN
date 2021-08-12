package delta.dev.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.country.Country;
import delta.dev.software.repositories.CountryRepository;
/**
 * 
 * @author Admin
 *
 */
@Service
public class CountryService {

	/**
	 * countryRepository
	 */
	@Autowired
	private CountryRepository countryRepository;

	/**
	 * getCountries
	 * 
	 * @return
	 */
	public List<Country> getCountries() {
		return countryRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param country
	 */
	public void save(Country country) {
		countryRepository.save(country);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {

		countryRepository.delete(countryRepository.getOne(id));

	}

}
