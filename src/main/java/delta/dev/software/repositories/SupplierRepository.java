package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.client.Supplier;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
