package delta.dev.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.vehicule.VehiculeMaintenance;
import delta.dev.software.repositories.VehiculeMaintenanceRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeMaintenanceService {

	/**
	 * vehiculeMaintenanceRepository
	 */
	@Autowired
	private VehiculeMaintenanceRepository vehiculeMaintenanceRepository;

	/**
	 * getVehiculeMaintenances
	 * 
	 * @return
	 */
	public List<VehiculeMaintenance> getVehiculeMaintenances() {
		return vehiculeMaintenanceRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param m
	 */
	public void save(VehiculeMaintenance m) {
		vehiculeMaintenanceRepository.save(m);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<VehiculeMaintenance> findById(int id) {
		return vehiculeMaintenanceRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {
		vehiculeMaintenanceRepository.delete(vehiculeMaintenanceRepository.findById(id).get());

	}
}
