package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文情報入力画面に遷移するためのアクション。<br>
 * ユーザー側で使用。<br>
 * 配達希望日のリストを取得する処理あり
 * @author YUKA MATSMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class GoOrderInputAction extends ActionSupport{

	/**
	 * 配達希望日リスト
	 * */
	private List<String> timeList = new ArrayList<String>();

	public String execute(){
		String result = ERROR;

		//TODO ここに日付リスト取得処理

		return result;

	}




}
