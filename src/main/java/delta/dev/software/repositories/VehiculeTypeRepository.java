package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.VehiculeType;

/**
 * 
 * @author VehiculeTypeRepository
 *
 */
@Repository
public interface VehiculeTypeRepository extends JpaRepository<VehiculeType, Integer> {

}
