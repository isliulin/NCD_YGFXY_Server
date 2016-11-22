package org.com.xsx.actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.services.ReadTimeService;

import com.opensymphony.xwork2.ActionSupport;

public class ReadTimeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ReadTimeService readtimeservice;
	
	private String deviceid;
	
	private String resultstr;


	public void setReadtimeservice(ReadTimeService readtimeservice) {
		this.readtimeservice = readtimeservice;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	
	public String ReadTimeAction(){
		
		SimpleDateFormat     matter1     =     new     SimpleDateFormat( "yyyyMMddHHmmss");    
		
		resultstr = "myresult->"+matter1.format(new Date());
		
	//	readtimeservice.UpdateDeviceLastTime(deviceid);
		
		return SUCCESS;
	}

}
