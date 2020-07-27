package fr.uha.anis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import fr.uha.anis.models.vehicule.Vehicule;
import fr.uha.anis.repositories.EmployeeRepository;
import fr.uha.anis.repositories.LocationRepository;
import fr.uha.anis.repositories.VehiculeModelRepository;
import fr.uha.anis.repositories.VehiculeRepository;
import fr.uha.anis.repositories.VehiculeStatusRepository;
import fr.uha.anis.repositories.VehiculeTypeRepository;
import fr.uha.anis.services.EmployeeService;
import fr.uha.anis.services.LocationService;
import fr.uha.anis.services.VehiculeModelService;
import fr.uha.anis.services.VehiculeService;
import fr.uha.anis.services.VehiculeStatusService;
import fr.uha.anis.services.VehiculeTypeService;

@SpringBootTest
class SpringCarFleetManagementApplicationTests {

	@Mock
	VehiculeRepository vehiculeRepository;

	@InjectMocks
	private VehiculeService vehiculeService;

	@Autowired
	VehiculeTypeRepository vehiculeTypeRepository;

	@Autowired
	VehiculeStatusRepository vehiculeStatusRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	VehiculeModelRepository vehiculeModelRepository;

	@Autowired
	LocationRepository locationRepository;

	@Test
	public void getVehiculesTest() {

		Vehicule v = new Vehicule(1, "Toyota", vehiculeTypeRepository.findById(1).get(), 1, "32D2D22", new Date(),
				new Date(), "", "", "", vehiculeStatusRepository.findById(1).get(), 1, "22",
				employeeRepository.findById(1).get(), 1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "none");
		Vehicule v2 = new Vehicule(2, "Toyota2", vehiculeTypeRepository.findById(1).get(), 1, "32D2D22", new Date(),
				new Date(), "", "", "", vehiculeStatusRepository.findById(1).get(), 1, "22",
				employeeRepository.findById(1).get(), 1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "none");
		List<Vehicule> list = new ArrayList<Vehicule>();
		list.add(v);
		list.add(v2);
		when(vehiculeRepository.findAll()).thenReturn(list);

		assertEquals(2, vehiculeService.getVehicules().size());

	}

	@Test
	public void getVehiculeByIdTest() {
		Vehicule v2 = new Vehicule(3, "Toyota", vehiculeTypeRepository.findById(1).get(), 1, "32D2D22", new Date(),
				new Date(), "", "", "", vehiculeStatusRepository.findById(1).get(), 1, "22",
				employeeRepository.findById(1).get(), 1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "none");

		when(vehiculeRepository.findById(3)).thenReturn(Optional.of(v2));
		Vehicule vehicule = vehiculeService.findById(3).get();

		assertEquals("Toyota", vehicule.getName());
		assertEquals(3, vehicule.getId());
	}

	@Test
	public void addVehiculeTest() {
		Vehicule v1 = new Vehicule(4, "Toyota", vehiculeTypeRepository.findById(1).get(), 1, "32D2D22", new Date(),
				new Date(), "", "", "", vehiculeStatusRepository.findById(1).get(), 1, "22",
				employeeRepository.findById(1).get(), 1, vehiculeModelRepository.findById(1).get(), 1,
				locationRepository.findById(1).get(), 1, "none");

		vehiculeService.save(v1);
		verify(vehiculeRepository, times(1)).save(v1);
	}

	
}
