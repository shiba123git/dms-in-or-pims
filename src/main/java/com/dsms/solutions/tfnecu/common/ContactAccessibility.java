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
@Table(name = "T_CON_ACC_DETAILS")
public class ContactAccessibility implements Serializable {

	@Id
	@GenericGenerator(name = "getObjectId", strategy = "com.dsms.solutions.tfnecu.model.hibernate.ObjectIdGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "getObjectId")
	@Column(name = "contactAccessibilityId")
	private BigInteger contactAccessibilityId;
	@Column(name = "phone1")
	private BigInteger phone1;
	@Column(name = "phone2")
	private BigInteger phone2;
	@Column(name = "fix")
	private BigInteger fix;
	@Column(name = "mobile1")
	private BigInteger mobile1;
	@Column(name = "mobile2")
	private BigInteger mobile2;
	@Column(name = "web")
	private String web;
	@Column(name = "fbPfofile")
	private String fbPfofile;
	@Column(name = "linkedinProfile")
	private String linkedinProfile;
	@Column(name = "email1")
	private String email1;
	@Column(name = "email2")
	private String email2;
	@ManyToOne
	@JoinColumn(name = "contactObjectId", nullable = false)
	private ContactDetails contactDetails;

	public ContactAccessibility() {
	}

	public ContactAccessibility(BigInteger phone1, BigInteger phone2, BigInteger fix, BigInteger mobile1,
			BigInteger mobile2, String web, String fbPfofile, String linkedinProfile, String email1, String email2,
			ContactDetails contactDetails) {
		super();
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.fix = fix;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.web = web;
		this.fbPfofile = fbPfofile;
		this.linkedinProfile = linkedinProfile;
		this.email1 = email1;
		this.email2 = email2;
		this.contactDetails = contactDetails;
	}

	public BigInteger getContactAccessibilityId() {
		return contactAccessibilityId;
	}

	public void setContactAccessibilityId(BigInteger contactAccessibilityId) {
		this.contactAccessibilityId = contactAccessibilityId;
	}

	public BigInteger getPhone1() {
		return phone1;
	}

	public void setPhone1(BigInteger phone1) {
		this.phone1 = phone1;
	}

	public BigInteger getPhone2() {
		return phone2;
	}

	public void setPhone2(BigInteger phone2) {
		this.phone2 = phone2;
	}

	public BigInteger getFix() {
		return fix;
	}

	public void setFix(BigInteger fix) {
		this.fix = fix;
	}

	public BigInteger getMobile1() {
		return mobile1;
	}

	public void setMobile1(BigInteger mobile1) {
		this.mobile1 = mobile1;
	}

	public BigInteger getMobile2() {
		return mobile2;
	}

	public void setMobile2(BigInteger mobile2) {
		this.mobile2 = mobile2;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getFbPfofile() {
		return fbPfofile;
	}

	public void setFbPfofile(String fbPfofile) {
		this.fbPfofile = fbPfofile;
	}

	public String getLinkedinProfile() {
		return linkedinProfile;
	}

	public void setLinkedinProfile(String linkedinProfile) {
		this.linkedinProfile = linkedinProfile;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

}
