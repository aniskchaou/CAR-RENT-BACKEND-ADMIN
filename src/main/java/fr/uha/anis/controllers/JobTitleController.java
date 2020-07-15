package fr.uha.anis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

	@GetMapping("/jobtitle")
	public String index()
	{
		return "job_title";
	}
}
