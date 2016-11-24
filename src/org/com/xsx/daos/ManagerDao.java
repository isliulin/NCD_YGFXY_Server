package org.com.xsx.daos;

import org.com.xsx.Domain.ManagerBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ManagerDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean SaveOrUpdateManagerDao(ManagerBean user){
		
		try {
			getSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
