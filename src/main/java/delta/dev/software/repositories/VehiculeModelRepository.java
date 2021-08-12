package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.VehicleModel;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeModelRepository extends JpaRepository<VehicleModel, Integer> {

}
