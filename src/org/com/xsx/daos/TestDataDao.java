package org.com.xsx.daos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.com.xsx.beans.DeviceInfoBean;
import org.com.xsx.beans.TestDataBean;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.sf.json.JSONObject;

public class TestDataDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TestDataBean SaveOrUpdateTestData(TestDataBean testDataBean){

		getSession().saveOrUpdate(testDataBean);

		return testDataBean;
	}
	
	public TestDataBean QueryTestData(String testcardid){
		String hql = "select p from TestDataBean as p where p.cardid = :mycardid";
		TestDataBean testDataBean = null;
		
		Query query = getSession().createQuery(hql);
		query.setParameter("mycardid", testcardid);
		
		testDataBean = (TestDataBean) query.uniqueResult();
		
		return testDataBean;
	}
	
	public Boolean SaveTestDataSeries(String testcardid, String series, String index){

		TestDataBean testDataBean = QueryTestData(testcardid);

		if(testDataBean == null)
			return false;
		else{
			Map<String, String> typemap = new HashMap<>();
			Map<String, String> outmap = null;
			
			String datajson = testDataBean.getSeries();
			if(datajson != null){
				JSONObject jsonObject = JSONObject.fromObject(datajson);
				
				outmap = (Map<String, String>) jsonObject.toBean(jsonObject, Map.class, typemap);
				
				Set<String> set = outmap.keySet();
			    Iterator<String> iter = set.iterator();
			        while (iter.hasNext()) {
			            String key = iter.next();
			            System.out.println(key + ":" + outmap.get(key).toString());
			        }
			     
			    outmap.put(index, series);
					
				JSONObject jsonObject1 = JSONObject.fromObject(outmap);
					
				testDataBean.setSeries(jsonObject1.toString());
			}
			else{
				outmap = new HashMap<>();
				outmap.put(index, series);
				
				JSONObject jsonObject1 = JSONObject.fromObject(outmap);
				
				testDataBean.setSeries(jsonObject1.toString());
			}
			
			SaveOrUpdateTestData(testDataBean);
			
			
			return true;
		}
	}
}
