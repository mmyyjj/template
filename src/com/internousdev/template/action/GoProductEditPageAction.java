package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectImagePathDAO;
import com.internousdev.template.dao.SelectOneProductDAO;
import com.internousdev.template.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報の編集ページに遷移するアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 *
 * */
public class GoProductEditPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 3201805201447792344L;

	/**
	 * 編集する商品のID
	 * */
	private int edit_product_id;

	/**
	 * 画像パスリスト
	 * */
	private ArrayList<String> imagePathList = new ArrayList<String>();

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();


	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;



		/*画像パスリストの取得*/
		SelectImagePathDAO sipdao = new SelectImagePathDAO();
		imagePathList = sipdao.selectImagePath();

		/*編集データの取得*/
		ProductInfoDTO pidto = new ProductInfoDTO();
		//TODO DAOはこれから
		SelectOneProductDAO sopdao = new SelectOneProductDAO();

		pidto = sopdao.selectOneProduct(edit_product_id);

		if(pidto != null){
			session.put("edit_product_id", edit_product_id);
			session.put("edit_product_name", pidto.getProduct_name());
			session.put("edit_category", pidto.getCategory());
			session.put("edit_unit_price", pidto.getUnit_price());
			session.put("edit_current_stock", pidto.getCurrent_stock());
			session.put("edit_comment", pidto.getComment());
			session.put("edit_img_path", pidto.getImg_path());
			result=SUCCESS;
		}


		return result;
	}










	/**
	 * @return edit_product_id
	 */
	public int getEdit_product_id() {
		return edit_product_id;
	}


	/**
	 * @param edit_product_id セットする edit_product_id
	 */
	public void setEdit_product_id(int edit_product_id) {
		this.edit_product_id = edit_product_id;
	}


	/**
	 * @return imagePathList
	 */
	public ArrayList<String> getImagePathList() {
		return imagePathList;
	}


	/**
	 * @param imagePathList セットする imagePathList
	 */
	public void setImagePathList(ArrayList<String> imagePathList) {
		this.imagePathList = imagePathList;
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
