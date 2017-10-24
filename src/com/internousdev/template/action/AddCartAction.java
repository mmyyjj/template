package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AddCartDAO;
import com.internousdev.template.dto.LoginInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author YUKA MATSUMURA
 * @since 2017/10/23
 * @version 1.0
 * */
public class AddCartAction extends ActionSupport implements SessionAware{

	/**
	 * 注文数<br>
	 * フォームからの入力のためStringで処理
	 * */
	private String order_number;

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){

		String result = ERROR;

		LoginInfoDTO lidto = (LoginInfoDTO)session.get("loginInfo");

		int user_id = lidto.getUser_id();
		AddCartDAO acdao = new AddCartDAO();

		/*同じ商品が複数回カートに入れられたかを確認(重複チェック・カート情報更新を同時に行っています)*/
		if (acdao.addItemNumber(user_id, product_id, Integer.parseInt(order_number)) > 0) {

			result = "added";

		} else {
			/*カートに同じ商品がなかった場合は、新しくカートに追加する*/
			int success_number = acdao.addCart(user_id, product_id, unit_price,Integer.parseInt(order_number));
			if(success_number > 0){
				result = SUCCESS;

			}
		}

		System.out.println("AddCartAction-result:" + result);
		return result;

	}


	/**
	 * @return order_number
	 */
	public String getOrder_number() {
		return order_number;
	}


	/**
	 * @param order_number セットする order_number
	 */
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}


	/**
	 * @return priduct_id
	 */
	public int getProduct_id() {
		return product_id;
	}


	/**
	 * @param priduct_id セットする priduct_id
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	/**
	 * @return unit_price
	 */
	public BigDecimal getUnit_price() {
		return unit_price;
	}


	/**
	 * @param unit_price セットする unit_price
	 */
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
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
