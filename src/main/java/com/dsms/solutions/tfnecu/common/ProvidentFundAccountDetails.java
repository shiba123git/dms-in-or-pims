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
@Table(name = "T_PPF_DETAILS")
public class ProvidentFundAccountDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "getObjectId", strategy = "com.dsms.solutions.tfnecu.model.hibernate.ObjectIdGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "getObjectId")
	@Column(name = "pfObjectId")
	private BigInteger pfObjectId;
	@Column(name = "pfNumber")
	private String pfNumber;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "officeName")
	private String officeName;
	@ManyToOne()
	@JoinColumn(name = "uanNumber", nullable = false)
	private UniversalAccountNumber uan;

	public ProvidentFundAccountDetails() {
		super();
	}

	public ProvidentFundAccountDetails(String pfNumber, String companyName, String officeName,
			UniversalAccountNumber uan) {
		super();
		this.pfNumber = pfNumber;
		this.companyName = companyName;
		this.officeName = officeName;
		this.uan = uan;
	}

	public BigInteger getPfObjectId() {
		return pfObjectId;
	}

	public void setPfObjectId(BigInteger pfObjectId) {
		this.pfObjectId = pfObjectId;
	}

	public String getPfNumber() {
		return pfNumber;
	}

	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public UniversalAccountNumber getUan() {
		return uan;
	}

	public void setUan(UniversalAccountNumber uan) {
		this.uan = uan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((officeName == null) ? 0 : officeName.hashCode());
		result = prime * result + ((pfNumber == null) ? 0 : pfNumber.hashCode());
		result = prime * result + ((pfObjectId == null) ? 0 : pfObjectId.hashCode());
		result = prime * result + ((uan == null) ? 0 : uan.hashCode());
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
		ProvidentFundAccountDetails other = (ProvidentFundAccountDetails) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (officeName == null) {
			if (other.officeName != null)
				return false;
		} else if (!officeName.equals(other.officeName))
			return false;
		if (pfNumber == null) {
			if (other.pfNumber != null)
				return false;
		} else if (!pfNumber.equals(other.pfNumber))
			return false;
		if (pfObjectId == null) {
			if (other.pfObjectId != null)
				return false;
		} else if (!pfObjectId.equals(other.pfObjectId))
			return false;
		if (uan == null) {
			if (other.uan != null)
				return false;
		} else if (!uan.equals(other.uan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProvidentFundAccountDetails [pfObjectId=" + pfObjectId + ", pfNumber=" + pfNumber + ", companyName="
				+ companyName + ", officeName=" + officeName + ", uan=" + uan + "]";
	}

}
