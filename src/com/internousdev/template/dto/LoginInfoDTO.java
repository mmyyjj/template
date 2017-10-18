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
	 * ログイン中ユーザーのユーザー名
	 * */
	private String user_name;

	/**
	 * ログイン中ユーザーのメールアドレス
	 * */
	/*ログイン時認証に使用 1/2*/
	private String mail_address;

	/**
	 * ログイン中ユーザーのパスワード
	 * */
	/*ログイン認証に使用 2/2*/
	private String password;

	/**
	 * ログイン中ユーザーのログインフラグ
	 * */
	private boolean login_flg = false;


	//以下、getter/setter---------------------------------

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
	 * ログインフラグ取得メソッド
	 * @return login_flg
	 */
	public boolean isLogin_flg() {
		return login_flg;
	}

	/**
	 * ログインフラグ格納メソッド
	 * @param login_flg セットする login_flg boolean
	 */
	public void setLogin_flg(boolean login_flg) {
		this.login_flg = login_flg;
	}

}
