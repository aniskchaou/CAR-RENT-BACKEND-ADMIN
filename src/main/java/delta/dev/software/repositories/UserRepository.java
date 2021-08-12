package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.user.Userss;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Userss, Integer> {
  Userss findByUsername(String username);
}
