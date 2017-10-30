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
 * 購入履歴(詳細)に遷移するためのアクションクラス。管理者側で使用。<br>
 * DAOを使って購入履歴詳細(購入商品情報)のリストを取得する。
 * @author YUKA MATSUMURA
 * @since 2017/10/28
 * @version 1.0
 * */
public class GoManagerHistoryDetailAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -3680889668912817713L;

	/**
	 * 検索注文ID
	 * */
	private int order_id;

	/**
	 * 注文履歴(詳細)リスト
	 * */
	private List<HistoryDetailDTO> m_historyDetailList = new ArrayList<HistoryDetailDTO>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();



	public String execute(){
		String result = ERROR;

		SelectHistoryDetailDAO shddao = new SelectHistoryDetailDAO();

		m_historyDetailList = shddao.selectHistoryDetail(order_id);

		if(m_historyDetailList.size() > 0){
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
	 * @return m_historyDetailList
	 */
	public List<HistoryDetailDTO> getM_historyDetailList() {
		return m_historyDetailList;
	}



	/**
	 * @param m_historyDetailList セットする m_historyDetailList
	 */
	public void setM_historyDetailList(List<HistoryDetailDTO> m_historyDetailList) {
		this.m_historyDetailList = m_historyDetailList;
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
