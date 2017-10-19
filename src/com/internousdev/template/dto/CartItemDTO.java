package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * カートに入っている商品の情報を格納するクラス。
 * 画面で言うとカートリストの1行分のデータが入る。<br>
 * これをリストにして、jspのiterator処理でリストの表示を行う。
 * */
public class CartItemDTO {

	/**
	 * ユーザーID
	 * */
	private int user_id;

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * 購入数
	 * */
	private int purchase_number;

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
	 * @return purchase_number
	 */
	public int getPurchase_number() {
		return purchase_number;
	}

	/**
	 * 購入数格納メソッド
	 * @param purchase_number セットする purchase_number
	 */
	public void setPurchase_number(int purchase_number) {
		this.purchase_number = purchase_number;
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
