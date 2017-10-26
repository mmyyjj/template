package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.InsertNewHistoryDAO;
import com.internousdev.template.dto.CartItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文の完了操作を行うためのアクションクラス。
 * @author YUKA MATSUMURA
 * @since 2014/10/26
 * @version 1.0
 * */
public class CompleteOrderAction extends ActionSupport implements SessionAware {

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();

	/**
	 * トランザクション成功の状態を表す定数
	 * */
	static final String TRANSACTION_COMPLETED = "transaction_completed";


	public String execute(){
		String result = ERROR;

		int user_id = (int)session.get("user_id");
		BigDecimal total_price = (BigDecimal)session.get("total_price");
		int payment_method_id = (int)session.get("payment_method_id");
		String delivery_date = (String)session.get("delivery_date");
		int delivery_time_id = (int)session.get("delivery_time_id");
		ArrayList<CartItemDTO>cartItemList = (ArrayList<CartItemDTO>)session.get("cartItemList");

		InsertNewHistoryDAO inhdao = new InsertNewHistoryDAO();
		String transaction = inhdao.insertHistory(user_id, total_price, payment_method_id, delivery_date, delivery_time_id, cartItemList);

		if(transaction == TRANSACTION_COMPLETED){
			result = SUCCESS;
		}else if(transaction == "stock_out"){
			result = "nostock";
		}

		return result;
	}




	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}




	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
