package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * 注文履歴を格納するためのリスト。概要・詳細の2種類があるうち「概要」の部分。<br>
 * ユーザー・管理側両方で注文履歴の確認に使用する。
 * リスト作成・jspのiterator機能でリストにして表示。
 * @author YUKA MATSUMURA
 * @since 2017/10/19
 *
 * */
public class HistoryOutlineDTO {
	/*主なデータ取得先：history_outline_table
	 * user_nameはuser_info_table、
	 * derivery_time_stringはdelivery_time_tableとの
	 * テーブル結合により取得する。
	 * */

	/**
	 * 注文ID
	 * */
	private int order_id;

	/**
	 * ユーザーID
	 * */
	private int user_id;

	/**
	 * ユーザー名
	 * */
	private String user_name;

	/**
	 * 合計金額
	 */
	private BigDecimal total_price;

	/**
	 * 注文日
	 * */
	private String order_date;

	/**
	 * 配達希望日
	 * */
	private String delivery_date;

	/**
	 * 配達希望時間帯
	 * */
	private String delivery_time_string;


	//以下、setter/getter--------------------------------



	/**
	 * 注文ID取得メソッド
	 * @return order_id
	 */
	public int getOrder_id() {
		return order_id;
	}

	/**
	 * 注文ID格納メソッド
	 * @param order_id セットする order_id
	 */
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

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
	 * ユーザー名取得メソッド
	 * @return user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * ユーザー名格納メソッド
	 * @param user_name セットする user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * 合計金額取得メソッド
	 * @return total_price
	 */
	public BigDecimal getTotal_price() {
		return total_price;
	}

	/**
	 * 合計金額格納メソッド
	 * @param total_price セットする total_price
	 */
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}

	/**
	 * 注文日取得メソッド
	 * @return order_date
	 */
	public String getOrder_date() {
		return order_date;
	}

	/**
	 * 注文日格納メソッド
	 * @param order_date セットする order_date
	 */
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	/**
	 * 配達希望日取得メソッド
	 * @return delivery_date
	 */
	public String getDelivery_date() {
		return delivery_date;
	}

	/**
	 * 配達希望日格納メソッド
	 * @param delivery_date セットする delivery_date
	 */
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	/**
	 * 配達希望時間帯取得メソッド
	 * @return delivery_time_string
	 */
	public String getDelivery_time_string() {
		return delivery_time_string;
	}

	/**
	 * 配達希望時間帯格納メソッド
	 * @param delivery_time_string セットする delivery_time_string
	 */
	public void setDelivery_time_string(String delivery_time_string) {
		this.delivery_time_string = delivery_time_string;
	}



}
