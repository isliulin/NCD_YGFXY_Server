package org.com.xsx.services;

import org.com.xsx.beans.SoftVersion;
import org.com.xsx.daos.SoftVersionDao;

public class UpdateClientSoftService {
	
	private SoftVersionDao softVersionDao;

	public void setSoftVersionDao(SoftVersionDao softVersionDao) {
		this.softVersionDao = softVersionDao;
	}
	
	public Boolean UpdateClientSoft(SoftVersion softVersion){
		return softVersionDao.UpdateSoftVersion(softVersion);
	}
}
