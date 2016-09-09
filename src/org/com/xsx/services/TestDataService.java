package org.com.xsx.services;

import org.com.xsx.beans.TestDataBean;
import org.com.xsx.daos.TestDataDao;

public class TestDataService {
	
	private TestDataDao testDataDao;


	public void setTestDataDao(TestDataDao testDataDao) {
		this.testDataDao = testDataDao;
	}


	public TestDataBean SaveOrUpdateTestCard(TestDataBean testDataBean){
		testDataDao.SaveOrUpdateTestData(testDataBean);
		return testDataBean;
	}
	
	public Boolean SaveTestDataSeries(String testcardid, String series, String index){
		return testDataDao.SaveTestDataSeries(testcardid, series, index);
	}
}
