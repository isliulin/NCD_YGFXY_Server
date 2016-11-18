package org.com.xsx.actions;

import org.com.xsx.Domain.DeviceBean;
import org.com.xsx.services.DeviceInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class DeviceAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DeviceInfoService deviceInfoService;
	
	private DeviceBean dfo;
	
	private String resultstr;


	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public DeviceBean getDfo() {
		return dfo;
	}

	public void setDfo(DeviceBean dfo) {
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
