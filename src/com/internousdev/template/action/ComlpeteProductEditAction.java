package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UpdateProductInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報の更新を行うアクションクラス。管理側で使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class ComlpeteProductEditAction extends ActionSupport implements SessionAware{

	/**
	 * 編集後商品名
	 * */
	private String edit_product_name;

	/**
	 * 編集後カテゴリー
	 * */
	private String edit_category;

	/**
	 * 編集後単価
	 * */
	private BigDecimal edit_unit_price;

	/**
	 * 編集後在庫
	 * */
	private int edit_current_stock;

	/**
	 * 編集後コメント
	 * */
	private String edit_comment;

	/**
	 * 編集後画像パス
	 * */
	private String edit_img_path;

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 5014892195112552756L;
	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		/*セッションから変数の取得
		 * （直接指定しても可能ですが、横に長くなってしまうので一度移し変えています）*/
		int edit_product_id = (int)session.get("edit_product_id");

		UpdateProductInfoDAO upidao = new UpdateProductInfoDAO();

		int successed_num = upidao.updateProduct(edit_product_id, edit_product_name, edit_category,edit_unit_price,
				edit_current_stock, edit_comment, edit_img_path);

		if(successed_num > 0){
			result = SUCCESS;
		}


		return result;


	}


	/**
	 * @return edit_product_name
	 */
	public String getEdit_product_name() {
		return edit_product_name;
	}


	/**
	 * @param edit_product_name セットする edit_product_name
	 */
	public void setEdit_product_name(String edit_product_name) {
		this.edit_product_name = edit_product_name;
	}


	/**
	 * @return edit_category
	 */
	public String getEdit_category() {
		return edit_category;
	}


	/**
	 * @param edit_category セットする edit_category
	 */
	public void setEdit_category(String edit_category) {
		this.edit_category = edit_category;
	}


	/**
	 * @return edit_unit_price
	 */
	public BigDecimal getEdit_unit_price() {
		return edit_unit_price;
	}


	/**
	 * @param edit_unit_price セットする edit_unit_price
	 */
	public void setEdit_unit_price(BigDecimal edit_unit_price) {
		this.edit_unit_price = edit_unit_price;
	}


	/**
	 * @return edit_current_stock
	 */
	public int getEdit_current_stock() {
		return edit_current_stock;
	}


	/**
	 * @param edit_current_stock セットする edit_current_stock
	 */
	public void setEdit_current_stock(int edit_current_stock) {
		this.edit_current_stock = edit_current_stock;
	}


	/**
	 * @return edit_comment
	 */
	public String getEdit_comment() {
		return edit_comment;
	}


	/**
	 * @param edit_comment セットする edit_comment
	 */
	public void setEdit_comment(String edit_comment) {
		this.edit_comment = edit_comment;
	}


	/**
	 * @return edit_img_path
	 */
	public String getEdit_img_path() {
		return edit_img_path;
	}


	/**
	 * @param edit_img_path セットする edit_img_path
	 */
	public void setEdit_img_path(String edit_img_path) {
		this.edit_img_path = edit_img_path;
	}


	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
