package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LogoutDAO;
import com.internousdev.template.dto.LoginInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {


	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		/*セッションから、ユーザー情報を保持したdtoを取り出す*/
		LoginInfoDTO lidto = (LoginInfoDTO)session.get("loginInfo");

		/*DAOのインスタンス化*/
		LogoutDAO lodao = new LogoutDAO();

		/*DAOのメソッドを実行し、ログアウトしたユーザーの情報があれば正常に完了したとみなす。*/
		int logout_num = lodao.logout( lidto.getUser_id() );//このユーザーIDのユーザーを、ログアウトさせよ

		if(logout_num > 0){
			result = SUCCESS;
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
