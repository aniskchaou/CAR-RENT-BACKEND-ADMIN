package fr.uha.anis.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
