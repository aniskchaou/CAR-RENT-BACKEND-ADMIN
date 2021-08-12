package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.vehicule.VehicleModel;
import delta.dev.software.repositories.VehiculeModelRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeModelService {

	/**
	 * vehiculeModelRepository
	 */
	@Autowired
	private VehiculeModelRepository vehiculeModelRepository;

	/**
	 * getVehiculeModels
	 * @return
	 */
	public List<VehicleModel> getVehiculeModels() {
		return vehiculeModelRepository.findAll();
	}

}
