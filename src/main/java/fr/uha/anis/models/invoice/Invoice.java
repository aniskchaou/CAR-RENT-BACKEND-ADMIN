package fr.uha.anis.models.invoice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.uha.anis.models.client.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Invoice {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date invoiceDate;
	
	@ManyToOne
	@JoinColumn(name="invoicestatusid", insertable=false, updatable=false)	
	private InvoiceStatus invoiceStatus;
	private Integer invoicestatusid;
	
	@ManyToOne
	@JoinColumn(name="clientid", insertable=false, updatable=false)	
	private Client client;
	private Integer clientid;
	
	private String remarks;	
}
