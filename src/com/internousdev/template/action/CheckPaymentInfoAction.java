package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.CheckCreditCardDAO;
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
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -5691863049265149922L;

	/**
	 * 配達希望日
	 * */
	private String delivery_date;

	/**
	 * 配達希望時間帯(ID)
	 * */
	private int delivery_time_id;

	/**
	 * お支払い方法(ID)
	 * */
	private int payment_method_id;

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
	 * エラーメッセージ<br>
	 * カード情報の照合でエラーが出たときに使用
	 * */
	private String error_message;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();

	/**
	 * 代金引換のID
	 * */
	public static final int CASH_ON_DELIVERY = 1;

	/**
	 * クレジットカードのID
	 * */
	public static final int CREDIT_CARD = 2;

	public String execute(){

		String result = ERROR;

		/*共通の処理*/
		session.put("delivery_date", delivery_date);
		session.put("delivery_time_id", delivery_time_id);
		session.put("payment_method_id", payment_method_id);

		/*代引きとクレジットでif分岐*/
		if(payment_method_id == CASH_ON_DELIVERY){

			BigDecimal total_price = (BigDecimal)session.get("total_price");
			BigDecimal delivery_fee = BigDecimal.valueOf(250);
			session.put("delivery_fee", delivery_fee);
			session.put("total_price", total_price.add(delivery_fee));
			result = SUCCESS;
			return result;


		} else if(payment_method_id == CREDIT_CARD) {

			error_message="入力情報に誤りがあります。お手数ですがもう一度ご入力ください。";
			BigDecimal delivery_fee = BigDecimal.valueOf(0);
			session.put("delivery_fee", delivery_fee);

			String card_number_all
			  = card_number_1 + "-" + card_number_2 + "-" + card_number_3 + "-" + card_number_4;

			//DAOでDBと情報を照合する処理
			CheckCreditCardDAO cccdao = new CheckCreditCardDAO();

			if(cccdao.checkCreditInfo(card_type,card_number_all,holder_name,expiration_month, expiration_year,security_code) > 0){

				card_number_1 = "****";
				card_number_2 = "****";
				card_number_3 = "****";

				security_code = "***";

				error_message = "";
				result = SUCCESS;
			}
		}

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
	 * @return payment_method_id
	 */
	public int getPayment_method_id() {
		return payment_method_id;
	}


	/**
	 * @param payment_method_id セットする payment_method_id
	 */
	public void setPayment_method_id(int payment_method_id) {
		this.payment_method_id = payment_method_id;
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
	 * @return error_message
	 */
	public String getError_message() {
		return error_message;
	}


	/**
	 * @param error_message セットする error_message
	 */
	public void setError_message(String error_message) {
		this.error_message = error_message;
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
