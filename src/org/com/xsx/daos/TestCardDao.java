package org.com.xsx.daos;

import org.com.xsx.beans.TestCardBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestCardDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TestCardBean SaveOrUpdateTestCard(TestCardBean testCardBean){

		getSession().saveOrUpdate(testCardBean);

		return testCardBean;
	}
}
