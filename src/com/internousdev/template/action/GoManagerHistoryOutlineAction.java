package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectHistoryOutlineDAO;
import com.internousdev.template.dto.HistoryOutlineDTO;
import com.internousdev.template.util.HistoryOutlinePaginator;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文履歴(概要)ページに遷移するためのアクション。管理者側で使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class GoManagerHistoryOutlineAction extends ActionSupport implements SessionAware{


	/**
	 * 注文履歴概要(ユーザー側)リスト
	 * */
	private ArrayList<HistoryOutlineDTO> m_historyOutlineList = new ArrayList<HistoryOutlineDTO>();

	/**
	 * ページネートされたリスト
	 * */
	private ArrayList<HistoryOutlineDTO> paginatedList = new ArrayList<HistoryOutlineDTO>();

	/**
	 * 現在のページ数
	 * */
	private int current_page =1;

	/**
	 * 最大ページ数
	 * */
	private int max_page;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object> ();

	/**
	 * 実行メソッド
	 * */
	public String execute(){

		String result = ERROR;

		SelectHistoryOutlineDAO shodao = new SelectHistoryOutlineDAO();
		HistoryOutlinePaginator hop = new HistoryOutlinePaginator();

		m_historyOutlineList = shodao.selectManagerHistoryOutline();

		max_page = hop.returnMaxPage(m_historyOutlineList);
		paginatedList = hop.paginateList(m_historyOutlineList, current_page);

		if(m_historyOutlineList.size() > 0){
			result = SUCCESS;
			session.put("m_historyOutlineList", m_historyOutlineList);
		}

		return result;

	}



	/**
	 * @return m_historyOutlineList
	 */
	public ArrayList<HistoryOutlineDTO> getM_historyOutlineList() {
		return m_historyOutlineList;
	}



	/**
	 * @param m_historyOutlineList セットする m_historyOutlineList
	 */
	public void setM_historyOutlineList(ArrayList<HistoryOutlineDTO> m_historyOutlineList) {
		this.m_historyOutlineList = m_historyOutlineList;
	}



	/**
	 * @return paginatedList
	 */
	public ArrayList<HistoryOutlineDTO> getPaginatedList() {
		return paginatedList;
	}

	/**
	 * @param paginatedList セットする paginatedList
	 */
	public void setPaginatedList(ArrayList<HistoryOutlineDTO> paginatedList) {
		this.paginatedList = paginatedList;
	}

	/**
	 * @return current_page
	 */
	public int getCurrent_page() {
		return current_page;
	}

	/**
	 * @param current_page セットする current_page
	 */
	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}

	/**
	 * @return max_page
	 */
	public int getMax_page() {
		return max_page;
	}

	/**
	 * @param max_page セットする max_page
	 */
	public void setMax_page(int max_page) {
		this.max_page = max_page;
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
