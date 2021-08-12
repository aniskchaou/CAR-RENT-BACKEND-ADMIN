package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.vehicule.VehicleStatus;
import delta.dev.software.repositories.VehiculeStatusRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeStatusService {

	/**
	 * vehiculeStatusRepository
	 */
	@Autowired
	private VehiculeStatusRepository vehiculeStatusRepository;

	/**
	 * getVehicleStatus
	 * 
	 * @return
	 */
	public List<VehicleStatus> getVehicleStatus() {
		return vehiculeStatusRepository.findAll();
	}

}
