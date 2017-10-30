package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.TimeSetDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文情報入力画面に遷移するためのアクション。<br>
 * ユーザー側で使用。<br>
 * 配達希望日のリストを取得する処理あり
 * @author YUKA MATSMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class GoOrderInputAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 8525792602202290L;

	/**
	 * 配達希望日リスト
	 * */
	private List<String> dateList = new ArrayList<String>();

	/**
	 * カード有効期限(年)リスト
	 * */
	private List<String> yearList = new ArrayList<String>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();



	public String execute(){
		String result = ERROR;


		// sqlで、「今日の日付」＋7日後 から、さらに10日間までの日付を検索してリスト化する。
		TimeSetDAO tsdao = new TimeSetDAO();

		dateList = tsdao.createDateList();
		yearList = tsdao.createYearList();

		session.put("dateList", dateList);
		session.put("yearList", yearList);

		if(dateList.size() > 0 && yearList.size() > 0){
			result = SUCCESS;
		}

		return result;

	}

	/**
	 * @return dateList
	 */
	public List<String> getDateList() {
		return dateList;
	}

	/**
	 * @param dateList セットする dateList
	 */
	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}

	/**
	 * @return yearList
	 */
	public List<String> getYearList() {
		return yearList;
	}

	/**
	 * @param yearList セットする yearList
	 */
	public void setYearList(List<String> yearList) {
		this.yearList = yearList;
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
