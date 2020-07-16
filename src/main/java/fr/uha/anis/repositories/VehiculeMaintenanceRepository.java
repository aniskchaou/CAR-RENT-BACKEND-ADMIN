package fr.uha.anis.repositories;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.person.Employee;
import fr.uha.anis.models.user.User;
import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.models.vehicule.VehiculeMaintenance;

@Repository
public interface VehiculeMaintenanceRepository extends JpaRepository<VehiculeMaintenance, Integer> {
  
}
