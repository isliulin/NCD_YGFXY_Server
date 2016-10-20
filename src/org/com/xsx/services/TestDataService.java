package org.com.xsx.services;

import java.util.List;

import org.com.xsx.beans.TestDataBean;
import org.com.xsx.daos.TestDataDao;

public class TestDataService {
	
	private TestDataDao testDataDao;


	public void setTestDataDao(TestDataDao testDataDao) {
		this.testDataDao = testDataDao;
	}

	public Boolean SaveOrUpdateTestData(TestDataBean testDataBean){		
		return testDataDao.SaveOrUpdateTestData(testDataBean);
	}
	
	public Boolean SaveOrUpDateTestCard(TestDataBean testDataBean){
		return testDataDao.SaveOrUpDateTestCard(testDataBean);
	}
	
	public Boolean SaveTestDataSeries(String testcardid, String series, String index){
		return testDataDao.SaveTestDataSeries(testcardid, series, index);
	}
	
	public Boolean SaveOrUpDateTester(TestDataBean testDataBean){
		return testDataDao.SaveOrUpDateTester(testDataBean);
	}
}
