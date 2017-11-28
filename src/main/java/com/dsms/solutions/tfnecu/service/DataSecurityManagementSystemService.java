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
public interface DataSecurityManagementSystemService<T extends Object> {

	public abstract boolean addAadharCard(Object paramObject);

	public abstract List<? extends Object> getAadharCard(String paramObject);

	public boolean createBankAccount(Object paramArgument);

	public List<Object> getAllBankAccount();

	public List<Object> getBankbyAccountNumber(BigInteger paramArgument) throws Exception;

	public List<Object> getBankbyAccountuserId(String paramArgument) throws Exception;

	public List<Object> getBankbyBankName(String paramArgument) throws Exception;
}
