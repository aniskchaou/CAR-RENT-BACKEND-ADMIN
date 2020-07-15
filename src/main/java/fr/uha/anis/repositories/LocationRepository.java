package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.country.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
