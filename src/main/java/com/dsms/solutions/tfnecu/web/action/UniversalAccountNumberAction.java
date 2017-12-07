package com.dsms.solutions.tfnecu.web.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsms.solutions.tfnecu.base64.encode.decode.DSMSBase64Encryption;
import com.dsms.solutions.tfnecu.impl.UniversalAccountServiceImpl;
import com.dsms.solutions.tfnecu.service.UniversalAccountService;

@Controller
@RequestMapping("/universalAccountNumber.spring")
public class UniversalAccountNumberAction {

	private static Logger LOGGER = LoggerFactory.getLogger(DisplayImageAction.class);
	UniversalAccountService uanService = new UniversalAccountServiceImpl();
	private static String PAGE_ENCODING = "UTF-8";

	@RequestMapping(method = RequestMethod.POST)
	public String getUANDetails(HttpServletRequest request, HttpServletResponse response) {
		String uanNumber = request.getParameter("uanNumber");
		System.out.println("uanNumber is :::" + uanNumber);
		String uanEncodedValue = DSMSBase64Encryption.encryptData(uanNumber);
		// List<UniversalAccountNumber> uanDetails =
		// (List<UniversalAccountNumber>) uanService.getUanDetails(uanNumber);
		if (uanNumber != null) {
			try {
				response.sendRedirect("displayUanDetails.jsp?requestedSessionId=" + "" + request.getRequestedSessionId()
						+ "&pageEncoding=" + PAGE_ENCODING + "&UniversalAccountNumber=" + uanEncodedValue);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

	}
}
