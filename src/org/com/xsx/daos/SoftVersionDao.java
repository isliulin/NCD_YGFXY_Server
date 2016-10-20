package org.com.xsx.daos;

import org.com.xsx.beans.SoftVersion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SoftVersionDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Boolean UpdateSoftVersion(SoftVersion softVersion){
		
		softVersion.setSoftname("YGFXY_Client");
		
		getSession().saveOrUpdate(softVersion);
		return true;
	}
}
