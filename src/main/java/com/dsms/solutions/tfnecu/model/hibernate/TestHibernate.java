package com.dsms.solutions.tfnecu.model.hibernate;

import org.hibernate.SessionFactory;

public class TestHibernate {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		System.out.println("Session Factoy:::" + factory);

	}

}
