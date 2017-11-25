/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;
import java.util.List;

import com.dsms.solutions.tfnecu.common.DebitCardDetails;

public class DebitCardDetailsResponse implements Serializable {

	private static final long serialVersionUID = 5113194748263437054L;

	public DebitCardDetailsResponse() {
	}

	private String statusCode;
	private String status;
	private String responseMessage;
	private List<DebitCardDetails> debitCardDetails;

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

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public List<DebitCardDetails> getDebitCardDetails() {
		return debitCardDetails;
	}

	public void setDebitCardDetails(List<DebitCardDetails> debitCardDetails) {
		this.debitCardDetails = debitCardDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
