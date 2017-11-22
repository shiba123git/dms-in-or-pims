/**
 * 
 */
package com.dsms.solutions.tfnecu.model.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Babu
 *
 */
public final class HibernateUtil {

	public static SessionFactory annotationSessionfactory = null;
	public static SessionFactory xmlSessionfactory = null;

	private HibernateUtil() {
		System.out.println("Private Constructor No Object Creation through new Operator");
	}

	public static SessionFactory getAnnotationSessionFactory() {
		if (annotationSessionfactory == null) {
			System.out.println("*********Session Factory is null creating new Object ********");
			AnnotationConfiguration acf = new AnnotationConfiguration();
			annotationSessionfactory = acf.configure("/hibernate.cfg.xml").buildSessionFactory();
			System.out.println("*********New Object Return ********");
			return annotationSessionfactory;

		} else {
			System.out.println("*********Session Factory Already Exist returning the Old one ********");
			return annotationSessionfactory;
		}

	}

}
