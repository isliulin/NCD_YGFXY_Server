package org.com.xsx.daos;

import java.util.List;

import org.com.xsx.Domain.DeviceBean;
import org.com.xsx.Domain.DevicerBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DevicerDao {

	private SessionFactory sessionFactory;
	
	private BasicHibernateDao basicHibernateDao;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public BasicHibernateDao getBasicHibernateDao() {
		return basicHibernateDao;
	}

	public void setBasicHibernateDao(BasicHibernateDao basicHibernateDao) {
		this.basicHibernateDao = basicHibernateDao;
	}

	public Boolean SaveOrUpdateDevicerInfoDao(DevicerBean devicerBean){
		try {
			getSession().saveOrUpdate(devicerBean);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public Boolean DeleteDevicerSByDeviceID(String deviceid) {
		
		StringBuffer hql = new StringBuffer("delete m from DevicerBean as m WHERE m.did='"+deviceid+"'");
        
		basicHibernateDao.DoSql(hql.toString());
		
		return true;
	}
}
