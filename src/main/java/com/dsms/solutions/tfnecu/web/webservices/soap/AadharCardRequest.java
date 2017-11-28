/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.Serializable;

/**
 * @author Babu
 *
 */
public class AadharCardRequest implements Serializable {

	private static final long serialVersionUID = 2392066326000927365L;

	public AadharCardRequest() {
	}

	private String aadharCardNo;

	public String getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
