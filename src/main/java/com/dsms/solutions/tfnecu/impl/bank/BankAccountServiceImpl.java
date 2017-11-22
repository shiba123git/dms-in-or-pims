/**
 * 
 */
package com.dsms.solutions.tfnecu.impl.bank;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dsms.solutions.tfnecu.common.BankAccountDetails;
import com.dsms.solutions.tfnecu.model.hibernate.HibernateUtil;

/**
 * @author shmi0516
 *
 */
@SuppressWarnings({ "rawtypes", "unussed" })
public class BankAccountServiceImpl implements BankAccountService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 155650310436547491L;
	private static final Logger LOGGER = LoggerFactory.getLogger(BankAccountServiceImpl.class);
	private SessionFactory sessionfactory = null;
	private Session session = null;
	private Transaction transaction = null;

	public BankAccountServiceImpl() {
		sessionfactory = HibernateUtil.getAnnotationSessionFactory();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Object is Initialized");
		}
	}

	// @Override
	public boolean createBankAccount(Object paramArgument) {
		boolean status = false;

		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		try {
			Integer returnValue = (Integer) session.save(paramArgument);
			if (returnValue > 0) {
				transaction.commit();
				status = true;
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			status = false;
		} finally {
			session.close();

		}
		return status;

	}

	// @Override
	@SuppressWarnings("unchecked")
	public List<BankAccountDetails> getAllBankAccount() {
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> allBankList = criteria.list();
		transaction.commit();
		session.close();
		return allBankList;
	}

	// @Override
	@SuppressWarnings("unchecked")
	public List<BankAccountDetails> getBankbyAccountNumber(BigInteger paramArgument) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Bank Account Number is {}", paramArgument);
		}
		if (null == paramArgument)
			throw new Exception("test");
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("accountNumber", paramArgument));
		transaction.commit();
		session.close();
		return bankList;
	}

	// @Override
	@SuppressWarnings("unchecked")
	public List<BankAccountDetails> getBankbyAccountuserId(String paramArgument) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("User Id  is {}", paramArgument);
		}
		if (null == paramArgument)
			throw new Exception("test");
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("userId", paramArgument));
		transaction.commit();
		session.close();
		return bankList;
	}

	// @Override
	@SuppressWarnings("unchecked")
	public List getBankbyBankName(String paramArgument) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Bank Name  is {}", paramArgument);
		}
		if (null == paramArgument)
			throw new Exception("test");
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("bankName", paramArgument));
		transaction.commit();
		session.close();
		return bankList;
	}

	// @Override
	@SuppressWarnings("unchecked")
	public List getBankbyIFSCCode(String paramArgument) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("IFSC Code  is {}", paramArgument);
		}
		if (null == paramArgument)
			throw new Exception("test");
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("ifsccode", paramArgument));
		transaction.commit();
		session.close();
		return bankList;
	}

	@SuppressWarnings("unchecked")
	private boolean isDuplicateAccountNumber(BigInteger paramArgument) {
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("accountNumber", paramArgument));
		transaction.commit();
		session.close();
		return bankList.isEmpty();

	}

	@SuppressWarnings("unchecked")
	private boolean isDuplicateifscNumber(String paramArgument) {
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccountDetails.class);
		List<BankAccountDetails> bankList = (List<BankAccountDetails>) criteria
				.add(Restrictions.eq("ifsccode", paramArgument));
		transaction.commit();
		session.close();
		return bankList.isEmpty();

	}
}
