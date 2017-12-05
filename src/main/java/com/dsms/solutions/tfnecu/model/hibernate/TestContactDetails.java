/**
 * 
 */
package com.dsms.solutions.tfnecu.model.hibernate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dsms.solutions.tfnecu.common.ContactDetails;

/**
 * @author Babu
 *
 */
public class TestContactDetails {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		System.out.println("Session Factoy:::" + factory);
		Blob imageData = null;
		File f = new File("C:/SHIVA/image/shiba.jpg");
		try {
			imageData = Hibernate.createBlob(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		ContactDetails cd = new ContactDetails();
		cd.setPhoto(imageData);
		cd.setPersonalTitel("Mr.");
		cd.setfName("Shiba");
		cd.setMname("Prasad");
		cd.setLname("Mishra");

		session.save(cd);

		// session.save(ca);
		// session.save(cld);

		transaction.commit();
		session.flush();
		session.close();

	}

}
