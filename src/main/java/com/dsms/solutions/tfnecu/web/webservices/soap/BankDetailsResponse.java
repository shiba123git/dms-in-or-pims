/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;
import java.util.List;

import com.dsms.solutions.tfnecu.common.BankAccountDetails;

/**
 * @author Babu
 *
 */
public class BankDetailsResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2530284352290050822L;
	private String statusCode;
	private String status;
	private String responseMessage;
	private List<BankAccountDetails> bankAccountDetails;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BankAccountDetails> getBankAccountDetails() {
		return bankAccountDetails;
	}

	public void setBankAccountDetails(List<BankAccountDetails> bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
