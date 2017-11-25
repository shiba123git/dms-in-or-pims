package com.dsms.solutions.tfnecu.web.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE, style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.ENCODED)
@WebService(name = "DebitCardDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsControllerInterface", portName = "DebitCardDetailsWebServicePort", serviceName = "DebitCardDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
public interface DebitCardDetailsControllerInterface {

	@WebMethod(action = "getDebitCardDetails", exclude = false)
	@WebResult(header = false, name = "getBankAccountDetails", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsResponse")
	DebitCardDetailsResponse getDebitCardDetails(
			@WebParam(header = false, mode = WebParam.Mode.IN, name = "debitCardRequest", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsRequest") DebitCardDetailsRequest debitCardRequest);

}