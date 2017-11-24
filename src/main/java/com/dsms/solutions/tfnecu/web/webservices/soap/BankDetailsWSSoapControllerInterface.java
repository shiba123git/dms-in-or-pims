package com.dsms.solutions.tfnecu.web.webservices.soap;

import javax.jws.WebMethod;

public interface BankDetailsWSSoapControllerInterface {

	BankDetailsResponse getBankAccountDetails(BankDetailsRequest bankAccountRequest);

}