/**
 * 
 */
package com.dsms.solutions.tfnecu.web.action;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsms.solutions.tfnecu.common.BankAccountDetails;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountService;
import com.dsms.solutions.tfnecu.impl.bank.BankAccountServiceImpl;

/**
 * @author Babu
 *
 */
public class AddBankAction extends HttpServlet {

	private static final long serialVersionUID = -7963335405101352968L;

	@Override
	public void init() {

	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		@SuppressWarnings("rawtypes")
		BankAccountService service = new BankAccountServiceImpl();
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
		if (service.createBankAccount(bad)) {
			response.sendRedirect("/success.jsp");
		}

	}

	@Override
	public void destroy() {

	}

}
