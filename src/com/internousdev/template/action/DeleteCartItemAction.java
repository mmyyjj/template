package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.DeleteCartItemDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の商品の削除を行うアクションクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class DeleteCartItemAction extends ActionSupport implements SessionAware{


	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * セッション
	 * */
	private Map<String, Object> session  = new HashMap<String, Object>();



	public String execute(){

		System.out.println("eteCartItemAction-product_id:" + product_id);

		String result = ERROR;
		int successed_num = 0;
		int user_id = (int)session.get("user_id");
		DeleteCartItemDAO dcidao = new DeleteCartItemDAO();

		successed_num = dcidao.deleteCartItem(user_id, product_id);

		if(successed_num > 0){
			result = SUCCESS;
		}

		return result;



	}

















	/**
	 * @return product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id セットする product_id
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
