package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectImagePathDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規商品の追加ページに遷移するアクション
 * */
public class GoProductAddPageAction extends ActionSupport implements SessionAware{

	/**
	 * 画像パスリスト
	 * */
	private ArrayList<String> imagePathList = new ArrayList<String>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		SelectImagePathDAO sipdao = new SelectImagePathDAO();

		setImagePathList(sipdao.selectImagePath());

		session.put("new_product_name", "商品名を入力してください");
		session.put("new_category", "");
		session.put("new_unit_price", BigDecimal.valueOf(500));
		session.put("new_current_stock", 50);
		session.put("new_comment", "商品の説明です。");
		session.put("new_img_path", "sample_1.png");

		result = SUCCESS;

		return result;
	}





	/**
	 * @return imagePathList
	 */
	public ArrayList<String> getImagePathList() {
		return imagePathList;
	}





	/**
	 * @param imagePathList セットする imagePathList
	 */
	public void setImagePathList(ArrayList<String> imagePathList) {
		this.imagePathList = imagePathList;
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
