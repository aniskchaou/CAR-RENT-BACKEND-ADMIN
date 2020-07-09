package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.country.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
