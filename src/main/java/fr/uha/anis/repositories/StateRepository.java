package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.country.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
