/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.math.BigInteger;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.dsms.solutions.tfnecu.common.BankAccountDetails;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountService;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountServiceImpl;

@WebService(name = "BankDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsWSSoapControllerInterface", portName = "BankDetailsWebServicePort", serviceName = "BankDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
public class BankDetailsWSSoapController implements BankDetailsWSSoapControllerInterface {

	@WebMethod(action = "getBankAccountDetails", exclude = false)
	@SuppressWarnings("unchecked")
	@WebResult(header = false, name = "getBankAccountDetails", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsResponse")
	public BankDetailsResponse getBankAccountDetails(
			@WebParam(header = false, mode = WebParam.Mode.IN, name = "bankAccountRequest", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsRequest") BankDetailsRequest bankAccountRequest) {
		BankDetailsResponse bankAccountResponse = new BankDetailsResponse();
		if (null == bankAccountRequest.getAccountNumber()) {
			bankAccountResponse.setStatus(WEBSERVICESTATUS.FAILURE.toString());
			bankAccountResponse.setStatusCode(WEB_SERVICE_STATUS_CODE.SUC001.toString());
			bankAccountResponse.setResponseMessage(WEB_SERVICE_CONSTANT_MESSAGE.EMPTY_INPUT.EMPTY_ACCOUNT_NUMBER);
		}
		@SuppressWarnings("rawtypes")
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		try {
			@SuppressWarnings("unused")
			List<BankAccountDetails> bankList = bankAccountService
					.getBankbyAccountNumber(new BigInteger(bankAccountRequest.getAccountNumber()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bankAccountResponse;
	}
}
