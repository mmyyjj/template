package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.InsertNewUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規ユーザー情報を確認し、DBへの登録を行うアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class CreateNewAccountAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -1327050254509480237L;

	/**
	 * 新規ユーザー名
	 * */
	private String new_user_name;

	/**
	 * 新規メールアドレス1/2
	 * */
	private String new_mail_address_1;

	/**
	 * 新規メールアドレス2/2
	 * */
	private String new_mail_address_2;

	/**
	 * 新規郵便番号1/2
	 * */
	private String new_postal_code_1;

	/**
	 * 新規郵便番号1/2
	 * */
	private String new_postal_code_2;

	/**
	 * 新規住所
	 * */
	private String new_street_address;

	/**
	 * 新規連絡先1/3
	 * */
	private String new_phone_number_1;

	/**
	 * 新規連絡先2/3
	 * */
	private String new_phone_number_2;

	/**
	 * 新規連絡先3/3
	 * */
	private String new_phone_number_3;

	/**
	 * 新規パスワード
	 * */
	private String new_password;

	/**
	 * 新規パスワード（確認用）
	 * */
	private String new_password_confirm;

	/**
	 * メッセージ
	 * */
	private String message;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;


		/*はじめにパスワードの確認*/
		if(new_password.equals(new_password_confirm) == false){
			message = "パスワード、または確認用パスワードに誤りがあります";
			return result;
		}

		String new_mail_address_all = new_mail_address_1 + new_mail_address_1;
		String new_postal_code_all = new_postal_code_1 + new_postal_code_2;
		String new_phone_number_all = new_phone_number_1 + new_phone_number_2 + new_phone_number_3;

		InsertNewUserDAO inudao = new InsertNewUserDAO();

		int successed_num = inudao.insertNewUser(new_user_name, new_mail_address_all, new_password, new_postal_code_all,
				new_street_address, new_phone_number_all);

		if(successed_num > 0){
			result = SUCCESS;
		} else {
			message = "新規登録に失敗しました。メールアドレスはすでに登録されている可能性があります。";
		}

		return result;

	}


	/**
	 * @return new_user_name
	 */
	public String getNew_user_name() {
		return new_user_name;
	}


	/**
	 * @param new_user_name セットする new_user_name
	 */
	public void setNew_user_name(String new_user_name) {
		this.new_user_name = new_user_name;
	}


	/**
	 * @return new_mail_address_1
	 */
	public String getNew_mail_address_1() {
		return new_mail_address_1;
	}


	/**
	 * @param new_mail_address_1 セットする new_mail_address_1
	 */
	public void setNew_mail_address_1(String new_mail_address_1) {
		this.new_mail_address_1 = new_mail_address_1;
	}


	/**
	 * @return new_mail_address_2
	 */
	public String getNew_mail_address_2() {
		return new_mail_address_2;
	}


	/**
	 * @param new_mail_address_2 セットする new_mail_address_2
	 */
	public void setNew_mail_address_2(String new_mail_address_2) {
		this.new_mail_address_2 = new_mail_address_2;
	}


	/**
	 * @return new_postal_code_1
	 */
	public String getNew_postal_code_1() {
		return new_postal_code_1;
	}


	/**
	 * @param new_postal_code_1 セットする new_postal_code_1
	 */
	public void setNew_postal_code_1(String new_postal_code_1) {
		this.new_postal_code_1 = new_postal_code_1;
	}


	/**
	 * @return new_postal_code_2
	 */
	public String getNew_postal_code_2() {
		return new_postal_code_2;
	}


	/**
	 * @param new_postal_code_2 セットする new_postal_code_2
	 */
	public void setNew_postal_code_2(String new_postal_code_2) {
		this.new_postal_code_2 = new_postal_code_2;
	}


	/**
	 * @return new_street_address
	 */
	public String getNew_street_address() {
		return new_street_address;
	}


	/**
	 * @param new_street_address セットする new_street_address
	 */
	public void setNew_street_address(String new_street_address) {
		this.new_street_address = new_street_address;
	}


	/**
	 * @return new_phone_number_1
	 */
	public String getNew_phone_number_1() {
		return new_phone_number_1;
	}


	/**
	 * @param new_phone_number_1 セットする new_phone_number_1
	 */
	public void setNew_phone_number_1(String new_phone_number_1) {
		this.new_phone_number_1 = new_phone_number_1;
	}


	/**
	 * @return new_phone_number_2
	 */
	public String getNew_phone_number_2() {
		return new_phone_number_2;
	}


	/**
	 * @param new_phone_number_2 セットする new_phone_number_2
	 */
	public void setNew_phone_number_2(String new_phone_number_2) {
		this.new_phone_number_2 = new_phone_number_2;
	}


	/**
	 * @return new_phone_number_3
	 */
	public String getNew_phone_number_3() {
		return new_phone_number_3;
	}


	/**
	 * @param new_phone_number_3 セットする new_phone_number_3
	 */
	public void setNew_phone_number_3(String new_phone_number_3) {
		this.new_phone_number_3 = new_phone_number_3;
	}


	/**
	 * @return new_password
	 */
	public String getNew_password() {
		return new_password;
	}


	/**
	 * @param new_password セットする new_password
	 */
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}


	/**
	 * @return new_password_confirm
	 */
	public String getNew_password_confirm() {
		return new_password_confirm;
	}


	/**
	 * @param new_password_confirm セットする new_password_confirm
	 */
	public void setNew_password_confirm(String new_password_confirm) {
		this.new_password_confirm = new_password_confirm;
	}


	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message セットする message
	 */
	public void setMessage(String message) {
		this.message = message;
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
