package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.GoCartDAO;
import com.internousdev.template.dto.CartItemDTO;
import com.internousdev.template.dto.LoginInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**カート画面を表示するためのアクション。ユーザー側で使用。<br>
 * DAOを使ってCartItemDTOのリストを作成する。合計金額の計算もここで行う。<br>
 * 合計金額は、代金引換の場合のみ手数料が加算されるため、処理を忘れないよう注意。
 * @author YUKA MATUMURA
 * @since 2017/10/24
 * @verion 1.0*/
public class GoCartAction extends ActionSupport implements SessionAware{

	/**
	 * カート情報リスト
	 * */
	private List<CartItemDTO> cartItemList = new ArrayList<CartItemDTO>();

	/**
	 * 合計金額
	 * */
	private int toral_price;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	public String execute(){

		String result = ERROR;

		GoCartDAO gcdao = new GoCartDAO();

		int user_id = ((LoginInfoDTO)session.get("loginInfo")).getUser_id();

		cartItemList = gcdao.createCartItemList(user_id);

		if(cartItemList.size() > 0){
			result = SUCCESS;
		}

		System.out.println("GoCartAcyion-result" + result);
		return result;

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
	 * @return toral_price
	 */
	public int getToral_price() {
		return toral_price;
	}


	/**
	 * @param toral_price セットする toral_price
	 */
	public void setToral_price(int toral_price) {
		this.toral_price = toral_price;
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
