package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.SelectItemDAO;
import com.internousdev.template.dto.ProductInfoDTO;
import com.internousdev.template.util.ItemListPaginator;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理側で商品管理の一覧画面に遷移するためのアクション。
 * @suthor YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class GoManagerProductListAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7752240197550306007L;

	/**
	 * 検索ワード
	 * */
	private String select_word;

	/**
	 * 検索カテゴリ
	 * */
	private String select_category;

	/**
	 * 全商品のリスト
	 * */
	private List<ProductInfoDTO> allProductList = new ArrayList<ProductInfoDTO>();

	/**
	 * ページネートされた商品リスト
	 * */
	private List<ProductInfoDTO> paginatedProductList = new ArrayList<ProductInfoDTO>();


	/**
	 * 1ページに表示する件数
	 * */
	private int max_in_page = 10;

	/**
	 * 現在のページ数
	 * */
	private int current_page =1;

	/**
	 * 最大ページ数
	 * */
	private int max_page;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();




	/**
	 * 実行メソッド
	 * */
	public String execute(){
		String result = ERROR;

		SelectItemDAO sidao = new SelectItemDAO();
		ItemListPaginator ilp = new ItemListPaginator();

		allProductList = sidao.selectItem(select_word, select_category);
		max_page = ilp.returnMaxPage(allProductList, max_in_page);
		session.put("allProductList", allProductList);

		paginatedProductList = ilp.paginateItemList(allProductList, current_page, max_in_page);

		result = SUCCESS;

		return result;



	}




	/**
	 * @return select_word
	 */
	public String getSelect_word() {
		return select_word;
	}




	/**
	 * @param select_word セットする select_word
	 */
	public void setSelect_word(String select_word) {
		this.select_word = select_word;
	}




	/**
	 * @return select_category
	 */
	public String getSelect_category() {
		return select_category;
	}




	/**
	 * @param select_category セットする select_category
	 */
	public void setSelect_category(String select_category) {
		this.select_category = select_category;
	}




	/**
	 * @return allProductList
	 */
	public List<ProductInfoDTO> getAllProductList() {
		return allProductList;
	}




	/**
	 * @param allProductList セットする allProductList
	 */
	public void setAllProductList(List<ProductInfoDTO> allProductList) {
		this.allProductList = allProductList;
	}




	/**
	 * @return paginatedProductList
	 */
	public List<ProductInfoDTO> getPaginatedProductList() {
		return paginatedProductList;
	}




	/**
	 * @param paginatedProductList セットする paginatedProductList
	 */
	public void setPaginatedProductList(List<ProductInfoDTO> paginatedProductList) {
		this.paginatedProductList = paginatedProductList;
	}




	/**
	 * @return max_in_page
	 */
	public int getMax_in_page() {
		return max_in_page;
	}




	/**
	 * @param max_in_page セットする max_in_page
	 */
	public void setMax_in_page(int max_in_page) {
		this.max_in_page = max_in_page;
	}




	/**
	 * @return current_page
	 */
	public int getCurrent_page() {
		return current_page;
	}




	/**
	 * @param current_page セットする current_page
	 */
	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}




	/**
	 * @return max_page
	 */
	public int getMax_page() {
		return max_page;
	}




	/**
	 * @param max_page セットする max_page
	 */
	public void setMax_page(int max_page) {
		this.max_page = max_page;
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
