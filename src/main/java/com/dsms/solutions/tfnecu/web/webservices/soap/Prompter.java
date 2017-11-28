/**
 * 
 */
package com.dsms.solutions.tfnecu.web.webservices.soap;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import com.sun.xml.wss.impl.callback.PasswordCallback;
import com.sun.xml.wss.impl.callback.UsernameCallback;

/**
 * @author Babu
 *
 */
public class Prompter implements CallbackHandler {

	public Prompter() {
	}

	/*
	 * private String readLine() { String line = null; try { line = new
	 * BufferedReader(new InputStreamReader(System.in)).readLine(); } catch
	 * (Exception e) { throw new RuntimeException(e); } return line;
	 * 
	 * }
	 */

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		try {
			for (int i = 0; i < callbacks.length; i++) {
				if (callbacks[i] instanceof UsernameCallback) {
					UsernameCallback cb = (UsernameCallback) callbacks[i];
					String username = "shiba_789456123@telefonica_DSMS_CLIENT_SHIVA_PC_mishra@123";
				} else if (callbacks[i] instanceof PasswordCallback) {
					PasswordCallback cb = (PasswordCallback) callbacks[i];
					String username = "@#$&*@78945612312345678900_client_@shiva_pc_#$%";
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
