/**
 * 
 */
package com.dsms.solutions.tfnecu.service;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Babu
 *
 */
public interface ContactService {

	public List<? extends Object> getAllContact();

	public List<? extends Object> getContactbyContactId(BigInteger contactObjectID);

	public List<? extends Object> getContactbybyName(String name);
}
