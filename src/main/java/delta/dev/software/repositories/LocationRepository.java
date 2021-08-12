package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.country.Location;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
