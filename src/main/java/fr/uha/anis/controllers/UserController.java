package fr.uha.anis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import fr.uha.anis.models.user.Userss;
import fr.uha.anis.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/profile")
	public String index()
	{
		return "profile";
	}

	@PostMapping(value="adduser")
	public RedirectView addNew(Userss user, RedirectAttributes redir) {
		userService.save(user);	
		RedirectView  redirectView= new RedirectView("/login",true);
	        
	    return redirectView;				
	}	
}
