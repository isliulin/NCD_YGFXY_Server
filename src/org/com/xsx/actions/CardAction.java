package org.com.xsx.actions;

import org.com.xsx.Domain.CardBean;
import org.com.xsx.services.CardService;

import com.opensymphony.xwork2.ActionSupport;

public class CardAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//试剂卡服务类
	private CardService cardService;
	
	//提交的试剂卡信息
	private CardBean cardBean;
	
	//返回结果
	private String resultstr;

	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	public CardBean getCardBean() {
		return cardBean;
	}

	public void setCardBean(CardBean cardBean) {
		this.cardBean = cardBean;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}
	
	public String SaveOrUpdateCardAction() {
		
		resultstr = "myresult->"+ERROR;
		
		if(cardService.SaveOrUpdateCardService(cardBean))
			resultstr = "myresult->"+SUCCESS;

		return SUCCESS;
	}
}
