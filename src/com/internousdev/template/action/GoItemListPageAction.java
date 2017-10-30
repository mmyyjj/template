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
 * 商品一覧ページを表示するためのアクションクラス。ユーザー側で使用。<br>
 * DBから取得した商品のデータを格納し、jspに渡すためのリストを用意する。<br>
 * ページネーションもここで行う。
 * @author YUKA MATSUMURA
 * @since 2017/10/20
 * @version1.0
 * */
public class GoItemListPageAction extends ActionSupport implements SessionAware {

	/**
	 * 検索ワード
	 * */
	private String selectWord;

	/**
	 * 検索カテゴリー
	 * */
	private String selectCategory;


	/**
	 * 全商品のリスト
	 * */
	private List<ProductInfoDTO> allItemList = new ArrayList<ProductInfoDTO>();

	/**
	 * ページネートされたリスト
	 * */
	private List<ProductInfoDTO> paginatedItemList = new ArrayList<ProductInfoDTO>();


	/**
	 * 1ページに表示する件数
	 * */
	private int max_in_page = 3;

	/**
	 * 現在のページ数
	 * */
	private int currentPage =1;

	/**
	 * 最大ページ数
	 * */
	private int maxPage;

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();



	/**
	 * 実行メソッド
	 * */
	public String execute(){

		System.out.println("GoItemListPageAction-currentPage" + currentPage);
		System.out.println("GoItemListPageAction-maxPage" + maxPage);

		String result = ERROR;

		SelectItemDAO sidao = new SelectItemDAO();
		ItemListPaginator ilp = new ItemListPaginator();

		/*DAOから全商品の情報リストを取得*/
		allItemList = sidao.selectItem(selectWord, selectCategory);

		/*最大ページ数とページネートされたリストを取得*/
		maxPage = ilp.returnMaxPage(allItemList, max_in_page);
		paginatedItemList = ilp.paginateItemList(allItemList, currentPage, max_in_page);

		if(paginatedItemList.size() > 0){
			result = SUCCESS;
		}

		System.out.println("GoItemListAction-result:" + result);
		return result;

	}



	/**
	 * @return selectWord
	 */
	public String getSelectWord() {
		return selectWord;
	}



	/**
	 * @param selectWord セットする selectWord
	 */
	public void setSelectWord(String selectWord) {
		this.selectWord = selectWord;
	}



	/**
	 * @return selectCategory
	 */
	public String getSelectCategory() {
		return selectCategory;
	}



	/**
	 * @param selectCategory セットする selectCategory
	 */
	public void setSelectCategory(String selectCategory) {
		this.selectCategory = selectCategory;
	}



	/**
	 * @return allItemList
	 */
	public List<ProductInfoDTO> getAllItemList() {
		return allItemList;
	}



	/**
	 * @param allItemList セットする allItemList
	 */
	public void setAllItemList(List<ProductInfoDTO> allItemList) {
		this.allItemList = allItemList;
	}



	/**
	 * @return paginatedItemList
	 */
	public List<ProductInfoDTO> getPaginatedItemList() {
		return paginatedItemList;
	}



	/**
	 * @param paginatedItemList セットする paginatedItemList
	 */
	public void setPaginatedItemList(List<ProductInfoDTO> paginatedItemList) {
		this.paginatedItemList = paginatedItemList;
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
	 * @return currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}



	/**
	 * @param currentPage セットする currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}



	/**
	 * @return maxPage
	 */
	public int getMaxPage() {
		return maxPage;
	}



	/**
	 * @param maxPage セットする maxPage
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
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
