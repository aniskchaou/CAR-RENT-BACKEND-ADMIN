package fr.uha.anis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.uha.anis.models.person.JobTitle;
import fr.uha.anis.services.JobTitlesService;

@Controller
public class JobTitleController {

	@Autowired
	private JobTitlesService jobtitlesService;
	
	@GetMapping("/jobtitles")
	public String getCountries(Model model)
	{
		List<JobTitle> jobs=jobtitlesService.getJobTitless();
		model.addAttribute("jobs", jobs);
		return "job_titles";
	}
}
