package org.com.xsx.actions;

import org.com.xsx.beans.DeviceInfoBean;
import org.com.xsx.services.DeviceInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class DeviceAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DeviceInfoService deviceInfoService;
	
	private DeviceInfoBean dfo;
	
	private String resultstr;


	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public DeviceInfoBean getDfo() {
		return dfo;
	}

	public void setDfo(DeviceInfoBean dfo) {
		this.dfo = dfo;
	}

	public void setDeviceInfoService(DeviceInfoService deviceInfoService) {
		this.deviceInfoService = deviceInfoService;
	}
	
	public String SaveDeviceInfo(){
		
		resultstr = "myresult->"+ERROR;
		
		if(dfo.getId().length() == 0)
			resultstr = "myresult->"+SUCCESS;
		else if(deviceInfoService.SaveOrUpdateDeviceInfo(dfo))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}

}
