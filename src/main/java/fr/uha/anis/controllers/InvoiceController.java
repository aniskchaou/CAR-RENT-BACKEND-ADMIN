package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.services.InvoiceService;

@Controller
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;
	@GetMapping("/invoices")
	public String getInvoices(Model model)
	{
		List<Invoice> invoices=invoiceService.getInvoices();
		model.addAttribute("invoices", invoices);
		return "invoices";
	}
}
