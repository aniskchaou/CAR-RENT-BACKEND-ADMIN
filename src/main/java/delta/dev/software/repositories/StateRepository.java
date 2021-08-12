package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.country.State;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
