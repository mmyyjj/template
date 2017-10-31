package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {


	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 8335240204702805720L;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		/*セッションから、ユーザーIDを取り出す*/
		int user_id = (int)session.get("user_id");

		/*DAOのインスタンス化*/
		LogoutDAO lodao = new LogoutDAO();

		/*DAOのメソッドを実行し、ログアウトしたユーザーの情報があれば正常に完了したとみなす。*/
		int logout_num = lodao.logout(user_id);//このユーザーIDのユーザーを、ログアウトさせよ

		if(logout_num > 0){
			result = SUCCESS;
			session.clear();

		}

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
