package delta.dev.software.models.person;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import delta.dev.software.models.country.Country;
import delta.dev.software.models.country.State;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person {

	@ManyToOne
	@JoinColumn(name = "employeetypeid", insertable = false, updatable = false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	private String photo;
	private String username;

	@ManyToOne
	@JoinColumn(name = "jobtitleid", insertable = false, updatable = false)
	private JobTitle jobTitle;
	private Integer jobtitleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Integer getEmployeetypeid() {
		return employeetypeid;
	}

	public void setEmployeetypeid(Integer employeetypeid) {
		this.employeetypeid = employeetypeid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getJobtitleid() {
		return jobtitleid;
	}

	public void setJobtitleid(Integer jobtitleid) {
		this.jobtitleid = jobtitleid;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(Integer id, String firstname, String lastname, String othername, String title, String initials,
			String socialSecurityNumber, String gender, String maritalStatus, Country country, Integer countryid,
			State state, Integer stateid, Date dateOfBirth, String city, String address, String phone, String mobile,
			String email, String photo) {
		super(id, firstname, lastname, othername, title, initials, socialSecurityNumber, gender, maritalStatus, country,
				countryid, state, stateid, dateOfBirth, city, address, phone, mobile, email, photo);
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstname, String lastname, String othername, String title, String initials,
			String socialSecurityNumber, String gender, String maritalStatus, Country country, Integer countryid,
			State state, Integer stateid, Date dateOfBirth, String city, String address, String phone, String mobile,
			String email, String photo, EmployeeType employeeType, Integer employeetypeid, String photo2,
			String username, JobTitle jobTitle, Integer jobtitleid, Date hireDate) {
		super(id, firstname, lastname, othername, title, initials, socialSecurityNumber, gender, maritalStatus, country,
				countryid, state, stateid, dateOfBirth, city, address, phone, mobile, email, photo);
		this.employeeType = employeeType;
		this.employeetypeid = employeetypeid;
		photo = photo2;
		this.username = username;
		this.jobTitle = jobTitle;
		this.jobtitleid = jobtitleid;
		this.hireDate = hireDate;
	}

	public Employee() {

	}

}
