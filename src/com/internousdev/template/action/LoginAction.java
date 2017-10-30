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
	 * エラーメッセージ
	 * */
	private String loginError_message;


	/**
	 * 実行メソッド
	 * */
	public String execute(){

		/*初期の状態はエラー*/
		String result = ERROR;
		loginError_message = "メールアドレス、パスワードのいずれかに誤りがあります";


		/*ログイン後、ブラウザバックして再びログインされた場合の処理*/
		if(session.get("user_id") != null){
			if( mail_address.equals((String)session.get("mail_address"))
					&& password.equals((String)session.get("password")) ){
				loginError_message = "";
				if((int)session.get("user_flg") == 0){
					result = SUCCESS;
				}else if((int)session.get("user_flg") == 1){
					result="manager";
				}

				return result;
			/*ログインする→ログイン画面にブラウザバック→別のアカウントでログインしようとする、と、エラーになる処理*/
			} else {
				session.clear();
				loginError_message = "ログインエラーです。もう一度情報を入力してください。";
				return result;

			}

		}

		/*以下からログイン処理*/
		LoginDAO ldao = new LoginDAO();

		lidto = ldao.login(mail_address, password);


		if(lidto != null){
			//session.put("loginInfo", lidto);
			session.put("user_id", lidto.getUser_id());
			session.put("user_name", lidto.getUser_name());
			session.put("mail_address", lidto.getMail_address());
			session.put("password", lidto.getPassword());
			session.put("postal_code", lidto.getPostal_code());
			session.put("street_address", lidto.getStreet_address());
			session.put("phone_number", lidto.getPhone_number());
			session.put("user_flg", lidto.getUser_flg());
			loginError_message= "";

			/*ログイン成功後、ユーザーか管理者を分ける処理
			 * 0ならユーザー、1なら管理者*/
			if(lidto.getUser_flg() == 0){
				result = SUCCESS;
			}else if(lidto.getUser_flg() == 1){
				result = "manager";
			}

		}

		System.out.println("LoginAction-result:" + result);
		return result;


	}





	//以下、setter/getter--------------------------

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





	/**
	 * @return loginError_message
	 */
	public String getLoginError_message() {
		return loginError_message;
	}





	/**
	 * @param loginError_message セットする loginError_message
	 */
	public void setLoginError_message(String loginError_message) {
		this.loginError_message = loginError_message;
	}




}
