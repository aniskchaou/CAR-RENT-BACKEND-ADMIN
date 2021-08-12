package delta.dev.software.models.person;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import delta.dev.software.models.CommonObject;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EmployeeType extends CommonObject {

	public EmployeeType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeType(Integer id, String description, String details) {
		super(id, description, details);
		// TODO Auto-generated constructor stub
	}

}
