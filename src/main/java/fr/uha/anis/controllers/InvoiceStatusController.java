package fr.uha.anis.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class InvoiceStatusController {

	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
