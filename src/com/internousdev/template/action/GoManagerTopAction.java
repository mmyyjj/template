package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者トップページへ遷移するためのアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class GoManagerTopAction extends ActionSupport implements SessionAware{

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();

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
