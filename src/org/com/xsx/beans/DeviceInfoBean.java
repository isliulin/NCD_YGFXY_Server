package org.com.xsx.beans;

public class DeviceInfoBean {
	private String deviceid;				//设备id
	private String devicename;				//设备名字
	private String makername;				//制造商
	private String makerphone;				//制造商联系方式
	private String deviceaddr;				//设备使用地址
	private String username;				//责任人
	private String userage;					//责任人年龄
	private String usersex;					//责任人性别
	private String userphone;				//责任人联系方式
	private String userjob;					//责任人职务
	private String userdesc;				//责任人备注
	private Long lasttime;				//设备上次连接时间
	private Boolean isok;					//是否需要维修
	
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDevicename() {
		return devicename;
	}
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	public String getMakername() {
		return makername;
	}
	public void setMakername(String makername) {
		this.makername = makername;
	}
	public String getMakerphone() {
		return makerphone;
	}
	public void setMakerphone(String makerphone) {
		this.makerphone = makerphone;
	}
	public String getDeviceaddr() {
		return deviceaddr;
	}
	public void setDeviceaddr(String deviceaddr) {
		this.deviceaddr = deviceaddr;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserjob() {
		return userjob;
	}
	public void setUserjob(String userjob) {
		this.userjob = userjob;
	}
	public String getUserdesc() {
		return userdesc;
	}
	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}
	public Long getLasttime() {
		return lasttime;
	}
	public void setLasttime(Long lasttime) {
		this.lasttime = lasttime;
	}
	public Boolean getIsok() {
		return isok;
	}
	public void setIsok(Boolean isok) {
		this.isok = isok;
	}
}
