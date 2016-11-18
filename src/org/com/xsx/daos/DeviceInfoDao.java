package org.com.xsx.daos;

import org.com.xsx.Domain.DeviceBean;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeviceInfoDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void UpdateDeviceLastTime(String deviceid){
		String hql = "select p from DeviceBean as p where p.id = :mydeviceid";
		DeviceBean deviceBean;
		
		Query query = getSession().createQuery(hql);
		query.setParameter("mydeviceid", deviceid);
		
		deviceBean = (DeviceBean)query.uniqueResult();
		
		if(deviceBean != null)
			SaveOrUpdateDeviceInfo(deviceBean);
	}
	
	public Boolean SaveOrUpdateDeviceInfo(DeviceBean deviceBean){
		
		deviceBean.setDltime(System.currentTimeMillis());
		
		try {
			getSession().saveOrUpdate(deviceBean);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
