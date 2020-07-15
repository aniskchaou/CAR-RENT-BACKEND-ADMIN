package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.models.person.EmployeeType;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
