/**
 * 
 */
package com.dsms.solutions.tfnecu.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.dsms.solutions.tfnecu.common.UniversalAccountNumber;
import com.dsms.solutions.tfnecu.model.hibernate.HibernateUtil;
import com.dsms.solutions.tfnecu.service.UniversalAccountService;

/**
 * @author Babu
 *
 */
public class UniversalAccountServiceImpl implements UniversalAccountService {

	SessionFactory sessionfactory = null;
	Session session = null;
	Transaction transaction = null;

	public UniversalAccountServiceImpl() {
	}

	public List<? extends Object> getUanDetails(String uanNumber) {
		List<UniversalAccountNumber> uanDetails = new CopyOnWriteArrayList<UniversalAccountNumber>();
		sessionfactory = HibernateUtil.getAnnotationSessionFactory();
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		uanDetails = session.createCriteria(UniversalAccountNumber.class).add(Restrictions.eq("uanNumber", uanNumber))
				.list();
		return (!uanDetails.isEmpty()) ? uanDetails : null;

	}

}
