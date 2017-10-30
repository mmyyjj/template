package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * マイページに遷移するためのアクション
 * @author YUKA MATSMURA
 * @since 2017/10/27
 * @version 1.0
 * */
public class GoMyPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7912168559496888593L;
	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String,Object>();

	/**
	 * 実行メソッド
	 * */
	public String execute(){
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
