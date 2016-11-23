package org.com.xsx.services;

import org.com.xsx.Domain.DeviceBean;
import org.com.xsx.Domain.DevicerBean;
import org.com.xsx.daos.DeviceDao;
import org.com.xsx.daos.DevicerDao;

public class DeviceService {

	private DeviceDao deviceDao;
	
	private DevicerDao devicerDao;
	
	public void setDeviceDao(DeviceDao deviceDao) {
		this.deviceDao = deviceDao;
	}

	public void setDevicerDao(DevicerDao devicerDao) {
		this.devicerDao = devicerDao;
	}

	public Boolean SaveOrUpdateDeviceInfoService(DeviceBean deviceInfo){
		
		return deviceDao.SaveOrUpdateDeviceInfoDao(deviceInfo);
	}
	
	public Boolean SaveOrUpdateDevicerInfoService(DevicerBean devicerBean) {
		return devicerDao.SaveOrUpdateDevicerInfoDao(devicerBean);
	}
	
	public Boolean UpDateDeviceTimeService(String deviceid) {
		return deviceDao.UpDateDeviceTimeDao(deviceid);
	}
}
