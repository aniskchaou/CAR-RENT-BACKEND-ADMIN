package delta.dev.software.controllers;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * ContactController
 * @author Delta Dev Software
 * @version 0.1
 */
public class ContactController {
	
	/**
	 * index : returns index page
	 * @return
	 */
	@GetMapping("/index")
	public String getContacts()
	{
		return "index";
	}
}
