/**
 * 
 */
package com.dsms.solutions.tfnecu.model.hibernate;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ObjectIdGenerator implements IdentifierGenerator {

	private String OBJECT_ID_GENERATOR_SQL = "SELECT getObjectId.NEXTVAL FROM DUAL";

	public ObjectIdGenerator() {
	}

	public Serializable generate(SessionImplementor sessionImpl, Object data) throws HibernateException {
		Serializable result = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		BigInteger objectID = null;
		try {
			connection = sessionImpl.connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(OBJECT_ID_GENERATOR_SQL);
			if (resultSet.next()) {
				objectID = new BigInteger(resultSet.getString(1));
				System.out.println("Custom generated Sequence value : " + objectID);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objectID;
	}

}
