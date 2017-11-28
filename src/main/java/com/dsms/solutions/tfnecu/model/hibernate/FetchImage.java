/**
 * 
 */
package com.dsms.solutions.tfnecu.model.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.dsms.solutions.tfnecu.common.MyImageDetails;

/**
 * @author Babu
 *
 */
public class FetchImage {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<MyImageDetails> imageList = session.createCriteria(MyImageDetails.class)
				.add(Restrictions.ilike("searchCondition", "Yercard", MatchMode.END)).list();
		for (MyImageDetails md : imageList) {
			System.out.println(md.getImageid() + ":::::" + md.getName());
		}

	}

}
