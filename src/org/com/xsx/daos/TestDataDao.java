package org.com.xsx.daos;

import java.sql.Timestamp;

import org.com.xsx.Domain.TestDataBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDataDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Boolean SaveOrUpdateTestData(TestDataBean testDataBean){

		try {
			testDataBean.setUptime(new Timestamp(System.currentTimeMillis()));
			
			getSession().saveOrUpdate(testDataBean);
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	
	public Boolean SaveTestDataSeries(String testcardid, String series, Integer index){
		
		try {
			TestDataBean temp = getSession().get(TestDataBean.class, testcardid);
			
			if(index == 1)
				temp.setSerie_a(series);
			else if(index == 2)
				temp.setSerie_b(series);
			else if(index == 3)
				temp.setSerie_c(series);
			else if(index == 4)
				temp.setSerie_d(series);
			
			temp.setUptime(new Timestamp(System.currentTimeMillis()));
			
			getSession().saveOrUpdate(temp);
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
