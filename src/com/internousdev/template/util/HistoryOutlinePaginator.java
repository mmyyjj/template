package com.internousdev.template.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.HistoryOutlineDTO;

/**
 * 購入履歴(概要)のページネートを行うためのクラス。<br>
 * ユーザー側、管理者側双方で使用する。
 * @author YUKA MATSUMURA
 * @since 2017/10/30
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
		int allHistory = allHistoryList.size();

		System.out.println("ListPagination-allItem:" +  allHistory);

		if(allHistory % maxInPage == 0){
			maxPage = (allHistory / maxInPage);
		}else if(allHistory / maxInPage != 0){
			maxPage = (allHistory / maxInPage) + 1;
		}

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
