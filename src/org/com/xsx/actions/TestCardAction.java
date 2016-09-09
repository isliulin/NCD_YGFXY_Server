package org.com.xsx.actions;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.beans.TestCardBean;
import org.com.xsx.services.TestCardService;

import com.opensymphony.xwork2.ActionSupport;

public class TestCardAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TestCardService testCardService;
	
	private TestCardBean testCardBean;
	
	private Map<String, Object> request;

	public TestCardBean getTestCardBean() {
		return testCardBean;
	}

	public void setTestCardBean(TestCardBean testCardBean) {
		this.testCardBean = testCardBean;
	}

	public void setTestCardService(TestCardService testCardService) {
		this.testCardService = testCardService;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	public String SaveOrUpdateTestCardData(){
		
		if(testCardService.SaveOrUpdateTestCard(testCardBean) == null)
			return ERROR;
		else {
			request.put("massege", testCardBean.getCardid());
			return SUCCESS;
		}
	}
}
