package fr.uha.anis.repositories;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.client.Supplier;
import fr.uha.anis.models.user.Userss;
import fr.uha.anis.models.vehicule.VehicleStatus;

@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehicleStatus, Integer> {
  
}
