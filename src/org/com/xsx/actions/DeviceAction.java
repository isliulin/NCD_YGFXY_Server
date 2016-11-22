package org.com.xsx.actions;

import org.com.xsx.Domain.DeviceBean;
import org.com.xsx.Domain.DevicerBean;
import org.com.xsx.services.DeviceService;

import com.opensymphony.xwork2.ActionSupport;

public class DeviceAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DeviceService deviceService;
	
	//提交的设备信息
	private DeviceBean deviceBean;
	
	//提交的设备操作人信息
	private DevicerBean devicerBean;
	//提交的操作人是不是责任人
	private Boolean isadmin;
	
	//返回结果
	private String resultstr;


	public DeviceService getDeviceService() {
		return deviceService;
	}

	public void setDeviceService(DeviceService deviceService) {
		this.deviceService = deviceService;
	}

	public DeviceBean getDeviceBean() {
		return deviceBean;
	}

	public void setDeviceBean(DeviceBean deviceBean) {
		this.deviceBean = deviceBean;
	}

	public DevicerBean getDevicerBean() {
		return devicerBean;
	}

	public void setDevicerBean(DevicerBean devicerBean) {
		this.devicerBean = devicerBean;
	}

	public Boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}



	//提交设备信息
	public String SaveDeviceInfoAction(){
		
		resultstr = "myresult->"+ERROR;
		
		if(deviceService.SaveOrUpdateDeviceInfoService(deviceBean))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
	
	//提交设备操作人信息
	public String SaveDeviceUserInfoAction() {
		
	}
}
