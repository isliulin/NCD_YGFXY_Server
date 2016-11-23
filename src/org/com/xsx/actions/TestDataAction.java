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
	private Integer sindex;
	private String series;
	

	public TestDataBean getTdata() {
		return tdata;
	}

	public void setTdata(TestDataBean tdata) {
		this.tdata = tdata;
	}

	public Integer getSindex() {
		return sindex;
	}

	public void setSindex(Integer sindex) {
		this.sindex = sindex;
	}
	
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
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
	
	public String SaveOrUpdateTestDataSeries(){
		resultstr = "myresult->"+ERROR;

		if(testDataService.SaveTestDataSeries(tdata.getCid(), series, sindex))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
}
