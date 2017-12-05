/**
 * 
 */
package com.dsms.solutions.tfnecu.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.dsms.solutions.tfnecu.common.ContactDetails;
import com.dsms.solutions.tfnecu.model.hibernate.HibernateUtil;
import com.dsms.solutions.tfnecu.service.ContactService;

/**
 * @author Babu
 *
 */
public class ContactServiceImpl implements ContactService {

	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;

	@SuppressWarnings("unchecked")
	public List<? extends Object> getAllContact() {
		List<ContactDetails> contactList = new CopyOnWriteArrayList<ContactDetails>();
		sessionFactory = HibernateUtil.getAnnotationSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		contactList = session.createCriteria(ContactDetails.class).list();
		return contactList;
	}

	@SuppressWarnings("unchecked")
	public List<? extends Object> getContactbyContactId(BigInteger contactObjectID) {
		List<ContactDetails> contactList = new CopyOnWriteArrayList<ContactDetails>();
		sessionFactory = HibernateUtil.getAnnotationSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		contactList = session.createCriteria(ContactDetails.class)
				.add(Restrictions.eq("contactObjectId", contactObjectID)).list();
		return contactList;
	}

	@SuppressWarnings("unchecked")
	public List<? extends Object> getContactbybyName(String name) {
		List<ContactDetails> contactList = new CopyOnWriteArrayList<ContactDetails>();
		sessionFactory = HibernateUtil.getAnnotationSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		contactList = session.createCriteria(ContactDetails.class).add(Restrictions.ilike("fName", name)).list();
		return contactList;
	}

}
