package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.country.Location;
import delta.dev.software.repositories.LocationRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class LocationService {

	/**
	 * locationRepository
	 */
	@Autowired
	private LocationRepository locationRepository;

	/**
	 * getLocations
	 * 
	 * @return
	 */
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param location
	 */
	public void save(Location location) {
		locationRepository.save(location);

	}
}
