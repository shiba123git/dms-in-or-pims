package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Clob;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author shmi0516
 *
 */
@Entity
@Table(name = "BANK_ACCOUNT_DETAILS")
public class BankAccountDetails implements Serializable {

	private static final long serialVersionUID = 5492175215530426780L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bankAccountId")
	private int bankAccountId;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "ifsccode")
	private String ifsccode;
	@Column(name = "accountNumber")
	private BigInteger accountNumber;
	@Column(name = "panNo")
	private String panNo;
	@Column(name = "adharCard")
	private String adharCard;
	@Column(name = "userId")
	private String userId;
	@Column(name = "password")
	private String password;
	@Column(name = "transactionPassword")
	private String transactionPassword;
	@Column(name = "registeredMobileNumber")
	private BigInteger registeredMobileNumber;
	@Column(name = "registeredEmail")
	private String registeredEmail;
	@Column(name = "isPPFEnable")
	private boolean isPPFEnable;
	@Column(name = "isOnline")
	private boolean isOnline;
	@Column(name = "url")
	private String url;
	@Column(name = "status")
	private String status;
	@Column(name = "bankImage")
	private Clob bankImage;

	@OneToMany(mappedBy = "bankAccountDetails")
	private Set<DebitCardDetails> debitcardDetails;

	@OneToMany(mappedBy = "bankAccountDetails")
	private List<CreditCardDetails> creditcardDetails;

	public BankAccountDetails() {

	}

	public BankAccountDetails(String bankName, String ifsccode, BigInteger accountNumber, String panNo,
			String adharCard, String userId, String password, String transactionPassword,
			BigInteger registeredMobileNumber, String registeredEmail, boolean isPPFEnable, boolean isOnline,
			String url, String status, Clob bankImage, Set<DebitCardDetails> debitcardDetails,
			List<CreditCardDetails> creditcardDetails) {
		super();
		this.bankName = bankName;
		this.ifsccode = ifsccode;
		this.accountNumber = accountNumber;
		this.panNo = panNo;
		this.adharCard = adharCard;
		this.userId = userId;
		this.password = password;
		this.transactionPassword = transactionPassword;
		this.registeredMobileNumber = registeredMobileNumber;
		this.registeredEmail = registeredEmail;
		this.isPPFEnable = isPPFEnable;
		this.isOnline = isOnline;
		this.url = url;
		this.status = status;
		this.bankImage = bankImage;
		this.debitcardDetails = debitcardDetails;
		this.creditcardDetails = creditcardDetails;
	}

	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	public BigInteger getRegisteredMobileNumber() {
		return registeredMobileNumber;
	}

	public void setRegisteredMobileNumber(BigInteger registeredMobileNumber) {
		this.registeredMobileNumber = registeredMobileNumber;
	}

	public String getRegisteredEmail() {
		return registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public boolean isPPFEnable() {
		return isPPFEnable;
	}

	public void setPPFEnable(boolean isPPFEnable) {
		this.isPPFEnable = isPPFEnable;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Clob getBankImage() {
		return bankImage;
	}

	public void setBankImage(Clob bankImage) {
		this.bankImage = bankImage;
	}

	public Set<DebitCardDetails> getDebitcardDetails() {
		return debitcardDetails;
	}

	public void setDebitcardDetails(Set<DebitCardDetails> debitcardDetails) {
		this.debitcardDetails = debitcardDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((adharCard == null) ? 0 : adharCard.hashCode());
		result = prime * result + bankAccountId;
		result = prime * result + ((bankImage == null) ? 0 : bankImage.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((debitcardDetails == null) ? 0 : debitcardDetails.hashCode());
		result = prime * result + ((ifsccode == null) ? 0 : ifsccode.hashCode());
		result = prime * result + (isOnline ? 1231 : 1237);
		result = prime * result + (isPPFEnable ? 1231 : 1237);
		result = prime * result + ((panNo == null) ? 0 : panNo.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((registeredEmail == null) ? 0 : registeredEmail.hashCode());
		result = prime * result + ((registeredMobileNumber == null) ? 0 : registeredMobileNumber.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transactionPassword == null) ? 0 : transactionPassword.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		BankAccountDetails other = (BankAccountDetails) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (adharCard == null) {
			if (other.adharCard != null)
				return false;
		} else if (!adharCard.equals(other.adharCard))
			return false;
		if (bankAccountId != other.bankAccountId)
			return false;
		if (bankImage == null) {
			if (other.bankImage != null)
				return false;
		} else if (!bankImage.equals(other.bankImage))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (debitcardDetails == null) {
			if (other.debitcardDetails != null)
				return false;
		} else if (!debitcardDetails.equals(other.debitcardDetails))
			return false;
		if (ifsccode == null) {
			if (other.ifsccode != null)
				return false;
		} else if (!ifsccode.equals(other.ifsccode))
			return false;
		if (isOnline != other.isOnline)
			return false;
		if (isPPFEnable != other.isPPFEnable)
			return false;
		if (panNo == null) {
			if (other.panNo != null)
				return false;
		} else if (!panNo.equals(other.panNo))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (registeredEmail == null) {
			if (other.registeredEmail != null)
				return false;
		} else if (!registeredEmail.equals(other.registeredEmail))
			return false;
		if (registeredMobileNumber == null) {
			if (other.registeredMobileNumber != null)
				return false;
		} else if (!registeredMobileNumber.equals(other.registeredMobileNumber))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (transactionPassword == null) {
			if (other.transactionPassword != null)
				return false;
		} else if (!transactionPassword.equals(other.transactionPassword))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public List<CreditCardDetails> getCreditcardDetails() {
		return creditcardDetails;
	}

	public void setCreditcardDetails(List<CreditCardDetails> creditcardDetails) {
		this.creditcardDetails = creditcardDetails;
	}

}
