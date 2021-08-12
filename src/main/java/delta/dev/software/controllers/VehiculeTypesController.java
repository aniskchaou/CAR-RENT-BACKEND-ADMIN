package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.models.vehicule.VehiculeType;
import delta.dev.software.services.VehiculeTypeService;

/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 */
@Controller
public class VehiculeTypesController {

	/**
	 * vehiculeTypeService
	 */
	@Autowired
	private VehiculeTypeService vehiculeTypeService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculetypes")
	public String getCountries(Model model) {
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		return "vehicule_types";
	}

}
