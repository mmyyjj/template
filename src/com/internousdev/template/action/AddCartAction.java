package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AddCartDAO;
import com.internousdev.template.dto.CartItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author YUKA MATSUMURA
 * @since 2017/10/23
 * @version 1.0
 * */
public class AddCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -3038961841047020656L;

	/**
	 * 注文数<br>
	 * */
	private int order_number;

	/**
	 * 商品ID
	 * */
	private int product_id;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * 次の画面で表示するカート情報リスト
	 * */
	private List<CartItemDTO> cartItemList = new ArrayList<CartItemDTO>();

	/**
	 * カート満杯時のメッセージ
	 * */
	private String cart_full_message;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	@SuppressWarnings({ "unchecked" })
	public String execute(){

		String result = ERROR;

		/*はじめにログイン中か、そうでないかをチェック。
		 * ユーザーIDがセッションに登録されていなければ、ゲストと判断。ログインページに遷移*/
		if(session.get("user_id") == null){
			result = "guest";
			return result;
		}

		int user_id = (int)session.get("user_id");
		AddCartDAO acdao = new AddCartDAO();

		/*同じ商品が複数回カートに入れられたかを確認(重複チェック・カート情報更新を同時に行っています)*/
		if (acdao.addItemNumber(user_id, product_id, order_number) > 0) {

			result = "added";

		} else {
			/*カートの中身が満タン(10個)だったら、その旨を返す*/
			cartItemList = (ArrayList<CartItemDTO>)session.get("cartItemList");
			if(cartItemList != null && cartItemList.size() == 10){
				cart_full_message = "一度にお求めいただける商品は10種類までとなっております";
				result = "cart_full";
				return result;
			}

			/*カートに同じ商品がなかった場合は、新しくカートに追加する*/
			int success_number = acdao.addCart(user_id, product_id, unit_price,order_number);
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
	 * @return cartItemList
	 */
	public List<CartItemDTO> getCartItemList() {
		return cartItemList;
	}


	/**
	 * @param cartItemList セットする cartItemList
	 */
	public void setCartItemList(List<CartItemDTO> cartItemList) {
		this.cartItemList = cartItemList;
	}


	/**
	 * @return cart_full_message
	 */
	public String getCart_full_message() {
		return cart_full_message;
	}


	/**
	 * @param cart_full_message セットする cart_full_message
	 */
	public void setCart_full_message(String cart_full_message) {
		this.cart_full_message = cart_full_message;
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
