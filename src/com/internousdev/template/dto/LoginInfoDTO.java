package com.internousdev.template.dto;

/**
 * ログイン情報を格納するクラス。
 * この中身の情報をセッションに保管し、ログイン中のユーザー情報を保持させる。
 * @author YUKA MATSUMURA
 * @since 2017/10/18
 * @version 2017/10/18
 * */
public class LoginInfoDTO {

	/**
	 * ユーザーID
	 * */
	private int user_id;

	/**
	 * ユーザー名
	 * */
	private String user_name;

	/**
	 * メールアドレス
	 * */
	/*ログイン時認証に使用 1/2*/
	private String mail_address;

	/**
	 * パスワード
	 * */
	/*ログイン認証に使用 2/2*/
	private String password;

	/**
	 * 郵便番号
	 * */
	private String postal_code;

	/**
	 * 住所
	 * */
	private String street_address;

	/**
	 * 連絡先電話番号
	 * */
	private String phone_number;

	/**
	 * ユーザフラグ（ユーザー又は管理者）
	 * */
	private int user_flg;


	/**
	 * ログインフラグ
	 * */
	private int login_flg;


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
	 * @return user_name
	 */
	public String getUser_name() {
		return user_name;
	}


	/**
	 * @param user_name セットする user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	/**
	 * @return mail_address
	 */
	public String getMail_address() {
		return mail_address;
	}


	/**
	 * @param mail_address セットする mail_address
	 */
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}


	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return postal_code
	 */
	public String getPostal_code() {
		return postal_code;
	}


	/**
	 * @param postal_code セットする postal_code
	 */
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}


	/**
	 * @return street_address
	 */
	public String getStreet_address() {
		return street_address;
	}


	/**
	 * @param street_address セットする street_address
	 */
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}


	/**
	 * @return phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}


	/**
	 * @param phone_number セットする phone_number
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	/**
	 * @return user_flg
	 */
	public int getUser_flg() {
		return user_flg;
	}


	/**
	 * @param user_flg セットする user_flg
	 */
	public void setUser_flg(int user_flg) {
		this.user_flg = user_flg;
	}


	/**
	 * @return login_flg
	 */
	public int getLogin_flg() {
		return login_flg;
	}


	/**
	 * @param login_flg セットする login_flg
	 */
	public void setLogin_flg(int login_flg) {
		this.login_flg = login_flg;
	}









}

