package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * サイトの紹介ページに遷移するためのクラス
 * @author YUKA MATSMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class GoAboutPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 8289117221907209344L;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();

	/**
	 * 実行メソッド
	 * */
	public String execute(){

		return SUCCESS;

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
