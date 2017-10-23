package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * カートに入っている商品の情報を格納するクラス。
 * 画面で言うとカートリストの1行分のデータが入る。<br>
 * これをリストにして、jspのiterator処理でリストの表示を行う。<br>
 * このリストの情報はセッションにも保持し、注文確定時に注文履歴テーブルへの登録も行う。
 * */
public class CartItemDTO {
	/*データ取得先：cart_table
	 * 商品名はproduct_tableとのテーブル結合で取得。
	 * 合計金額はここでは保持せず、別個に変数を用意。
	 * */

	/**
	 * ユーザーID
	 * */
	private int user_id;

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 商品名
	 * */
	private String product_name;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * 購入数
	 * */
	private int order_number;

	/**
	 * ラッピング指定数
	 * */
	private int number_for_gift;

	/**
	 * 小計
	 * */
	private BigDecimal subtotal;


	//以下、setter/getter--------------------------


	/**
	 * ユーザーID取得メソッド
	 * @return user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーID格納メソッド
	 * @param user_id セットする user_id
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

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
	 * 購入数取得メソッド
	 * @return order_number
	 */
	public int getOrder_number() {
		return order_number;
	}

	/**
	 * 購入数格納メソッド
	 * @param order_number セットする purchase_number
	 */
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	/**
	 * ラッピング指定数取得メソッド
	 * @return number_for_gift
	 */
	public int getNumber_for_gift() {
		return number_for_gift;
	}

	/**
	 * ラッピング指定数格納メソッド
	 * @param number_for_gift セットする number_for_gift
	 */
	public void setNumber_for_gift(int number_for_gift) {
		this.number_for_gift = number_for_gift;
	}

	/**
	 * 小計取得メソッド
	 * @return subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * 小計格納メソッド
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

}
