package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.country.Country;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
