package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.models.person.JobTitle;
import delta.dev.software.services.JobTitlesService;

@Controller
public class JobTitleController {

	/**
	 * 
	 */
	@Autowired
	private JobTitlesService jobtitlesService;
	
	/**
	 * getJobTitle
	 * @param model
	 * @return
	 */
	@GetMapping("/jobtitles")
	public String getJobTitle(Model model)
	{
		List<JobTitle> jobs=jobtitlesService.getJobTitless();
		model.addAttribute("jobs", jobs);
		return "job_titles";
	}
}
