package org.com.xsx.services;

import org.com.xsx.Domain.TestDataBean;
import org.com.xsx.daos.TestDataDao;

public class TestDataService {
	
	private TestDataDao testDataDao;


	public void setTestDataDao(TestDataDao testDataDao) {
		this.testDataDao = testDataDao;
	}

	public Boolean SaveOrUpdateTestData(TestDataBean testDataBean){		
		return testDataDao.SaveOrUpdateTestData(testDataBean);
	}
	
	public Boolean SaveTestDataSeries(String testcardid, String series, Integer index){
		return testDataDao.SaveTestDataSeries(testcardid, series, index);
	}
	
}
