package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectCustomerListDAO;
import com.internousdev.template.dto.UserInfoDTO;
import com.internousdev.template.util.CustomerListPaginator;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 顧客情報一覧画面に遷移するためのアクション。
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class GoCustomerListAction extends ActionSupport implements SessionAware{

	/**
	 * 顧客情報の全リスト
	 * */
	private ArrayList<UserInfoDTO> allCustomerList = new ArrayList<UserInfoDTO>();

	/**
	 * ページネートされた顧客情報のリスト
	 * */
	private ArrayList<UserInfoDTO> paginatedCustomerList = new ArrayList<UserInfoDTO>();

	/**
	 * 現在のページ
	 * */
	private int current_page = 1;

	/**
	 * 最大ページ数
	 * */
	private int max_page;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){

		String result = ERROR;

		SelectCustomerListDAO scldao = new SelectCustomerListDAO();
		CustomerListPaginator clp = new CustomerListPaginator();

		allCustomerList = scldao.selectCustomerList();
		max_page = clp.returnMaxPage(allCustomerList);

		paginatedCustomerList = clp.paginateList(allCustomerList, current_page);

		result = SUCCESS;
		return result;

	}


	/**
	 * @return allCustomerList
	 */
	public List<UserInfoDTO> getAllCustomerList() {
		return allCustomerList;
	}


	/**
	 * @param allCustomerList セットする allCustomerList
	 */
	public void setAllCustomerList(List<UserInfoDTO> allCustomerList) {
		this.allCustomerList = (ArrayList<UserInfoDTO>) allCustomerList;
	}


	/**
	 * @return paginatedCustomerList
	 */
	public ArrayList<UserInfoDTO> getPaginatedCustomerList() {
		return paginatedCustomerList;
	}


	/**
	 * @param paginatedCustomerList セットする paginatedCustomerList
	 */
	public void setPaginatedCustomerList(ArrayList<UserInfoDTO> paginatedCustomerList) {
		this.paginatedCustomerList = paginatedCustomerList;
	}


	/**
	 * @param allCustomerList セットする allCustomerList
	 */
	public void setAllCustomerList(ArrayList<UserInfoDTO> allCustomerList) {
		this.allCustomerList = allCustomerList;
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
