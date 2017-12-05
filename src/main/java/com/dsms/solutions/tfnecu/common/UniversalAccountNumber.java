/**
 * 
 */
package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "T_UAN_DETAILS")
public class UniversalAccountNumber implements Serializable {

	private static final long serialVersionUID = 468516554788848028L;
	@Id
	@GenericGenerator(name = "getObjectId", strategy = "com.dsms.solutions.tfnecu.model.hibernate.ObjectIdGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "getObjectId")
	@Column(name = "uanObjectId")
	private BigInteger uanObjectId;
	@Column(name = "uanNumber")
	private BigInteger uanNumber;
	@Column(name = "name")
	private String name;
	@Column(name = "mobile")
	private BigInteger mobile;
	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "uan")
	private List<ProvidentFundAccountDetails> pfDetails;

	public UniversalAccountNumber() {
		super();
	}

	public UniversalAccountNumber(BigInteger uanNumber, String name, BigInteger mobile, String email,
			List<ProvidentFundAccountDetails> pfDetails) {
		super();
		this.uanNumber = uanNumber;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.pfDetails = pfDetails;
	}

	public BigInteger getUanObjectId() {
		return uanObjectId;
	}

	public void setUanObjectId(BigInteger uanObjectId) {
		this.uanObjectId = uanObjectId;
	}

	public BigInteger getUanNumber() {
		return uanNumber;
	}

	public void setUanNumber(BigInteger uanNumber) {
		this.uanNumber = uanNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getMobile() {
		return mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ProvidentFundAccountDetails> getPfDetails() {
		return pfDetails;
	}

	public void setPfDetails(List<ProvidentFundAccountDetails> pfDetails) {
		this.pfDetails = pfDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pfDetails == null) ? 0 : pfDetails.hashCode());
		result = prime * result + ((uanNumber == null) ? 0 : uanNumber.hashCode());
		result = prime * result + ((uanObjectId == null) ? 0 : uanObjectId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversalAccountNumber other = (UniversalAccountNumber) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pfDetails == null) {
			if (other.pfDetails != null)
				return false;
		} else if (!pfDetails.equals(other.pfDetails))
			return false;
		if (uanNumber == null) {
			if (other.uanNumber != null)
				return false;
		} else if (!uanNumber.equals(other.uanNumber))
			return false;
		if (uanObjectId == null) {
			if (other.uanObjectId != null)
				return false;
		} else if (!uanObjectId.equals(other.uanObjectId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UniversalAccountNumber [uanObjectId=" + uanObjectId + ", uanNumber=" + uanNumber + ", name=" + name
				+ ", mobile=" + mobile + ", email=" + email + ", pfDetails=" + pfDetails + "]";
	}

}
