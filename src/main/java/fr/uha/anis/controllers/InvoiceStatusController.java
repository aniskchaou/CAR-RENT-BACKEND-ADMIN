package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.invoice.InvoiceStatus;
import fr.uha.anis.repositories.InvoiceStatusRepository;
import fr.uha.anis.services.InvoiceStatusService;
@Controller
public class InvoiceStatusController {

	@Autowired
	InvoiceStatusService invoiceStatusService;
	
	@GetMapping("/invoicestatus")
	public String getInvoiceStatus(Model model)
	{
		List<InvoiceStatus> invoicestatus=invoiceStatusService.getInvoices();
		model.addAttribute("invoices", invoicestatus);
		return "invoices_status";
	}
}
