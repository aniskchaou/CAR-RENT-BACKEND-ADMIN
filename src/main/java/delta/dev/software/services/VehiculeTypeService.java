package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.vehicule.VehiculeType;
import delta.dev.software.repositories.VehiculeTypeRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeTypeService {

	/**
	 * vehiculeTypeRepository
	 */
	@Autowired
	private VehiculeTypeRepository vehiculeTypeRepository;

	/**
	 * getVehiculeTypes
	 * 
	 * @return
	 */
	public List<VehiculeType> getVehiculeTypes() {
		return vehiculeTypeRepository.findAll();
	}

}
