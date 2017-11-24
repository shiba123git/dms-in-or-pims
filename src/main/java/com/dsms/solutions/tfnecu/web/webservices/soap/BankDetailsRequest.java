package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;

public class BankDetailsRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountNumber;

	public BankDetailsRequest(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BankDetailsRequest() {
		super();
	}

}
