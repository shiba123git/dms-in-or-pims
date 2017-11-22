package com.dsms.solutions.tfnecu.impl.bank;

import java.math.BigInteger;
import java.util.List;

/**
 * @author shmi0516
 *
 */
public interface BankAccountService<T extends Object> {

	public boolean createBankAccount(Object paramArgument);

	public List<Object> getAllBankAccount();

	public List<Object> getBankbyAccountNumber(BigInteger paramArgument) throws Exception;

	public List<Object> getBankbyAccountuserId(String paramArgument) throws Exception;

	public List<Object> getBankbyBankName(String paramArgument) throws Exception;

	public List<Object> getBankbyIFSCCode(String paramArgument) throws Exception;

}
