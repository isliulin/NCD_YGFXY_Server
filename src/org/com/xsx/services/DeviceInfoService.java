package org.com.xsx.services;

import org.com.xsx.beans.DeviceInfoBean;
import org.com.xsx.daos.DeviceInfoDao;

public class DeviceInfoService {
	
	private DeviceInfoDao deviceInfoDao;

	public void setDeviceInfoDao(DeviceInfoDao deviceInfoDao) {
		this.deviceInfoDao = deviceInfoDao;
	}
	
	public Boolean SaveOrUpdateDeviceInfo(DeviceInfoBean deviceInfo){
		
		return deviceInfoDao.SaveOrUpdateDeviceInfo(deviceInfo);
	}
}
