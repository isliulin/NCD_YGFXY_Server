package org.com.xsx.actions;

import org.com.xsx.Domain.ManagerBean;
import org.com.xsx.services.ManagerService;

import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ManagerService managerService;
	
	private ManagerBean managerBean;
	
	private String ncd_password;

	private String resultstr;


	public ManagerService getManagerService() {
		return managerService;
	}


	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}


	public ManagerBean getManagerBean() {
		return managerBean;
	}


	public void setManagerBean(ManagerBean managerBean) {
		this.managerBean = managerBean;
	}


	public String getNcd_password() {
		return ncd_password;
	}


	public void setNcd_password(String ncd_password) {
		this.ncd_password = ncd_password;
	}


	public String getResultstr() {
		return resultstr;
	}


	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}


	public String AddManagerAction(){
		
		resultstr = "myresult->"+ERROR;
		
		if(ncd_password.equals("xsx127")){
			if(managerService.SaveOrUpdateManagerService(managerBean))
				resultstr = "myresult->"+SUCCESS;
		}
		else 
			resultstr = "myresult->无此权限";
		
		return SUCCESS;
	}
}
