package fr.uha.anis.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.uha.anis.models.client.Client;
import fr.uha.anis.models.country.Country;
import fr.uha.anis.models.invoice.Invoice;
import fr.uha.anis.models.invoice.InvoiceStatus;
import fr.uha.anis.services.ClientService;
import fr.uha.anis.services.InvoiceService;
import fr.uha.anis.services.InvoiceStatusService;

@Controller
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;
	@Autowired
	InvoiceStatusService invoiceStatusService;
	@Autowired
	ClientService clientService;

	@GetMapping("/invoices")
	public String getInvoices(Model model) {
		List<Invoice> invoices = invoiceService.getInvoices();
		model.addAttribute("invoices", invoices);

		List<InvoiceStatus> invoicesStatus = invoiceStatusService.getInvoices();
		model.addAttribute("invoicesStatus", invoicesStatus);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		return "invoices";
	}

	@PostMapping("/addinvoice")

	public String addInvoice(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	
	@RequestMapping("/invoice/{id}")
	public String findById(@PathVariable("id") int id, Model model)
	{
		List<InvoiceStatus> invoicesStatus = invoiceStatusService.getInvoices();
		model.addAttribute("invoicesStatus", invoicesStatus);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);
		
	 Invoice invoice=invoiceService.findById(id);
	 model.addAttribute("invoice", invoice);
	 return "editInvoice";
	}
	
	@PostMapping("/updateinvoice/{id}")
	public String updateCountry(@PathVariable("id") long id,@Validated Invoice invoice, 
			  BindingResult result, Model model)
	{
		
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	@GetMapping("/deleteinvoice/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") int id)
	{
		invoiceService.delete(id);
		return  "redirect:/invoices";
	}
}
