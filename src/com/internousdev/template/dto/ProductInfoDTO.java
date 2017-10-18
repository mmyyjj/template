package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * DBから取得した商品の情報を格納するクラス。
 * ユーザー側の商品一覧ページや、管理者側の商品管理で使用する。<br>
 * このDTOををListに格納し、JSPのiterater機能を使うことでリストの表示を行う
 * @author YUKA MATSUMURA
 * @since 2017/10/18
 * @version 1.0
 * */
public class ProductInfoDTO {

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 商品名
	 * */
	private String product_name;

	/**
	 * 分類
	 * */
	private String category;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * 現在の在庫
	 * */
	private int current_stock;

	/**
	 * 販売総数
	 * */
	private int number_of_sales;

	/**
	 * 商品コメント
	 * */
	private String comment;

	/**
	 * 画像パス
	 * */
	private String img_path;

	/**
	 * 登録日
	 * */
	private String registration_date;

	/**
	 * 更新日
	 * */
	private String update_date;

	/**
	 * 削除フラグ
	 * */
	private int delete_flg;



	//以下、getter/setter-----------------

	/**
	 * 商品ID取得メソッド
	 * @return product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * 商品ID格納メソッド
	 * @param product_id セットする product_id
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	/**
	 * 商品名取得メソッド
	 * @return product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * 商品名格納メソッド
	 * @param product_name セットする product_name
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * 分類取得メソッド
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 分類格納メソッド
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 単価取得メソッド
	 * @return unit_price
	 */
	public BigDecimal getUnit_price() {
		return unit_price;
	}

	/**
	 * 単価格納メソッド
	 * @param unit_price セットする unit_price
	 */
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}

	/**
	 * 在庫取得メソッド
	 * @return current_stock
	 */
	public int getCurrent_stock() {
		return current_stock;
	}

	/**
	 * 在庫格納メソッド
	 * @param current_stock セットする current_stock
	 */
	public void setCurrent_stock(int current_stock) {
		this.current_stock = current_stock;
	}

	/**
	 * 販売総数取得メソッド
	 * @return number_of_sales
	 */
	public int getNumber_of_sales() {
		return number_of_sales;
	}

	/**
	 * 販売総数格納メソッド
	 * @param number_of_sales セットする number_of_sales
	 */
	public void setNumber_of_sales(int number_of_sales) {
		this.number_of_sales = number_of_sales;
	}

	/**
	 * 商品コメント取得メソッド
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 商品コメント格納メソッド
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 画像パス取得メソッド
	 * @return img_path
	 */
	public String getImg_path() {
		return img_path;
	}

	/**
	 * 画像パス格納メソッド
	 * @param img_path セットする img_path
	 */
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	/**
	 * 登録日取得メソッド
	 * @return registration_date
	 */
	public String getRegistration_date() {
		return registration_date;
	}

	/**
	 * 登録日格納メソッド
	 * @param registration_date セットする registration_date
	 */
	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	/**
	 * 更新日取得メソッド
	 * @return update_date
	 */
	public String getUpdate_date() {
		return update_date;
	}

	/**
	 * 更新日格納メソッド
	 * @param update_date セットする update_date
	 */
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	/**
	 * 削除フラッグ取得メソッド
	 * @return delete_flg
	 */
	public int getDelete_flg() {
		return delete_flg;
	}

	/**
	 * 削除フラグ取得メソッド
	 * @param delete_flg セットする delete_flg
	 */
	public void setDelete_flg(int delete_flg) {
		this.delete_flg = delete_flg;
	}




}
