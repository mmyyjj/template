package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectHistoryDetailDAO;
import com.internousdev.template.dto.HistoryDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入履歴(詳細)に遷移するためのアクションクラス。ユーザー側で使用。<br>
 * DAOを使って購入履歴詳細(購入商品情報)のリストを取得する。
 * @author YUKA MATSUMURA
 * @since 2017/10/28
 * @version 1.0
 * */
public class GoUserHistoryDetailAction extends ActionSupport implements SessionAware{

	/**
	 * 検索注文ID
	 * */
	private int order_id;

	/**
	 * 注文履歴(詳細)リスト
	 * */
	private List<HistoryDetailDTO> u_historyDetailList = new ArrayList<HistoryDetailDTO>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();



	public String execute(){
		String result = ERROR;

		SelectHistoryDetailDAO shddao = new SelectHistoryDetailDAO();

		u_historyDetailList = shddao.selectHistoryDetail(order_id);

		if(u_historyDetailList.size() > 0){
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
	 * @return u_historyDetailList
	 */
	public List<HistoryDetailDTO> getU_historyDetailList() {
		return u_historyDetailList;
	}



	/**
	 * @param u_historyDetailList セットする u_historyDetailList
	 */
	public void setU_historyDetailList(List<HistoryDetailDTO> u_historyDetailList) {
		this.u_historyDetailList = u_historyDetailList;
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
