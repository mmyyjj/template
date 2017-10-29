package com.internousdev.template.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.HistoryOutlineDTO;

/**
 * 購入履歴(概要)のページネートを行うためのクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/29
 * @version 1.0
 * */
public class HistoryOutlinePaginator {



	/**
	 * 1ページに表示する件数
	 * */
	private int maxInPage = 3;

	/**
	 * 渡された全履歴のリストから最大ページ数を取得するメソッド
	 * */
	public int returnMaxPage(List<HistoryOutlineDTO> allHistoryList){

		int maxPage = 0;
		int allItem = allHistoryList.size();

		System.out.println("ListPagination-allItem:" +  allItem);

		if(allItem % maxInPage == 0){
			maxPage = (allItem / maxInPage);
		}else if(allItem / maxInPage != 0){
			maxPage = (allItem / maxInPage) + 1;
		}

		System.out.println("ListPagination-maxPage:" + maxPage);
		return maxPage;

	}

	/**
	 * 全商品のリスト、最大ページ数、現在のページ数、最大表示件数を元に、
	 * 次のページで表示する1ページ分のリストを作成するメソッド
	 * */
	public ArrayList<HistoryOutlineDTO> paginateList(ArrayList<HistoryOutlineDTO> allHistoryList,int currentPage){

		ArrayList<HistoryOutlineDTO> paginatedHistoryList = new ArrayList<HistoryOutlineDTO>();
		/*どこから*/
		int firstIndex = 0;
		firstIndex = firstIndex + ((currentPage - 1) * maxInPage);

		/*どこまで*/
		int lastIndex = 0;
		lastIndex = lastIndex + (currentPage * maxInPage);

		for(int i = firstIndex; i < lastIndex; i++){
			if(i >= allHistoryList.size()){
				break;
			}
			paginatedHistoryList.add(allHistoryList.get(i));
		}

		return paginatedHistoryList;


	}




}
