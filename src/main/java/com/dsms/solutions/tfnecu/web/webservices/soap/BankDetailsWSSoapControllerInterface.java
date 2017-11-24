package com.dsms.solutions.tfnecu.web.webservices.soap;

import javax.jws.WebService;

@WebService(name = "BankDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsWSSoapControllerInterface", portName = "BankDetailsWebServicePort", serviceName = "BankDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
interface BankDetailsWSSoapControllerInterface {

	BankDetailsResponse getBankAccountDetails(BankDetailsRequest bankAccountRequest);

}