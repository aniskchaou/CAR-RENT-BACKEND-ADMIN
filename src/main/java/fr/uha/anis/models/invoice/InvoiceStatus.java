package fr.uha.anis.models.invoice;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.uha.anis.models.CommonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class InvoiceStatus extends CommonObject {

	public InvoiceStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceStatus(Integer id, String description, String details) {
		super(id, description, details);
		// TODO Auto-generated constructor stub
	}

}
