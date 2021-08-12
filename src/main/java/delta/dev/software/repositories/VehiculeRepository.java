package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.vehicule.Vehicule;

/**
 * 
 * @author VehiculeRepository
 *
 */
@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

}
