package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.models.vehicule.VehicleModel;
import delta.dev.software.services.VehiculeModelService;

/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 */
@Controller
public class VehiculeModelController {
	
	/**
	 * vehiculeModelService
	 */
	@Autowired
	private VehiculeModelService vehiculeModelService;
	
	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculemodels")
	public String getCountries(Model model)
	{
		List<VehicleModel> vehiculemodels=vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculemodels", vehiculemodels);
		return "vehicule_models";
	}
	
}
