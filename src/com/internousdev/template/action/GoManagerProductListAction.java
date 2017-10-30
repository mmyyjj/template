package com.internousdev.template.action;

import java.util.ArrayList;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理側で商品管理の一覧画面に遷移するためのアクション。
 * @suthor YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class GoManagerProductListAction extends ActionSupport implements SessionAware{

	/**
	 * 全商品のリスト
	 * */
	private ArrayList<ProductInfoDTO> allProductList = new ArrayList<ProductInfoDTO>();

	/**
	 * ページネートされた商品リスト
	 * */
	private ArrayList<ProductInfoDTO> paginatedProductList = new ArrayList<ProductInfoDTO>();

	/**
	 * 現在のページ数
	 * */
	private int surrent_page;

	/**
	 * 最大ページ数
	 * */
	private int max_page;

	/**
	 * 実行メソッド
	 * */
	public String execute(){

	}

	/**
	 * @return allProductList
	 */
	public ArrayList<ProductInfoDTO> getAllProductList() {
		return allProductList;
	}

	/**
	 * @param allProductList セットする allProductList
	 */
	public void setAllProductList(ArrayList<ProductInfoDTO> allProductList) {
		this.allProductList = allProductList;
	}

	/**
	 * @return paginatedProductList
	 */
	public ArrayList<ProductInfoDTO> getPaginatedProductList() {
		return paginatedProductList;
	}

	/**
	 * @param paginatedProductList セットする paginatedProductList
	 */
	public void setPaginatedProductList(ArrayList<ProductInfoDTO> paginatedProductList) {
		this.paginatedProductList = paginatedProductList;
	}

	/**
	 * @return surrent_page
	 */
	public int getSurrent_page() {
		return surrent_page;
	}

	/**
	 * @param surrent_page セットする surrent_page
	 */
	public void setSurrent_page(int surrent_page) {
		this.surrent_page = surrent_page;
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


}
