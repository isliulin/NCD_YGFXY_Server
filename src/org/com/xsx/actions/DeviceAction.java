package org.com.xsx.actions;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.beans.DeviceInfoBean;
import org.com.xsx.services.DeviceInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class DeviceAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DeviceInfoService deviceInfoService;
	
	private DeviceInfoBean deviceInfo;
	
	private Map<String, Object> request;
	private String resultstr;

	public DeviceInfoBean getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfoBean deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public void setDeviceInfoService(DeviceInfoService deviceInfoService) {
		this.deviceInfoService = deviceInfoService;
	}
	
	public String SaveDeviceInfo(){
		DeviceInfoBean deviceInfotemp;

		deviceInfotemp = deviceInfoService.SaveOrUpdateDeviceInfo(deviceInfo);
		resultstr = deviceInfo.getDeviceid();
		if(deviceInfotemp == null)
			return ERROR;
		else{
			request.put("massege", deviceInfotemp.getDeviceid());
			return SUCCESS;
		}
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
}
