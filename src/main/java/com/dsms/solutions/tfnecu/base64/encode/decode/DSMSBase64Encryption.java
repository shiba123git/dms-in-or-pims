/**
 * 
 */
package com.dsms.solutions.tfnecu.base64.encode.decode;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.xml.wss.impl.misc.Base64;

/**
 * @author Babu
 *
 */
@SuppressWarnings("restriction")
public class DSMSBase64Encryption {

	public static String encryptData(String paramValue) {
		return (paramValue != null) ? Base64.encode(paramValue.getBytes()) : Base64.encode(paramValue.getBytes());
	}

	@SuppressWarnings("restriction")
	public static String decryptData(byte[] paramValue) {
		byte[] decodedValue = null;
		try {
			decodedValue = Base64.decode(paramValue);
		} catch (Base64DecodingException e) {
			e.printStackTrace();
		}
		String decodedVaalueString = new String(decodedValue);
		return decodedVaalueString;
	}

}
