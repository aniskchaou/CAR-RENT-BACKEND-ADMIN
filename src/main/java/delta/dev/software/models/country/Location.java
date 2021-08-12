package delta.dev.software.models.country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	private String description;
	private String details;

	@ManyToOne
	@JoinColumn(name = "countryid", insertable = false, updatable = false)
	private Country country;
	private Integer countryid;

	@ManyToOne
	@JoinColumn(name = "stateid", insertable = false, updatable = false)
	private State state;
	private Integer stateid;

	private String city;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Location(Integer id, String description, String details, Country country, Integer countryid, State state,
			Integer stateid, String city, String address) {
		super();
		this.id = id;
		this.description = description;
		this.details = details;
		this.country = country;
		this.countryid = countryid;
		this.state = state;
		this.stateid = stateid;
		this.city = city;
		this.address = address;
	}

	public Location() {
		// TODO Auto-generated constructor stub
	}
}
