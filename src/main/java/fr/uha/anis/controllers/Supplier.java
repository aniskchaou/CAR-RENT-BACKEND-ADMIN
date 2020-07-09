package fr.uha.anis.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class Supplier {

	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
