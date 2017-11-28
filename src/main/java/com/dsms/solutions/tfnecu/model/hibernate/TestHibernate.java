package com.dsms.solutions.tfnecu.model.hibernate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dsms.solutions.tfnecu.common.MyImageDetails;

public class TestHibernate {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		System.out.println("Session Factoy:::" + factory);
		File f = new File("C:/SHIVA/SHIBA_PRASAD_ALBUM/ALBUM3/NANI BHAINA MARRIAGE/Nani Bhaina 1");
		String description = "Dillip Kumar Mishra";
		String searchCondition = "Dilip Mishra";
		File[] listofFiles = f.listFiles();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for (File lf : listofFiles) {
			MyImageDetails mid = new MyImageDetails();
			mid.setCreatedDate(new Date());
			mid.setName(lf.getName());
			mid.setDescription(description);
			mid.setSearchCondition(searchCondition);
			Blob imageData = null;
			try {
				imageData = Hibernate.createBlob(new FileInputStream(lf));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			mid.setImage(imageData);
			session.save(mid);
		}
		tx.commit();
		session.flush();
		session.close();
		System.out.println("Done Photo Saved to Oracle Data Base");

	}

}
