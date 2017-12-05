package com.dsms.solutions.tfnecu.model.hibernate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dsms.solutions.tfnecu.common.ProvidentFundAccountDetails;
import com.dsms.solutions.tfnecu.common.UniversalAccountNumber;

public class TestUAN {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getAnnotationSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		UniversalAccountNumber uan = new UniversalAccountNumber();
		uan.setEmail("spm09.mishra@gmail.com");
		uan.setMobile(new BigInteger("7204118564"));
		uan.setName("Shiba Prasad Mishra");
		uan.setUanNumber(new BigInteger("100047323274"));

		ProvidentFundAccountDetails ppf = new ProvidentFundAccountDetails();
		ppf.setCompanyName("Netcracker Pvt Ltd");
		ppf.setOfficeName("Bangaore");
		ppf.setPfNumber("BGBNG00671290000000548");
		ppf.setUan(uan);

		ProvidentFundAccountDetails ppf1 = new ProvidentFundAccountDetails();
		ppf1.setCompanyName("Etisalat Software Solutions");
		ppf1.setOfficeName("KR Puram");
		ppf1.setPfNumber("PYKRP00455740000000594");
		ppf1.setUan(uan);

		List<ProvidentFundAccountDetails> ppfList = new ArrayList<ProvidentFundAccountDetails>();
		ppfList.add(ppf);
		ppfList.add(ppf1);
		uan.setPfDetails(ppfList);
		session.save(uan);
		session.save(ppf);
		session.save(ppf1);
		tx.commit();
		session.close();

	}

}
