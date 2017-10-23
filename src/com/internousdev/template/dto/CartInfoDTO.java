package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * カート内の情報を保持するためのクラス。<br>
 * これをリスト化し、jspのiterator処理でカート画面を表示する。
 * @author YUKA MATSUMURA
 * @since 2017/10/23
 * @version 1.0
 * */
public class CartInfoDTO {

	private int user_id;

	private int product_id;

	private BigDecimal unit_price;

	private int order_number;

	private int number_for_gift;

	private BigDecimal subtotal;

	/**
	 * @return user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id セットする user_id
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id セットする product_id
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return unit_price
	 */
	public BigDecimal getUnit_price() {
		return unit_price;
	}

	/**
	 * @param unit_price セットする unit_price
	 */
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}

	/**
	 * @return order_number
	 */
	public int getOrder_number() {
		return order_number;
	}

	/**
	 * @param order_number セットする order_number
	 */
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	/**
	 * @return number_for_gift
	 */
	public int getNumber_for_gift() {
		return number_for_gift;
	}

	/**
	 * @param number_for_gift セットする number_for_gift
	 */
	public void setNumber_for_gift(int number_for_gift) {
		this.number_for_gift = number_for_gift;
	}

	/**
	 * @return subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

}
