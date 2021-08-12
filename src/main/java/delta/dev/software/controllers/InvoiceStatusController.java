package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.models.invoice.InvoiceStatus;
import delta.dev.software.services.InvoiceStatusService;

/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 * 
 */
@Controller
public class InvoiceStatusController {

	/**
	 * invoiceStatusService
	 */
	@Autowired
	InvoiceStatusService invoiceStatusService;
	
	/**
	 * getInvoiceStatus
	 * @param model
	 * @return
	 */
	@GetMapping("/invoicestatus")
	public String getInvoiceStatus(Model model)
	{
		List<InvoiceStatus> invoicestatus=invoiceStatusService.getInvoices();
		model.addAttribute("invoices", invoicestatus);
		return "invoices_status";
	}
}
