package org.com.xsx.services;

import org.com.xsx.Domain.DeviceBean;
import org.com.xsx.daos.DeviceDao;

public class DeviceService {

	private DeviceDao deviceDao;
	
	public void setDeviceDao(DeviceDao deviceDao) {
		this.deviceDao = deviceDao;
	}

	public Boolean SaveOrUpdateDeviceInfoService(DeviceBean deviceInfo){
		
		return deviceDao.SaveOrUpdateDeviceInfoDao(deviceInfo);
	}
}
