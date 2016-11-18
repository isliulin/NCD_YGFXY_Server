package org.com.xsx.actions;

import org.com.xsx.Domain.ManagerBean;
import org.com.xsx.services.AddUserService;

import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport {
	
	private AddUserService addUserService;
	
	private ManagerBean user;

	private String resultstr;
	
	public ManagerBean getUser() {
		return user;
	}

	public void setUser(ManagerBean user) {
		this.user = user;
	}

	public void setAddUserService(AddUserService addUserService) {
		this.addUserService = addUserService;
	}
	
	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public String AddAUser(){
		
		resultstr = "myresult->"+ERROR;

		if(addUserService.SaveOrUpdateUser(user))
			resultstr = "myresult->"+SUCCESS;
		
		return resultstr;
	}
}
