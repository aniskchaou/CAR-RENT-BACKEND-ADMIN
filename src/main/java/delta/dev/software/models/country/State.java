package delta.dev.software.models.country;

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
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String capital;
	private String code;

	@ManyToOne
	@JoinColumn(name = "countryid", insertable = false, updatable = false)
	private Country country;

	private Integer countryid;

	private String details;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public State(Integer id, String name, String capital, String code, Country country, Integer countryid,
			String details) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.code = code;
		this.country = country;
		this.countryid = countryid;
		this.details = details;
	}

	public State() {
		// TODO Auto-generated constructor stub
	}
}
