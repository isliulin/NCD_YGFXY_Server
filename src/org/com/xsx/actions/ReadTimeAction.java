package org.com.xsx.actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.services.ReadTimeService;

import com.opensymphony.xwork2.ActionSupport;

public class ReadTimeAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ReadTimeService readtimeservice;
	
	private String deviceid;
	
	private Map<String, Object> request;

	public void setReadtimeservice(ReadTimeService readtimeservice) {
		this.readtimeservice = readtimeservice;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	public String ReadTimeAction(){
		
		SimpleDateFormat     matter1     =     new     SimpleDateFormat( "yyyyMMddHHmmss");    
		
		String timestr = matter1.format(new Date());
		
		readtimeservice.UpdateDeviceLastTime(deviceid);
		
		request.put("massege", timestr);
		
		return SUCCESS;
	}

}
