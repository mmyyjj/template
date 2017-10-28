package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.DeleteHistoryDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文履歴の削除を行うアクション。ユーザー側で使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/28
 * @version 1.0
 * */
public class DeleteHistoryAction extends ActionSupport implements SessionAware{

	/**
	 * 検索注文ID
	 * */
	private int order_id;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result= ERROR;
		int successed_num = 0;

		DeleteHistoryDAO dhdao = new DeleteHistoryDAO();

		successed_num = dhdao.deleteHistory(order_id);

		if(successed_num > 0){
			result = SUCCESS;
		}

		return result;

	}


	/**
	 * @return order_id
	 */
	public int getOrder_id() {
		return order_id;
	}


	/**
	 * @param order_id セットする order_id
	 */
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
