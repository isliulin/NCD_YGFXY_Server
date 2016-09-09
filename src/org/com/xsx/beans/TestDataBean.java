package org.com.xsx.beans;

public class TestDataBean {
	
	private String cardid;			//检测卡id
	private String deviceid;		//设备id
	private String testdate;		//测试时间
	private Float e_t;				//环境温度
	private Float o_t;				//检测卡温度
	private Integer outtime;		//超时时间
	private Integer c_l;			//c线位置
	private Integer t_l;			//T线位置
	private Integer b_l;			//基线位置
	private String series;			//测试曲线
	private Float t_c_value;		//峰高比
	private Float b_value;			//原始结果
	private Float a_value;			//校准后结果
	private String simpleid;		//样品id
	private Boolean report_result;	//报告结果
	private String report_desc;		//报告说明
	
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getTestdate() {
		return testdate;
	}
	public void setTestdate(String testdate) {
		this.testdate = testdate;
	}
	public Float getE_t() {
		return e_t;
	}
	public void setE_t(Float e_t) {
		this.e_t = e_t;
	}
	public Float getO_t() {
		return o_t;
	}
	public void setO_t(Float o_t) {
		this.o_t = o_t;
	}
	public Integer getOuttime() {
		return outtime;
	}
	public void setOuttime(Integer outtime) {
		this.outtime = outtime;
	}
	public Integer getC_l() {
		return c_l;
	}
	public void setC_l(Integer c_l) {
		this.c_l = c_l;
	}
	public Integer getT_l() {
		return t_l;
	}
	public void setT_l(Integer t_l) {
		this.t_l = t_l;
	}
	public Integer getB_l() {
		return b_l;
	}
	public void setB_l(Integer b_l) {
		this.b_l = b_l;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public Float getT_c_value() {
		return t_c_value;
	}
	public void setT_c_value(Float t_c_value) {
		this.t_c_value = t_c_value;
	}
	public Float getB_value() {
		return b_value;
	}
	public void setB_value(Float b_value) {
		this.b_value = b_value;
	}
	public Float getA_value() {
		return a_value;
	}
	public void setA_value(Float a_value) {
		this.a_value = a_value;
	}
	public String getSimpleid() {
		return simpleid;
	}
	public void setSimpleid(String simpleid) {
		this.simpleid = simpleid;
	}
	public Boolean getReport_result() {
		return report_result;
	}
	public void setReport_result(Boolean report_result) {
		this.report_result = report_result;
	}
	public String getReport_desc() {
		return report_desc;
	}
	public void setReport_desc(String report_desc) {
		this.report_desc = report_desc;
	}
}
