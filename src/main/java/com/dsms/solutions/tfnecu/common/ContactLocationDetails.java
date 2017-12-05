/**
 * 
 */
package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Babu
 *
 */
@Entity
@Table(name = "T_CONT_LOC_DETAILS")
public class ContactLocationDetails implements Serializable {

	@Id
	@GenericGenerator(name = "getObjectId", strategy = "com.dsms.solutions.tfnecu.model.hibernate.ObjectIdGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "getObjectId")
	@Column(name = "contactLocationObjectId")
	private BigInteger contactLocationObjectId;
	@Column(name = "countery")
	private String countery;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "zip")
	private int zip;
	@Column(name = "address")
	private String address;
	@ManyToOne
	@JoinColumn(name = "contactObjectId", nullable = false)
	private ContactDetails contactDetails;

	public ContactLocationDetails() {
	}

	public ContactLocationDetails(String countery, String state, String city, int zip, String address,
			ContactDetails contactDetails) {
		super();
		this.countery = countery;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.address = address;
		this.contactDetails = contactDetails;
	}

	public BigInteger getContactLocationObjectId() {
		return contactLocationObjectId;
	}

	public void setContactLocationObjectId(BigInteger contactLocationObjectId) {
		this.contactLocationObjectId = contactLocationObjectId;
	}

	public String getCountery() {
		return countery;
	}

	public void setCountery(String countery) {
		this.countery = countery;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

}
