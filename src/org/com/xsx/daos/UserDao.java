package org.com.xsx.daos;

import org.com.xsx.Domain.ManagerBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean SaveOrUpdateUser(ManagerBean user){
		
		ManagerBean tempuser;
		
		getSession().saveOrUpdate(user);
		
		tempuser = getSession().get(ManagerBean.class, user.getAccount());
		
		if(tempuser == null)
			return false;
		else
			return true;
	}
}
