package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectHistoryOutlineDAO;
import com.internousdev.template.dto.HistoryOutlineDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー側で購入履歴画面（概要）に遷移するためのアクション。<br>
 * DBから該当するユーザーIDの購入履歴を検索し、リストとして取得する。
 * @author YUKA MATSUMURA
 * @since 2017/10/27
 * @version 1.0
 */
public class GoUserHistoryOutlineAction extends ActionSupport implements SessionAware{

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object> ();

	public String execute(){

		String result = ERROR;

		int user_id = (int)session.get("user_id");

		ArrayList<HistoryOutlineDTO> u_historyOutlineList = new ArrayList<HistoryOutlineDTO>();
		SelectHistoryOutlineDAO shodao = new SelectHistoryOutlineDAO();

		u_historyOutlineList = shodao.selectUserHistoryOutline(user_id);

		if(u_historyOutlineList.size() > 0){
			result = SUCCESS;
			session.put("u_historyOutlineList", u_historyOutlineList);
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
