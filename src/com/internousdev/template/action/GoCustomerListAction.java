package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.UserInfoDTO;
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
	private List<UserInfoDTO> allCustomerList = new ArrayList<UserInfoDTO>();

	/**
	 * ページネートされた顧客情報のリスト
	 * */
	private List<UserInfoDTO> paginatedList = new ArrayList<UserInfoDTO>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){

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
		this.allCustomerList = allCustomerList;
	}


	/**
	 * @return paginatedList
	 */
	public List<UserInfoDTO> getPaginatedList() {
		return paginatedList;
	}


	/**
	 * @param paginatedList セットする paginatedList
	 */
	public void setPaginatedList(List<UserInfoDTO> paginatedList) {
		this.paginatedList = paginatedList;
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
