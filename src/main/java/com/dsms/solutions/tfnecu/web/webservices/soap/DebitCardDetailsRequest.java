/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;

public class DebitCardDetailsRequest implements Serializable {

	private static final long serialVersionUID = -2078594688906668630L;

	public DebitCardDetailsRequest() {
	}

	private String ccNo;

	public String getCcNo() {
		return ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
