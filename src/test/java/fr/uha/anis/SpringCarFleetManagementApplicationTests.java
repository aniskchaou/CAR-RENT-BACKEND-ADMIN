package fr.uha.anis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import delta.dev.software.models.vehicule.Vehicule;
import delta.dev.software.repositories.EmployeeRepository;
import delta.dev.software.repositories.LocationRepository;
import delta.dev.software.repositories.VehiculeModelRepository;
import delta.dev.software.repositories.VehiculeRepository;
import delta.dev.software.repositories.VehiculeStatusRepository;
import delta.dev.software.repositories.VehiculeTypeRepository;
import delta.dev.software.services.VehiculeService;

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
