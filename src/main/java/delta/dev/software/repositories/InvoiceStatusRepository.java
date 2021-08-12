package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.invoice.InvoiceStatus;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus ,Integer> {

}
