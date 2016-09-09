package org.com.xsx.actions;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.beans.TestDataBean;
import org.com.xsx.services.TestDataService;

import com.opensymphony.xwork2.ActionSupport;

public class TestDataAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TestDataService testDataService;
	
	private TestDataBean testDataBean;
	
	//用于分段提交测试曲线
	private String testcardid;
	private String index;
	private String series;
	
	private Map<String, Object> request;

	public TestDataBean getTestDataBean() {
		return testDataBean;
	}

	public void setTestDataBean(TestDataBean testDataBean) {
		this.testDataBean = testDataBean;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getTestcardid() {
		return testcardid;
	}

	public void setTestcardid(String testcardid) {
		this.testcardid = testcardid;
	}

	public void setTestDataService(TestDataService testDataService) {
		this.testDataService = testDataService;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	public String SaveOrUpdateTestData(){
		if(testDataService.SaveOrUpdateTestCard(testDataBean) == null)
			return ERROR;
		else{
			request.put("massege", testDataBean.getCardid());
			return SUCCESS;
		}
	}
	
	public String SaveOrUpdateTestDataSeries(){
		if(testDataService.SaveTestDataSeries(testcardid, series, index)){
			request.put("massege", testcardid);
			return SUCCESS;
		}
		else
			return ERROR;
	}

}
