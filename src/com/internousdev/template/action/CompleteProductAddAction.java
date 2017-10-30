package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.InsertProductDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規商品の登録を完了し、DBにデータを登録するアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class CompleteProductAddAction extends ActionSupport implements SessionAware{

	/**
	 * 新規商品名
	 * */
	private String new_product_name;

	/**
	 * 新規商品カテゴリ
	 * */
	private String new_category;

	/**
	 * 新規商品単価
	 * */
	private BigDecimal new_unit_price;

	/**
	 * 新規商品在庫
	 * */
	private int new_current_stock;

	/**
	 * 新規商品コメント
	 * */
	private String new_comment;

	/**
	 * 新規商品画像パス
	 * */
	private String new_img_path;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();



	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;
		int successed_num = 0;

		InsertProductDAO ipdao = new InsertProductDAO();

		successed_num = ipdao.insertProduct(new_product_name, new_category, new_unit_price, new_current_stock,
				new_comment, new_img_path);

		if(successed_num > 0){
			result = SUCCESS;
		}

		return result;



	}



	/**
	 * @return new_product_name
	 */
	public String getNew_product_name() {
		return new_product_name;
	}



	/**
	 * @param new_product_name セットする new_product_name
	 */
	public void setNew_product_name(String new_product_name) {
		this.new_product_name = new_product_name;
	}



	/**
	 * @return new_category
	 */
	public String getNew_category() {
		return new_category;
	}



	/**
	 * @param new_category セットする new_category
	 */
	public void setNew_category(String new_category) {
		this.new_category = new_category;
	}



	/**
	 * @return new_unit_price
	 */
	public BigDecimal getNew_unit_price() {
		return new_unit_price;
	}



	/**
	 * @param new_unit_price セットする new_unit_price
	 */
	public void setNew_unit_price(BigDecimal new_unit_price) {
		this.new_unit_price = new_unit_price;
	}



	/**
	 * @return new_current_stock
	 */
	public int getNew_current_stock() {
		return new_current_stock;
	}



	/**
	 * @param new_current_stock セットする new_current_stock
	 */
	public void setNew_current_stock(int new_current_stock) {
		this.new_current_stock = new_current_stock;
	}



	/**
	 * @return new_comment
	 */
	public String getNew_comment() {
		return new_comment;
	}



	/**
	 * @param new_comment セットする new_comment
	 */
	public void setNew_comment(String new_comment) {
		this.new_comment = new_comment;
	}



	/**
	 * @return new_img_path
	 */
	public String getNew_img_path() {
		return new_img_path;
	}



	/**
	 * @param new_img_path セットする new_img_path
	 */
	public void setNew_img_path(String new_img_path) {
		this.new_img_path = new_img_path;
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
