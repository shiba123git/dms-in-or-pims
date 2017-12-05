/**
 * 
 */
package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Babu
 *
 */
@Entity
@Table(name = "T_CONTACT_DETAILS")
public class ContactDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1038479622686671590L;
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GenericGenerator(name = "getObjectId", strategy = "com.dsms.solutions.tfnecu.model.hibernate.ObjectIdGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "getObjectId")
	@Column(name = "contactObjectId")
	private BigInteger contactObjectId;
	@Column(name = "fName", length = 30)
	private String fName;
	@Column(name = "mname", length = 30)
	private String mname;
	@Column(name = "lname", length = 30)
	private String lname;
	@Column(name = "personalTitel", length = 30)
	private String personalTitel;
	@Column(name = "photo")
	private Blob photo;
	@OneToMany(mappedBy = "contactDetails")
	private List<ContactLocationDetails> contactLocationDetails;
	@OneToMany(mappedBy = "contactDetails")
	private List<ContactAccessibility> contactAccessibility;

	public ContactDetails(String fName, String mname, String lname, String personalTitel, Blob photo,
			List<ContactLocationDetails> contactLocationDetails, List<ContactAccessibility> contactAccessibility) {
		super();
		this.fName = fName;
		this.mname = mname;
		this.lname = lname;
		this.personalTitel = personalTitel;
		this.photo = photo;
		this.contactLocationDetails = contactLocationDetails;
		this.contactAccessibility = contactAccessibility;
	}

	public BigInteger getContactObjectId() {
		return contactObjectId;
	}

	public void setContactObjectId(BigInteger contactObjectId) {
		this.contactObjectId = contactObjectId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPersonalTitel() {
		return personalTitel;
	}

	public void setPersonalTitel(String personalTitel) {
		this.personalTitel = personalTitel;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public List<ContactLocationDetails> getContactLocationDetails() {
		return contactLocationDetails;
	}

	public void setContactLocationDetails(List<ContactLocationDetails> contactLocationDetails) {
		this.contactLocationDetails = contactLocationDetails;
	}

	public List<ContactAccessibility> getContactAccessibility() {
		return contactAccessibility;
	}

	public void setContactAccessibility(List<ContactAccessibility> contactAccessibility) {
		this.contactAccessibility = contactAccessibility;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ContactDetails() {
	}

}
