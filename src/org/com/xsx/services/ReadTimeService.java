package org.com.xsx.services;

import org.com.xsx.daos.DeviceInfoDao;

public class ReadTimeService {
	
	private DeviceInfoDao deviceInfoDao;

	public void setDeviceInfoDao(DeviceInfoDao deviceInfoDao) {
		this.deviceInfoDao = deviceInfoDao;
	}
	
	public void UpdateDeviceLastTime(String deviceId){

		deviceInfoDao.UpdateDeviceLastTime(deviceId);
	}
}
