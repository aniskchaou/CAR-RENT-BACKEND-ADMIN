package delta.dev.software.models.invoice;

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
public class InvoiceStatus extends CommonObject {

	public InvoiceStatus() {
		super();
		
	}

	public InvoiceStatus(Integer id, String description, String details) {
		super(id, description, details);
		
	}

}
