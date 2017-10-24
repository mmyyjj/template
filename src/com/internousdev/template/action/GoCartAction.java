package com.internousdev.template.action;

import java.math.BigDecimal;
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
	 * プレゼント包装料
	 * */
	private BigDecimal gift_wrapping_fee;

	/**
	 * 商品小計
	 * */
	private BigDecimal product_subtotal;

	/**
	 * 合計金額
	 * */
	private BigDecimal total_price;

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
			product_subtotal = gcdao.returnProductSubtotal(user_id);
			gift_wrapping_fee = gcdao.returnGiftWrappingFee(user_id);
			total_price = (product_subtotal.add(gift_wrapping_fee));
			session.put("product_subtotal", product_subtotal);
			session.put("gift_wrapping_fee", gift_wrapping_fee);
			session.put("total_price", total_price);
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
	 * @return gift_wrapping_fee
	 */
	public BigDecimal getGift_wrapping_fee() {
		return gift_wrapping_fee;
	}


	/**
	 * @param gift_wrapping_fee セットする gift_wrapping_fee
	 */
	public void setGift_wrapping_fee(BigDecimal gift_wrapping_fee) {
		this.gift_wrapping_fee = gift_wrapping_fee;
	}


	/**
	 * @return toral_price
	 */
	public BigDecimal getProduct_subtotal() {
		return product_subtotal;
	}


	/**
	 * @param toral_price セットする toral_price
	 */
	public void setProduct_subtotal(BigDecimal product_subtotal) {
		this.product_subtotal = product_subtotal;
	}


	/**
	 * @return total_price
	 */
	public BigDecimal getTotal_price() {
		return total_price;
	}


	/**
	 * @param total_price セットする total_price
	 */
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
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
