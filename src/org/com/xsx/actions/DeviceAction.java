package org.com.xsx.actions;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	//�ύ���豸��Ϣ
	private DeviceBean deviceBean;
	
	//�ύ���豸��������Ϣ
	private DevicerBean devicerBean;
	//�ύ�Ĳ������ǲ���������
	private Boolean isadmin;
	
	//���ؽ��
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



	//�ύ�豸��Ϣ
	public String SaveOrUpdateDeviceInfoAction(){
		
		resultstr = "myresult->"+ERROR;
		
		if(deviceService.SaveOrUpdateDeviceInfoService(deviceBean))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
	
	//�ύ�豸��������Ϣ
	public String SaveOrUpdateDevicerInfoAction() {

		resultstr = "myresult->"+ERROR;
		
		if(deviceService.SaveOrUpdateDevicerInfoService(devicerBean))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
	
	//�����豸����ʱ��
	public String UpDateDeviceTimeAction() {
		
		SimpleDateFormat     matter1     =     new     SimpleDateFormat( "yyyyMMddHHmmss");  
		
		resultstr = "myresult->"+ERROR;
		
		if(deviceService.UpDateDeviceTimeService(deviceBean.getId()))
			resultstr = "myresult->"+matter1.format(new Date());

		return SUCCESS;
	}
}
