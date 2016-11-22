package org.com.xsx.daos;

import org.com.xsx.Domain.DeviceBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeviceDao{
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//上传设备信息
	public Boolean SaveOrUpdateDeviceInfoDao(DeviceBean deviceBean) {
		
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