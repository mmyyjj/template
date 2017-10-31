package com.internousdev.template.util;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.internousdev.template.dao.LogoutDAO;

/**
 * セッションが切れた際に自動でログアウト処理を行う為のクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class TemplateHttpSessionListener implements HttpSessionListener {

	/**
	 * セッション開始時の処理
	 * */
	public void sessionCreated(HttpSessionEvent se){

	}

	/**
	 * セッション終了時の処理
	 * */
	public void sessionDestroyed(HttpSessionEvent se){
		HttpSession session = se.getSession();
		LogoutDAO lodao = new LogoutDAO();
		lodao.logout((int)session.getAttribute("user_id"));
	}

}
