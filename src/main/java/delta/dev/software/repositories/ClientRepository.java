package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.client.Client;
/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
