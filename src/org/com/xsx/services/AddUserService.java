package org.com.xsx.services;

import org.com.xsx.beans.ReportManagerBean;
import org.com.xsx.daos.UserDao;

public class AddUserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean SaveOrUpdateUser(ReportManagerBean user){
		return userDao.SaveOrUpdateUser(user);
	}
}
