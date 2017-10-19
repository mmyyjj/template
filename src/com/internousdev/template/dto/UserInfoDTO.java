package com.internousdev.template.dto;

/**
 * ユーザー情報を格納するためのクラス。
 * ユーザー側のマイページ、管理側の顧客管理等で使用。<br>
 * 顧客管理の一覧ではこのDTOをリストにして情報を受け渡しをする。
 * @author YUKA MATSUMURA
 * @since 2017/10/19
 * @version 1.0
 * */
public class UserInfoDTO {

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
	private String mail_address;

	/**
	 * パスワード
	 * */
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
	 * 電話番号
	 * */
	private String phone_number;

	/**
	 * ユーザーフラグ<br>
	 * (ユーザー、管理者を区別するためのもの)
	 * */
	private int user_flg;



	//以下、setter/getter----------------------------------



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
	 * メールアドレス取得メソッド
	 * @return mail_address
	 */
	public String getMail_address() {
		return mail_address;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param mail_address セットする mail_address
	 */
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}

	/**
	 * パスワード取得メソッド
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード格納メソッド
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 郵便番号取得メソッド
	 * @return postal_code
	 */
	public String getPostal_code() {
		return postal_code;
	}

	/**
	 * 郵便番号格納メソッド
	 * @param postal_code セットする postal_code
	 */
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * 住所取得メソッド
	 * @return street_address
	 */
	public String getStreet_address() {
		return street_address;
	}

	/**
	 * 住所格納メソッド
	 * @param street_address セットする street_address
	 */
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	/**
	 * 電話番号取得メソッド
	 * @return phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * 電話番号格納メソッド
	 * @param phone_number セットする phone_number
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * ユーザーフラグ取得メソッド
	 * @return user_flg
	 */
	public int getUser_flg() {
		return user_flg;
	}

	/**
	 * ユーザーフラグ格納メソッド
	 * @param user_flg セットする user_flg
	 */
	public void setUser_flg(int user_flg) {
		this.user_flg = user_flg;
	}



}
