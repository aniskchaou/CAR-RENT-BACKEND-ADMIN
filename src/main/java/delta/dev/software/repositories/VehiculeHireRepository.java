package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.VehiculeHire;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeHireRepository extends JpaRepository<VehiculeHire, Integer> {

}
