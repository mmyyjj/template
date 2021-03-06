package com.internousdev.template.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.ProductInfoDTO;

/**
 * 商品一覧ページの表示に使用。
 * 引数として与えられたリストをページネートするクラス。
 * 引数として商品リスト、最大表示件数、現在のページを使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/20
 * @ version 1.0
 * */
public class ItemListPaginator {


	/**
	 * 渡された全標品のリストから最大ページ数を取得するメソッド
	 * */
	public int returnMaxPage(List<ProductInfoDTO> allItemList, int max_in_page){

		int maxPage = 0;
		int allItem = allItemList.size();

		if(allItem % max_in_page == 0){
			maxPage = (allItem / max_in_page);
		}else if(allItem / max_in_page != 0){
			maxPage = (allItem / max_in_page) + 1;
		}

		return maxPage;

	}

	/**
	 * 全商品のリスト、最大ページ数、現在のページ数、最大表示件数を元に、
	 * 次のページで表示する1ページ分のリストを作成するメソッド
	 * */
	public List<ProductInfoDTO> paginateItemList(List<ProductInfoDTO> allItemList,int currentPage, int max_in_page){

		List<ProductInfoDTO> paginatedItemList = new ArrayList<ProductInfoDTO>();
		/*どこから*/
		int firstIndex = 0;
		firstIndex = firstIndex + ((currentPage - 1) * max_in_page);

		/*どこまで*/
		int lastIndex = 0;
		lastIndex = lastIndex + (currentPage * max_in_page);

		for(int i = firstIndex; i < lastIndex; i++){
			if(i >= allItemList.size()){
				break;
			}
			paginatedItemList.add(allItemList.get(i));
		}

		return paginatedItemList;


	}


}
