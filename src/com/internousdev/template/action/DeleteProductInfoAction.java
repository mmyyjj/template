package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.DeleteProductInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報の削除を行うためのアクションクラス。管理側で使用
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class DeleteProductInfoAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -4690675776907196860L;

	/**
	 * 削除する商品のID
	 * */
	private int delete_product_id;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		DeleteProductInfoDAO dpidao = new DeleteProductInfoDAO();

		int successed_num = dpidao.updateProduct(delete_product_id);

		if(successed_num > 0){
			result = SUCCESS;
		}

		return result;
	}


	/**
	 * @return delete_product_id
	 */
	public int getDelete_product_id() {
		return delete_product_id;
	}


	/**
	 * @param delete_product_id セットする delete_product_id
	 */
	public void setDelete_product_id(int delete_product_id) {
		this.delete_product_id = delete_product_id;
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
