package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力された支払い情報を確認するためのアクション。ユーザー側で使用。<br>
 * 代引きかクレジットカードかによって処理が変わる。<br>
 * クレジットカードが選択された場合は、DAOを使ってクレジットカード情報の照合を行う
 * @author YUKA MATSUMURA
 * @since 2017/10/25
 * @version 1.0
 / */
public class CheckPaymentInfoAction extends ActionSupport implements SessionAware{

	/**
	 * 配達希望日
	 * */
	private String delivery_date;

	/**
	 * 配達希望時間帯(ID)
	 * */
	private int delivery_time_id;

	/**
	 * 配達希望時間帯(文字列)
	 * */
	private String delivery_time_string;

	/**
	 * お支払い方法
	 * */
	private String payment_method;

	/**
	 * カードの種類
	 * */
	private String card_type;

	/**
	 *カード番号(1/4)
	 * */
	private String card_number_1;

	/**
	 *カード番号(2/4)
	 * */
	private String card_number_2;

	/**
	 *カード番号(3/4)
	 * */
	private String card_number_3;

	/**
	 *カード番号(4/4)
	 * */
	private String card_number_4;

	/**
	 * カード名義
	 * */
	private String holder_name;

	/**
	 * 有効期限(年)
	 * */
	private String expiration_year;

	/**
	 * 有効期限(月)
	 * */
	private String expiration_month;

	/**
	 * セキュリティコード
	 * */
	private String security_code;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	public String execute(){

		String result = SUCCESS;

		return result;
	}














	/**
	 * @return delivery_date
	 */
	public String getDelivery_date() {
		return delivery_date;
	}

	/**
	 * @param delivery_date セットする delivery_date
	 */
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	/**
	 * @return delivery_time_id
	 */
	public int getDelivery_time_id() {
		return delivery_time_id;
	}

	/**
	 * @param delivery_time_id セットする delivery_time_id
	 */
	public void setDelivery_time_id(int delivery_time_id) {
		this.delivery_time_id = delivery_time_id;
	}

	/**
	 * @return delivery_time_string
	 */
	public String getDelivery_time_string() {
		return delivery_time_string;
	}

	/**
	 * @param delivery_time_string セットする delivery_time_string
	 */
	public void setDelivery_time_string(String delivery_time_string) {
		this.delivery_time_string = delivery_time_string;
	}

	/**
	 * @return payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}

	/**
	 * @param payment_method セットする payment_method
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * @return card_type
	 */
	public String getCard_type() {
		return card_type;
	}

	/**
	 * @param card_type セットする card_type
	 */
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	/**
	 * @return card_number_1
	 */
	public String getCard_number_1() {
		return card_number_1;
	}

	/**
	 * @param card_number_1 セットする card_number_1
	 */
	public void setCard_number_1(String card_number_1) {
		this.card_number_1 = card_number_1;
	}

	/**
	 * @return card_number_2
	 */
	public String getCard_number_2() {
		return card_number_2;
	}

	/**
	 * @param card_number_2 セットする card_number_2
	 */
	public void setCard_number_2(String card_number_2) {
		this.card_number_2 = card_number_2;
	}

	/**
	 * @return card_number_3
	 */
	public String getCard_number_3() {
		return card_number_3;
	}

	/**
	 * @param card_number_3 セットする card_number_3
	 */
	public void setCard_number_3(String card_number_3) {
		this.card_number_3 = card_number_3;
	}

	/**
	 * @return card_number_4
	 */
	public String getCard_number_4() {
		return card_number_4;
	}

	/**
	 * @param card_number_4 セットする card_number_4
	 */
	public void setCard_number_4(String card_number_4) {
		this.card_number_4 = card_number_4;
	}

	/**
	 * @return holder_name
	 */
	public String getHolder_name() {
		return holder_name;
	}

	/**
	 * @param holder_name セットする holder_name
	 */
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	/**
	 * @return expiration_year
	 */
	public String getExpiration_year() {
		return expiration_year;
	}

	/**
	 * @param expiration_year セットする expiration_year
	 */
	public void setExpiration_year(String expiration_year) {
		this.expiration_year = expiration_year;
	}

	/**
	 * @return expiration_month
	 */
	public String getExpiration_month() {
		return expiration_month;
	}

	/**
	 * @param expiration_month セットする expiration_month
	 */
	public void setExpiration_month(String expiration_month) {
		this.expiration_month = expiration_month;
	}

	/**
	 * @return security_code
	 */
	public String getSecurity_code() {
		return security_code;
	}

	/**
	 * @param security_code セットする security_code
	 */
	public void setSecurity_code(String security_code) {
		this.security_code = security_code;
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
