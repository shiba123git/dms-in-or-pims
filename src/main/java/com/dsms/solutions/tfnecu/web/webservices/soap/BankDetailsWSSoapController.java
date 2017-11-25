/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.dsms.solutions.tfnecu.common.BankAccountDetails;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountService;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountServiceImpl;

@WebService(name = "BankDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsWSSoapControllerInterface", portName = "BankDetailsWebServicePort", serviceName = "BankDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
public class BankDetailsWSSoapController implements BankDetailsWSSoapControllerInterface {

	public static final String EMPTY_ACCOUNT_NUMBER = "Account Number";

	@WebMethod(action = "getBankAccountDetails", exclude = false)
	@SuppressWarnings("unchecked")
	@WebResult(header = false, name = "getBankAccountDetails", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsResponse")
	public BankDetailsResponse getBankAccountDetails(
			@WebParam(header = false, mode = WebParam.Mode.IN, name = "bankAccountRequest", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.BankDetailsRequest") BankDetailsRequest bankAccountRequest) {
		BankDetailsResponse bankAccountResponse = new BankDetailsResponse();
		if (null == bankAccountRequest.getAccountNumber()) {
			bankAccountResponse.setStatus(WEBSERVICESTATUS.FAILURE.toString());
			bankAccountResponse.setStatusCode(WEB_SERVICE_STATUS_CODE.SUC001.toString());
			bankAccountResponse.setResponseMessage(
					String.format(WEB_SERVICE_CONSTANT_MESSAGE.EMPTY_INPUT.FORMAT_MESSAGE, EMPTY_ACCOUNT_NUMBER));
		}
		@SuppressWarnings("rawtypes")
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		BankAccountDetails bad = new BankAccountDetails();
		bad.setAccountNumber(new BigInteger("11196203437"));
		bad.setAdharCard("836010197307");
		bad.setBankName("SBI");
		bad.setOnline(true);
		bad.setStatus("Active");
		bad.setPanNo("BNZPM3658M");
		bad.setRegisteredEmail("spm09.mishra@gmail.com");
		bad.setRegisteredMobileNumber(new BigInteger("7204118564"));
		bad.setUserId("shibaprasad143");
		bad.setPassword("shibaprasad123@");
		bad.setTransactionPassword("prasad143@");
		bad.setIfsccode("SBIN0002071");

		try {
			List<BankAccountDetails> bankList = new CopyOnWriteArrayList<BankAccountDetails>();
			bankList.add(bad);
			bankAccountResponse.setBankAccountDetails(bankList);
			bankAccountResponse.setResponseMessage(WEBSERVICESTATUS.SUCCESS.toString());
			bankAccountResponse.setStatusCode(WEB_SERVICE_STATUS_CODE.SUC000.toString());
			// bankList = bankAccountService.getBankbyAccountNumber(new
			// BigInteger(bankAccountRequest.getAccountNumber()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return bankAccountResponse;
	}
}
