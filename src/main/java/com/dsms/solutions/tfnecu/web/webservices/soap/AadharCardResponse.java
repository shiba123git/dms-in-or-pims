package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;
import java.util.List;

import com.dsms.solutions.tfnecu.common.AadharCardDetails;

public class AadharCardResponse implements Serializable {

	private static final long serialVersionUID = -6105874092924557949L;

	public AadharCardResponse() {
	}

	private String statusCode;
	private String status;
	private String responseMessage;
	private List<AadharCardDetails> aadharCardDetails;

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

	public List<AadharCardDetails> getAadharCardDetails() {
		return aadharCardDetails;
	}

	public void setAadharCardDetails(List<AadharCardDetails> aadharCardDetails) {
		this.aadharCardDetails = aadharCardDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
