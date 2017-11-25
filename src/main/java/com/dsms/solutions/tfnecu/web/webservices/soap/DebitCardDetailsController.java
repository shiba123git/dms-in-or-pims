package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.dsms.solutions.tfnecu.common.DebitCardDetails;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountService;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountServiceImpl;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE, style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.ENCODED)
@WebService(name = "DebitCardDetailsWebService", endpointInterface = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsControllerInterface", portName = "DebitCardDetailsWebServicePort", serviceName = "DebitCardDetailsWebService", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap", wsdlLocation = "")
public class DebitCardDetailsController implements DebitCardDetailsControllerInterface {

	public DebitCardDetailsController() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsms.solutions.tfnecu.web.webservices.soap.
	 * DebitCardDetailsControllerInterface#getDebitCardDetails(com.dsms.
	 * solutions.tfnecu.web.webservices.soap.DebitCardDetailsRequest)
	 */
	@WebMethod(action = "getDebitCardDetails", exclude = false)
	@SuppressWarnings("unchecked")
	@WebResult(header = false, name = "getBankAccountDetails", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsResponse")
	public DebitCardDetailsResponse getDebitCardDetails(
			@WebParam(header = false, mode = WebParam.Mode.IN, name = "debitCardRequest", targetNamespace = "com.dsms.solutions.tfnecu.web.webservices.soap.DebitCardDetailsRequest") DebitCardDetailsRequest debitCardRequest) {

		DebitCardDetailsResponse debitCardResponse = new DebitCardDetailsResponse();
		if (null == debitCardRequest.getCcNo()) {
			debitCardResponse.setStatus(WEBSERVICESTATUS.FAILURE.toString());
			debitCardResponse.setStatusCode(WEB_SERVICE_STATUS_CODE.SUC001.toString());
			debitCardResponse.setResponseMessage(String.format(WEB_SERVICE_CONSTANT_MESSAGE.EMPTY_INPUT.FORMAT_MESSAGE,
					DEBIT_CARD_WEBSERVICE_MESSAGE.EMPTY_DEBIT_CARD_NUMBER));
		}
		@SuppressWarnings("rawtypes")
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		DebitCardDetails dcd = new DebitCardDetails();
		dcd.setCcNo("789456123");
		dcd.setCvvNo(1111);
		dcd.setExpairDate(new Date());
		dcd.setName("Shiba Prasad Mishra");

		try {
			List<DebitCardDetails> debitCardList = new CopyOnWriteArrayList<DebitCardDetails>();
			debitCardList.add(dcd);
			debitCardResponse.setDebitCardDetails(debitCardList);
			debitCardResponse.setResponseMessage(WEBSERVICESTATUS.SUCCESS.toString());
			debitCardResponse.setStatusCode(WEB_SERVICE_STATUS_CODE.SUC000.toString());
			// bankList = bankAccountService.getBankbyAccountNumber(new
			// BigInteger(bankAccountRequest.getAccountNumber()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return debitCardResponse;

	}

	interface DEBIT_CARD_WEBSERVICE_MESSAGE {

		public static final String INVALID_DEBIT_CARD_NUMBER = "Invalid Debit Card Number";
		public static final String EMPTY_DEBIT_CARD_NUMBER = "Debit Card Number ";
	}
}
