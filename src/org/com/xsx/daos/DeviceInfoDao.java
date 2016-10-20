package org.com.xsx.daos;

import org.com.xsx.beans.DeviceInfoBean;
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
		String hql = "select p from DeviceInfoBean as p where p.id = :mydeviceid";
		DeviceInfoBean deviceInfo;
		
		Query query = getSession().createQuery(hql);
		query.setParameter("mydeviceid", deviceid);
		
		deviceInfo = (DeviceInfoBean)query.uniqueResult();
		
		if(deviceInfo != null)
			SaveOrUpdateDeviceInfo(deviceInfo);
	}
	
	public Boolean SaveOrUpdateDeviceInfo(DeviceInfoBean deviceInfo){
		
		DeviceInfoBean temp;
		
		deviceInfo.setDltime(System.currentTimeMillis());
		
		getSession().saveOrUpdate(deviceInfo);
		
		temp = getSession().get(DeviceInfoBean.class, deviceInfo.getId());
		
		if(temp != null)
			return true;
		else
			return false;
	}
}
