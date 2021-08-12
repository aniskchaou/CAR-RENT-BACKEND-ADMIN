package delta.dev.software.models.vehicule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import delta.dev.software.models.country.Location;
import delta.dev.software.models.person.Employee;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String name;
	@ManyToOne
	@JoinColumn(name = "vehicletypeid", insertable = false, updatable = false)
	private VehiculeType vehicleType;
	private Integer vehicletypeid;

	private String vehicleNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;

	private String power;
	private String fuelCapacity;
	@ManyToOne
	@JoinColumn(name = "vehiclestatusid", insertable = false, updatable = false)
	private VehicleStatus vehicleStatus;
	private Integer vehiclestatusid;

	private String netWeight;

	@ManyToOne
	@JoinColumn(name = "employeeid", insertable = false, updatable = false)
	private Employee inCharge;
	private Integer employeeid;

	@ManyToOne
	@JoinColumn(name = "vehiclemodelid", insertable = false, updatable = false)
	private VehicleModel vehicleModel;
	private Integer vehiclemodelid;

	@ManyToOne
	@JoinColumn(name = "locationid", insertable = false, updatable = false)
	private Location currentLocation;
	private Integer locationid;

	private String remarks;

	public Vehicule(int id, String name, VehiculeType vehicleType, Integer vehicletypeid, String vehicleNumber,
			Date registrationDate, Date acquisitionDate, String description, String power, String fuelCapacity,
			VehicleStatus vehicleStatus, Integer vehiclestatusid, String netWeight, Employee inCharge,
			Integer employeeid, VehicleModel vehicleModel, Integer vehiclemodelid, Location currentLocation,
			Integer locationid, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleType = vehicleType;
		this.vehicletypeid = vehicletypeid;
		this.vehicleNumber = vehicleNumber;
		this.registrationDate = registrationDate;
		this.acquisitionDate = acquisitionDate;
		this.description = description;
		this.power = power;
		this.fuelCapacity = fuelCapacity;
		this.vehicleStatus = vehicleStatus;
		this.vehiclestatusid = vehiclestatusid;
		this.netWeight = netWeight;
		this.inCharge = inCharge;
		this.employeeid = employeeid;
		this.vehicleModel = vehicleModel;
		this.vehiclemodelid = vehiclemodelid;
		this.currentLocation = currentLocation;
		this.locationid = locationid;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehiculeType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehiculeType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVehicletypeid() {
		return vehicletypeid;
	}

	public void setVehicletypeid(Integer vehicletypeid) {
		this.vehicletypeid = vehicletypeid;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public VehicleStatus getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(VehicleStatus vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public Integer getVehiclestatusid() {
		return vehiclestatusid;
	}

	public void setVehiclestatusid(Integer vehiclestatusid) {
		this.vehiclestatusid = vehiclestatusid;
	}

	public String getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}

	public Employee getInCharge() {
		return inCharge;
	}

	public void setInCharge(Employee inCharge) {
		this.inCharge = inCharge;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Integer getVehiclemodelid() {
		return vehiclemodelid;
	}

	public void setVehiclemodelid(Integer vehiclemodelid) {
		this.vehiclemodelid = vehiclemodelid;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Vehicule() {
		// TODO Auto-generated constructor stub
	}
}
