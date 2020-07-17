package fr.uha.anis.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.repositories.CountryRepository;
import fr.uha.anis.repositories.InvoiceRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.StateRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	

	
	public List<Invoice> getInvoices()
	{
		return invoiceRepository.findAll();
	}
	
	public void save(Invoice invoice)
	{
		invoiceRepository.save(invoice);
	}
	/*
	public Optional<Country> findById(int id)
	{
		return countryRepository.findById(id);
	}
	
	public void delete(int id)
	{
		
		countryRepository.delete(countryRepository.getOne(id));
		
	}
*/

	public Invoice findById(int id) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(id).get();
	}

	public void delete(int id) {
         invoiceRepository.delete(invoiceRepository.findById(id).get());		
	}
}
