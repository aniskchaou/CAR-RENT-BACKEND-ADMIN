package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.invoice.InvoiceStatus;
import delta.dev.software.repositories.InvoiceStatusRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class InvoiceStatusService {

	/**
	 * invoiceStatusRepository
	 */
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;

	/**
	 * getInvoices
	 * 
	 * @return
	 */
	public List<InvoiceStatus> getInvoices() {
		return invoiceStatusRepository.findAll();
	}

}
