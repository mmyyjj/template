package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.ProductInfoDTO;
import com.internousdev.template.util.DBConnector;

/**
 * DBから商品情報を取得するためのクラス。
 *<br>
 * 商品一覧ページの表示に使用する。ユーザー、管理側ともに使用。
 * @autohr YUKA MATSUMURA
 * @since 2017/10/20
 * @version 1.0
 * */
public class SelectItemDAO {


	public List<ProductInfoDTO> selectItem(String selectWord, String selectCategory){

		/*最初の準備*/
		List<ProductInfoDTO> selectedList = new ArrayList<ProductInfoDTO>();

		System.out.println("SelectItemDAO-selectCategory:" + selectCategory);

		if(selectWord == null){
			selectWord = "";
		}

		if(selectCategory == null){
			selectCategory ="";
		}

		try{

			/*接続準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			/*sql文を準備*/
			String sql = "SELECT * FROM product_table WHERE product_name LIKE ? AND category LIKE ? AND delete_flg = 0";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, "%" + selectWord + "%");
			ps.setString(2, "%" + selectCategory + "%");

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductInfoDTO pidto = new ProductInfoDTO();
				pidto.setProduct_id(rs.getInt("product_id"));
				pidto.setProduct_name(rs.getString("product_name"));
				pidto.setCategory(rs.getString("category"));
				pidto.setUnit_price(rs.getBigDecimal("unit_price"));
				pidto.setCurrent_stock(rs.getInt("current_stock"));
				pidto.setOrdered_number(rs.getInt("ordered_number"));
				pidto.setComment(rs.getString("comment"));
				pidto.setImg_path(rs.getString("img_path"));
				pidto.setDelete_flg(rs.getInt("delete_flg"));
				selectedList.add(pidto);
			}

			System.out.println("SelectItemDAO-取得データ数：" + selectedList.size());

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		} catch(SQLException e){
			e.printStackTrace();
		}

		return selectedList;

	}







}
