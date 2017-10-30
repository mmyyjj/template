package com.internousdev.template.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.UserInfoDTO;

/**
 * 顧客情報リストのページネートを行うためのクラス。<br>
 * 管理者側で使用する。
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class CustomerListPaginator {



	/**
	 * 1ページに表示する件数
	 * */
	private int maxInPage = 5;

	/**
	 * 渡された全履歴のリストから最大ページ数を取得するメソッド
	 * */
	public int returnMaxPage(List<UserInfoDTO> allCustomerList){

		int maxPage = 0;
		int allCustomer = allCustomerList.size();

		if(allCustomer % maxInPage == 0){
			maxPage = (allCustomer / maxInPage);
		}else if(allCustomer / maxInPage != 0){
			maxPage = (allCustomer / maxInPage) + 1;
		}

		return maxPage;

	}

	/**
	 * 全商品のリスト、最大ページ数、現在のページ数、最大表示件数を元に、
	 * 次のページで表示する1ページ分のリストを作成するメソッド
	 * */
	public ArrayList<UserInfoDTO> paginateList(ArrayList<UserInfoDTO> allCustomerList,int currentPage){

		ArrayList<UserInfoDTO> paginatedCustomerList = new ArrayList<UserInfoDTO>();
		/*どこから*/
		int firstIndex = 0;
		firstIndex = firstIndex + ((currentPage - 1) * maxInPage);

		/*どこまで*/
		int lastIndex = 0;
		lastIndex = lastIndex + (currentPage * maxInPage);

		for(int i = firstIndex; i < lastIndex; i++){
			if(i >= allCustomerList.size()){
				break;
			}
			paginatedCustomerList.add(allCustomerList.get(i));
		}

		return paginatedCustomerList;


	}




}
