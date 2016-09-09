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
		String hql = "select p from DeviceInfoBean as p where p.deviceid = :mydeviceid";
		DeviceInfoBean deviceInfo;
		
		Query query = getSession().createQuery(hql);
		query.setParameter("mydeviceid", deviceid);
		
		deviceInfo = (DeviceInfoBean)query.uniqueResult();
		
		if(deviceInfo != null)
			SaveOrUpdateDeviceInfo(deviceInfo);
	}
	
	public DeviceInfoBean SaveOrUpdateDeviceInfo(DeviceInfoBean deviceInfo){
		
		deviceInfo.setLasttime(System.currentTimeMillis());
		getSession().saveOrUpdate(deviceInfo);

		return deviceInfo;
	}
}
