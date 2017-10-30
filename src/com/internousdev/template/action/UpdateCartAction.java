package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UpdateCartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート情報の更新行うためのクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/24
 * @version 1.0
 *  */
public class UpdateCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 8233451837323263388L;

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 注文数
	 * */
	private int order_number;

	/**
	 * プレゼント包装指定数
	 * */
	private int number_for_gift;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	public String execute(){

		String result = ERROR;

		int user_id = (int)session.get("user_id");

		UpdateCartDAO ucdao = new UpdateCartDAO();

		int successed_num = ucdao.updateCart(user_id, product_id, order_number, number_for_gift);

		if(successed_num > 0){
			result =SUCCESS;
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
	 * @return order_number
	 */
	public int getOrder_number() {
		return order_number;
	}

	/**
	 * @param order_number セットする order_number
	 */
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	/**
	 * @return number_for_gift
	 */
	public int getNumber_for_gift() {
		return number_for_gift;
	}

	/**
	 * @param number_for_gift セットする number_for_gift
	 */
	public void setNumber_for_gift(int number_for_gift) {
		this.number_for_gift = number_for_gift;
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
