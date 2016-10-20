package org.com.xsx.daos;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.com.xsx.beans.TestDataBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class TestDataDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Boolean SaveOrUpdateTestData(TestDataBean testDataBean){

		TestDataBean temp;
		
		testDataBean.setR_uptime(new Timestamp(System.currentTimeMillis()));
		getSession().saveOrUpdate(testDataBean);

		temp = getSession().get(TestDataBean.class, testDataBean.getCid());
		if(temp != null)
			return true;
		else
			return false;
	}
	
	public Boolean SaveOrUpDateTestCard(TestDataBean testDataBean){
		TestDataBean temp = getSession().get(TestDataBean.class, testDataBean.getCid());
		
		if(temp == null)
			return false;
		else{
			temp.setC_item(testDataBean.getC_item());
			temp.setC_n_v(testDataBean.getC_n_v());
			temp.setC_l_v(testDataBean.getC_l_v());
			temp.setC_h_v(testDataBean.getC_h_v());
			temp.setC_dw(testDataBean.getC_dw());
			temp.setC_t_l(testDataBean.getC_t_l());
			temp.setC_bq_n(testDataBean.getC_bq_n());
			temp.setC_fend(testDataBean.getC_fend());
			temp.setC_bq1_a(testDataBean.getC_bq1_a());
			temp.setC_bq1_b(testDataBean.getC_bq1_b());
			temp.setC_bq1_c(testDataBean.getC_bq1_c());
			temp.setC_bq2_a(testDataBean.getC_bq2_a());
			temp.setC_bq2_b(testDataBean.getC_bq2_b());
			temp.setC_bq2_c(testDataBean.getC_bq2_c());
			temp.setC_waitt(testDataBean.getC_waitt());
			temp.setC_c_l(testDataBean.getC_c_l());
			temp.setC_outt(testDataBean.getC_outt());
			
			temp.setR_uptime(new Timestamp(System.currentTimeMillis()));
			
			SaveOrUpdateTestData(temp);

			return true;
		}
	}
	
	public Boolean SaveTestDataSeries(String testcardid, String series, String index){

		TestDataBean temp = getSession().get(TestDataBean.class, testcardid);

		if(temp == null)
			return false;
		else{
			Map<String, List<Integer>> typemap = new HashMap<>();
			Map<String, List<Integer>> outmap = null;
			
			String datajson = temp.getSerie();

			if(datajson != null){
				JSONObject jsonObject = JSONObject.fromObject(datajson);	
				
				outmap = (Map<String, List<Integer>>) jsonObject.toBean(jsonObject, Map.class, typemap);
			}
			else{
				outmap = new HashMap<>();
			}
			
			JSONArray jsonArray = JSONArray.fromObject(series);
			List<Integer> list = (List<Integer>) JSONSerializer.toJava(jsonArray);
			
			outmap.put(index, list);
						
			JSONObject jsonObject1 = JSONObject.fromObject(outmap);
						
			temp.setSerie(jsonObject1.toString());
			
			temp.setR_uptime(new Timestamp(System.currentTimeMillis()));
			
			SaveOrUpdateTestData(temp);
			
			return true;
		}
	}
	
	public Boolean SaveOrUpDateTester(TestDataBean testDataBean){
		TestDataBean temp = getSession().get(TestDataBean.class, testDataBean.getCid());
		
		if(temp == null)
			return false;
		else{
			temp.setT_name(testDataBean.getT_name());
			temp.setT_age(testDataBean.getT_age());
			temp.setT_sex(testDataBean.getT_sex());
			temp.setT_phone(testDataBean.getT_phone());
			temp.setT_job(testDataBean.getT_job());
			temp.setT_desc(testDataBean.getT_desc());
			
			temp.setR_uptime(new Timestamp(System.currentTimeMillis()));
			
			SaveOrUpdateTestData(temp);

			return true;
		}
	}
}
