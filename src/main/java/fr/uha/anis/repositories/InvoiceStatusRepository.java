package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.invoice.InvoiceStatus;
import fr.uha.anis.models.person.JobTitle;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus ,Integer> {

}
