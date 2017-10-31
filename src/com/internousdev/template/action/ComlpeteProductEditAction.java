package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UpdateProductInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報の更新を行うアクションクラス。管理側で使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class ComlpeteProductEditAction extends ActionSupport implements SessionAware{

	/**
	 *
	 */
	private static final long serialVersionUID = 5014892195112552756L;
	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		/*セッションから変数の取得
		 * （直接指定しても可能ですが、横に長くなってしまうので一度移し変えています）*/
		int edit_product_id = (int)session.get("edit_product_id");
		String edit_product_name = (String)session.get("edit_product_name");
		String edit_category = (String)session.get("edit_category");
		BigDecimal edit_unit_price = (BigDecimal)session.get("edit_unit_price");
		int edit_current_stock = (int)session.get("edit_current_stock");
		String edit_comment = (String)session.get("edit_comment");
		String edit_img_path = (String)session.get("edit_img_path");


		UpdateProductInfoDAO upidao = new UpdateProductInfoDAO();

		int successed_num = upidao.updateProduct(edit_product_id, edit_product_name, edit_category,edit_unit_price,
				edit_current_stock, edit_comment, edit_img_path);

		if(successed_num > 0){
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
