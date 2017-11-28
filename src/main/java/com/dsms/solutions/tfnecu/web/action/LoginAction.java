/**
 * 
 */
package com.dsms.solutions.tfnecu.web.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Babu
 *
 */
@Controller
@RequestMapping("/login.spring")
public class LoginAction {

	public LoginAction() {
	}

	@RequestMapping(method = RequestMethod.POST)
	public String verifyCrediential(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("User Name is :::" + userName);
		System.out.println("Password is :::" + password);
		if (userName.equals("admin") && password.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", userName);
			try {
				response.sendRedirect("/jsp/secure/utf-8/userMain.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
