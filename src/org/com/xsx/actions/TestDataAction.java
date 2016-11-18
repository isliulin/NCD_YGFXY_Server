package org.com.xsx.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.xsx.Domain.TestDataBean;
import org.com.xsx.services.TestDataService;

import com.opensymphony.xwork2.ActionSupport;

public class TestDataAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TestDataService testDataService;
	
	private String resultstr;
	
	private TestDataBean tdata;
	
	//用于分段提交测试曲线
	private String testcardid;
	private String index;
	private String series;
	

	public TestDataBean getTdata() {
		return tdata;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setTdata(TestDataBean tdata) {
		this.tdata = tdata;
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

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public void setTestDataService(TestDataService testDataService) {
		this.testDataService = testDataService;
	}

	public String SaveOrUpdateTestData(){
		resultstr = "myresult->"+ERROR;
		
		if(testDataService.SaveOrUpdateTestData(tdata))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
	
	public String SaveOrUpdateTestCard(){
		resultstr = "myresult->"+ERROR;
		
		if(testDataService.SaveOrUpDateTestCard(tdata))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
	
	public String SaveOrUpdateTestDataSeries(){
		resultstr = "myresult->"+ERROR;

		if(testDataService.SaveTestDataSeries(testcardid, series, index))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}

	public String SaveOrUpdateTester(){
		resultstr = "myresult->"+ERROR;

		if(testDataService.SaveOrUpDateTester(tdata))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
}
