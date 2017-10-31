package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規ユーザー登録画面に遷移するためのアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class GoUserCreatePageAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 2883964365629568769L;

	/**
	 * セッション
	 * */private Map<String, Object> session = new HashMap<String, Object>();

	/**
	 * 実行メソッド
	 * @return result 結果
	 * */
	public String execute (){
		session.put("account_create", true);
		String result = SUCCESS;
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
