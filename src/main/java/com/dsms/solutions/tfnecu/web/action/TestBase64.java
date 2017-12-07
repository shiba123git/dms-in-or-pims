package com.dsms.solutions.tfnecu.web.action;

import com.dsms.solutions.tfnecu.base64.encode.decode.DSMSBase64Encryption;

public class TestBase64 {

	public static void main(String[] args) {

		String value = "Shiba134@";
		String encodedValue = DSMSBase64Encryption.encryptData(value);
		System.out.println("Encoded Value is:::::" + encodedValue);
		String decodedValue = DSMSBase64Encryption.decryptData(encodedValue.getBytes());
		System.out.println("Decoded Value is  " + decodedValue);

	}

}
