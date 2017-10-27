package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * カートの再読込を行うためのアクション。ユーザー側で使用。<br>
 * 会計手続き中に在庫切れになった商品があった場合に使用する。<br>
 * カートの中を在庫のある商品のみに更新する。
 * @author YUKA MATSUMURA
 * @since 2017/10/27
 * @version 1.0
 * */
public class ReloadCartAction extends ActionSupport implements SessionAware{

	/**
	 * セッション
	 * */
	private Map<String,Object> session = new HashMap<String, Object>();

	public String execute(){
		String result = ERROR;






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
