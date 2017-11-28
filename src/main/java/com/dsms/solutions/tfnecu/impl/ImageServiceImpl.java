/**
 * 
 */
package com.dsms.solutions.tfnecu.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.dsms.solutions.tfnecu.common.MyImageDetails;
import com.dsms.solutions.tfnecu.model.hibernate.HibernateUtil;
import com.dsms.solutions.tfnecu.service.ImageService;

/**
 * @author Babu
 *
 */
public class ImageServiceImpl implements ImageService {

	public List<? extends Object> fetchImage(String searchCondition) {
		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<MyImageDetails> imageList = session.createCriteria(MyImageDetails.class)
				.add(Restrictions.ilike("searchCondition", searchCondition, MatchMode.END)).list();
		return imageList;
	}

}
