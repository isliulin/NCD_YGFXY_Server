package org.com.xsx.daos;

import org.com.xsx.Domain.DeviceBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeviceDao{
	
	private SessionFactory sessionFactory;
	
	private DevicerDao devicerDao;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public DevicerDao getDevicerDao() {
		return devicerDao;
	}

	public void setDevicerDao(DevicerDao devicerDao) {
		this.devicerDao = devicerDao;
	}


	//上传设备信息
	public Boolean SaveOrUpdateDeviceInfoDao(DeviceBean deviceBean) {
		
		devicerDao.DeleteDevicerSByDeviceID(deviceBean.getId());
		
		deviceBean.setDltime(System.currentTimeMillis());
		
		try {
			getSession().saveOrUpdate(deviceBean);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean UpDateDeviceTimeDao(String deviceid){
		
		try {
			DeviceBean deviceBean = getSession().get(DeviceBean.class, deviceid);
			
			deviceBean.setDltime(System.currentTimeMillis());
			
			getSession().saveOrUpdate(deviceBean);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			
			return false;
		}
	}
}