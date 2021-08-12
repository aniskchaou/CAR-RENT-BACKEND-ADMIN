package delta.dev.software.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import delta.dev.software.models.vehicule.VehicleStatus;
import delta.dev.software.services.VehiculeStatusService;
/**
 * 
 * @author Delta Dev Software
 * @version 0.1
 */
@Controller
public class VehiculeStatusController {
	/**
	 * vehiculeStatusService
	 */
	@Autowired
	private VehiculeStatusService vehiculeStatusService;
	
	/**
	 * getVehiculeStatus
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculestatus")
	public String getVehiculeStatus(Model model)
	{
		List<VehicleStatus> vehiculestatuss=vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculestatuss", vehiculestatuss);
		return "vehicule_status";
	}
	
}
