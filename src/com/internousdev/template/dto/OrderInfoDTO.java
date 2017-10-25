package com.internousdev.template.dto;

/**
 * 注文情報を格納するためのクラス。<br>
 * ユーザー画面の注文情報入力～注文確定操作で使用。
 * クレジットカードの情報もここに保持する。
 * @author YUKA MATSUMURA
 * @since 0017/10/19
 * @version 1.0
 * */
public class OrderInfoDTO {

	/**
	 * 配達希望日
	 * */
	private String delivery_date;

	/**
	 * 配達希望時間帯(ID)
	 * */
	private int delivery_time_id;

	/**
	 *配達希望時間帯(文字列)
	 * */
	private String delivery_time_string;

	/**
	 * お支払い方法
	 * */
	private String payment_method;

	/**
	 * カード種別
	 * */
	private String card_type;

	/**
	 * カード番号
	 * */
	private String card_number;

	/**
	 * カード名義
	 * */
	private String holder_name;

	/**
	 * 有効期限(月)
	 * */
	private String expiration_month;

	/**
	 * 有効期限(年)
	 * */
	private String expiration_year;

	/**
	 * セキュリティコード
	 * */
	private String security_code;

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
	 * 配達希望時間帯(ID)取得メソッド
	 * @return delivery_time_id
	 */
	public int getDelivery_time_id() {
		return delivery_time_id;
	}

	/**
	 * 配達希望時間帯(ID)格納メソッド
	 * @param delivery_time_id セットする delivery_time_id
	 */
	public void setDelivery_time_id(int delivery_time_id) {
		this.delivery_time_id = delivery_time_id;
	}

	/**
	 * 配達希望時間帯(文字列)取得メソッド
	 * @return delivery_time_string
	 */
	public String getDelivery_time_string() {
		return delivery_time_string;
	}

	/**
	 * 配達希望時間帯(文字列)格納メソッド
	 * @param delivery_time_string セットする delivery_time_string
	 */
	public void setDelivery_time_string(String delivery_time_string) {
		this.delivery_time_string = delivery_time_string;
	}

	/**
	 * お支払い方法取得メソッド
	 * @return payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}

	/**
	 * お支払い方法格納メソッド
	 * @param payment_method セットする payment_method
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * カード種別取得メソッド
	 * @return card_type
	 */
	public String getCard_type() {
		return card_type;
	}

	/**
	 * カード種別格納メソッド
	 * @param card_type セットする card_type
	 */
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	/**
	 * カード番号取得メソッド
	 * @return card_number
	 */
	public String getCard_number() {
		return card_number;
	}

	/**
	 * カード番号格納メソッド
	 * @param card_number セットする card_number
	 */
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	/**
	 * カード名義取得メソッド
	 * @return holder_name
	 */
	public String getHolder_name() {
		return holder_name;
	}

	/**
	 * カード名義格納メソッド
	 * @param holder_name セットする holder_name
	 */
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	/**
	 * 有効期限(月)取得メソッド
	 * @return expiration_month
	 */
	public String getExpiration_month() {
		return expiration_month;
	}

	/**
	 * 有効期限(月)格納メソッド
	 * @param expiration_month セットする expiration_month
	 */
	public void setExpiration_month(String expiration_month) {
		this.expiration_month = expiration_month;
	}

	/**
	 * 有効期限(年)取得メソッド
	 * @return expiration_year
	 */
	public String getExpiration_year() {
		return expiration_year;
	}

	/**
	 * 有効期限(年)格納メソッド
	 * @param expiration_year セットする expiration_year
	 */
	public void setExpiration_year(String expiration_year) {
		this.expiration_year = expiration_year;
	}

	/**
	 * セキュリティコード取得メソッド
	 * @return security_code
	 */
	public String getSecurity_code() {
		return security_code;
	}

	/**
	 * セキュリティコード格納メソッド
	 * @param security_code セットする security_code
	 */
	public void setSecurity_code(String security_code) {
		this.security_code = security_code;
	}





}
