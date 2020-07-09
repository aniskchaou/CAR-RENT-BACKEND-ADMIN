package fr.uha.anis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ClientController {
	@GetMapping("/clients")
	public String index()
	{
		return "index";
	}
}
