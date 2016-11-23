package org.com.xsx.daos;

import org.com.xsx.Domain.CardBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CardDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Boolean SaveOrUpdateCardDao(CardBean cardBean){
		try {
			getSession().saveOrUpdate(cardBean);
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
