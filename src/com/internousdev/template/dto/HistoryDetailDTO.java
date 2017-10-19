package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * 注文履歴を格納するためのリスト。概要・詳細の2種類があるうち「詳細」の部分。<br>
 * ユーザー・管理側両方で注文履歴の確認に使用する。
 * リスト作成・jspのiterator機能でリストにして表示。
 * @author YUKA MATSUMURA
 * @since 2017/10/19
 *
 * */
public class HistoryDetailDTO {

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



	//以下、seter/getter----------------------

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
	 * 注文数取得メソッド
	 * @return order_number
	 */
	public int getOrder_number() {
		return order_number;
	}

	/**
	 * 注文数格納メソッド
	 * @param order_number セットする order_number
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
