package fr.uha.anis.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class LocationController {
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
