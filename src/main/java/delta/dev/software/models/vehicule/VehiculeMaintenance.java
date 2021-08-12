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

import delta.dev.software.models.client.Supplier;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehiculeMaintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "vehicleid", insertable = false, updatable = false)
	private Vehicule vehicule;
	private Integer vehicleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;

	private Double price;

	@ManyToOne
	@JoinColumn(name = "supplierid", insertable = false, updatable = false)
	private Supplier supplier;
	private Integer supplierid;

	private String remarks;

	public VehiculeMaintenance() {
		// TODO Auto-generated constructor stub
	}

	public VehiculeMaintenance(int id, Vehicule vehicle, Integer vehicleid, Date startDate, Date endDate, Double price,
			Supplier supplier, Integer supplierid, String remarks) {
		super();
		this.id = id;
		this.vehicule = vehicle;
		this.vehicleid = vehicleid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.supplier = supplier;
		this.supplierid = supplierid;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicule getVehicle() {
		return vehicule;
	}

	public void setVehicle(Vehicule vehicle) {
		this.vehicule = vehicle;
	}

	public Integer getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(Integer vehicleid) {
		this.vehicleid = vehicleid;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
