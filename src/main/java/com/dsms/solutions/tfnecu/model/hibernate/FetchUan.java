package com.dsms.solutions.tfnecu.model.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dsms.solutions.tfnecu.common.UniversalAccountNumber;

public class FetchUan {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<UniversalAccountNumber> uanDetails = session.createCriteria(UniversalAccountNumber.class).list();
		if (!uanDetails.isEmpty()) {
			for (UniversalAccountNumber uan : uanDetails) {
				System.out.println(uan.getEmail());
			}
		}
	}

}
