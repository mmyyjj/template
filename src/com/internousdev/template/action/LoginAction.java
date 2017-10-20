package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.LoginInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

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

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * ログイン情報を入れ、セッションに保管するLoginIndoDTO
	 * */
	private LoginInfoDTO  lidto = new LoginInfoDTO();


	/**
	 * 実行メソッド
	 * */
	public String execute(){

		String result = ERROR;

		if(lidto.isLogin_flg() != false){
			result = "nowLogin";
			System.out.println("LoginAction-result:" + result);
			return result;
		}

		LoginDAO ldao = new LoginDAO();

		lidto = ldao.login(mail_address, password);

		if(lidto.isLogin_flg() == true){
			session.put("loginInfo", lidto);
			user_name = ((LoginInfoDTO)session.get("loginInfo")).getUser_name();
			System.out.println("LoginAction-取得セッションのユーザー名：" + user_name);
			result = SUCCESS;
		}

		System.out.println("LoginAction-result:" + result);
		return result;


	}





	//以下、setter/getter--------------------------

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
	 * @param login_flg セットする login_flg
	 */
	public void setLogin_flg(boolean login_flg) {
		this.login_flg = login_flg;
	}


	/**
	 * セッション取得メソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * セッション格納メソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	/**
	 * loginDTO取得メソッド
	 * @return lidto
	 */
	public LoginInfoDTO getLidto() {
		return lidto;
	}


	/**
	 * loginDTO取得メソッド
	 * @param lidto セットする lidto
	 */
	public void setLidto(LoginInfoDTO lidto) {
		this.lidto = lidto;
	}




}
