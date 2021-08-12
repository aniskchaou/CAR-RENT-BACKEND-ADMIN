package delta.dev.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.vehicule.VehiculeHire;
import delta.dev.software.repositories.VehiculeHireRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeHireService {

	/**
	 * 
	 */
	@Autowired
	private VehiculeHireRepository vehiculeHireRepository;

	/**
	 * getVehiculeHires
	 * 
	 * @return
	 */
	public List<VehiculeHire> getVehiculeHires() {
		return vehiculeHireRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param hire
	 */
	public void save(VehiculeHire hire) {
		vehiculeHireRepository.save(hire);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<VehiculeHire> findById(int id) {
		return vehiculeHireRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {
		vehiculeHireRepository.delete(vehiculeHireRepository.findById(id).get());
	}
}
