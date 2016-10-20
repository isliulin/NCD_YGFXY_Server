package org.com.xsx.daos;

import org.com.xsx.beans.ReportManagerBean;
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
	
	public boolean SaveOrUpdateUser(ReportManagerBean user){
		
		ReportManagerBean tempuser;
		
		getSession().saveOrUpdate(user);
		
		tempuser = getSession().get(ReportManagerBean.class, user.getAccount());
		
		if(tempuser == null)
			return false;
		else
			return true;
	}
}
