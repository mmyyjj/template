package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UpdateCartDAO;
import com.internousdev.template.dto.CartItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カートの再読込を行うためのアクション。ユーザー側で使用。<br>
 * 会計手続き中に在庫切れになった商品があった場合に使用する。<br>
 * カートの中を在庫のある商品のみに更新する。
 * @author YUKA MATSUMURA
 * @since 2017/10/27
 * @version 1.0
 * */
public class ReloadCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -1122579304795322188L;
	/**
	 * セッション
	 * */
	private Map<String,Object> session = new HashMap<String, Object>();

	@SuppressWarnings("unchecked")
	public String execute(){
		String result = ERROR;

		int user_id = (int)session.get("user_id");
		ArrayList<CartItemDTO> cartItemList = (ArrayList<CartItemDTO>)session.get("cartItemList");

		UpdateCartDAO ucdao = new UpdateCartDAO();
		String condition = ucdao.updateCart(user_id, cartItemList);

		if(condition == "update_successed"){
			result = SUCCESS;
		}

		return result;
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
