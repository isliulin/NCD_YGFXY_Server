package org.com.xsx.services;

import org.com.xsx.Domain.CardBean;
import org.com.xsx.daos.CardDao;

public class CardService {
	
	private CardDao cardDao;

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}
	
	public Boolean SaveOrUpdateCardService(CardBean cardBean){
		return cardDao.SaveOrUpdateCardDao(cardBean);
	}
}
