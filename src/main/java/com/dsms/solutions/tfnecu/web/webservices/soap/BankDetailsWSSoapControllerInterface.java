package com.dsms.solutions.tfnecu.web.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "BankDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsWSSoapControllerInterface", portName = "BankDetailsWebServicePort", serviceName = "BankDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
interface BankDetailsWSSoapControllerInterface {

	@WebMethod(action = "getBankAccountDetails", exclude = false)
	@WebResult(header = false, name = "getBankAccountDetails", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsResponse")
	BankDetailsResponse getBankAccountDetails(
			@WebParam(header = false, mode = WebParam.Mode.IN, name = "bankAccountRequest", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsRequest") BankDetailsRequest bankAccountRequest);

}