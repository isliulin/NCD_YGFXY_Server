package org.com.xsx.services;

import org.com.xsx.beans.TestCardBean;
import org.com.xsx.daos.TestCardDao;

public class TestCardService {
	
	private TestCardDao testCardDao;

	public void setTestCardDao(TestCardDao testCardDao) {
		this.testCardDao = testCardDao;
	}

	public TestCardBean SaveOrUpdateTestCard(TestCardBean testCardBean){
		testCardDao.SaveOrUpdateTestCard(testCardBean);
		return testCardBean;
	}
}
