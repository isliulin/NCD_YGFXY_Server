package org.com.xsx.services;

import org.com.xsx.Domain.ManagerBean;
import org.com.xsx.daos.ManagerDao;

public class ManagerService {
	
	private ManagerDao managerDao;

	
	public ManagerDao getManagerDao() {
		return managerDao;
	}


	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}


	public boolean SaveOrUpdateManagerService(ManagerBean user){
		return managerDao.SaveOrUpdateManagerDao(user);
	}
}
