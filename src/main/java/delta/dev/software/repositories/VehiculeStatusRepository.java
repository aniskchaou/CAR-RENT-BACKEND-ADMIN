package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.VehicleStatus;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
