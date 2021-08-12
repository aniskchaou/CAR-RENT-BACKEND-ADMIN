package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.VehiculeMaintenance;
/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeMaintenanceRepository extends JpaRepository<VehiculeMaintenance, Integer> {
  
}
