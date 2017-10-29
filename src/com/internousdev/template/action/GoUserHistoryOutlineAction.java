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
 * ユーザー側で購入履歴画面（概要）に遷移するためのアクション。<br>
 * DBから該当するユーザーIDの購入履歴を検索し、リストとして取得する。
 * @author YUKA MATSUMURA
 * @since 2017/10/27
 * @version 1.0
 */
public class GoUserHistoryOutlineAction extends ActionSupport implements SessionAware{


	/**
	 * 注文履歴概要(ユーザー側)リスト
	 * */
	private ArrayList<HistoryOutlineDTO> u_historyOutlineList = new ArrayList<HistoryOutlineDTO>();

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

	public String execute(){

		String result = ERROR;

		int user_id = (int)session.get("user_id");

		SelectHistoryOutlineDAO shodao = new SelectHistoryOutlineDAO();
		HistoryOutlinePaginator hop = new HistoryOutlinePaginator();

		u_historyOutlineList = shodao.selectUserHistoryOutline(user_id);

		max_page = hop.returnMaxPage(u_historyOutlineList);
		paginatedList = hop.paginateList(u_historyOutlineList, current_page);

		if(u_historyOutlineList.size() > 0){
			result = SUCCESS;
			session.put("u_historyOutlineList", u_historyOutlineList);
		}

		return result;

	}

	/**
	 * @return u_historyOutlineList
	 */
	public ArrayList<HistoryOutlineDTO> getU_historyOutlineList() {
		return u_historyOutlineList;
	}

	/**
	 * @param u_historyOutlineList セットする u_historyOutlineList
	 */
	public void setU_historyOutlineList(ArrayList<HistoryOutlineDTO> u_historyOutlineList) {
		this.u_historyOutlineList = u_historyOutlineList;
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
