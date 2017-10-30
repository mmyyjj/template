package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.CartItemDTO;
import com.internousdev.template.util.DBConnector;

/**
 * カート内情報の更新を行うためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 201/10/24
 * @version 1.0
 * */
public class UpdateCartDAO {

	/**
	 * カート情報のうち、注文数とプレゼント包装指定数の更新を行うメソッド
	 * */
	public int updateCart(int user_id, int product_id, int order_number, int number_for_gift){

		int updated_num = 0;



		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			/*在庫確認のsql文*/
			/*注文数が在庫より多い場合は、在庫の数に合わせて更新するようにする*/
			String sql_stock = "SELECT current_stock FROM product_table WHERE product_id = ?";
			PreparedStatement ps = con.prepareStatement(sql_stock);
			ps.setInt(1, product_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				if(order_number > rs.getInt("current_stock")){
					order_number = rs.getInt("current_stock");
				}
			}

			//ギフト包装指定数が注文数より多くなっていたら、注文数に合わせる
			if(number_for_gift > order_number){
				number_for_gift = order_number;
			}

			String sql_update = "UPDATE cart SET order_number = ?, number_for_gift = ?, subtotal = (? * unit_price)"
					+ " WHERE product_id = ? AND user_id = ?";

			ps = con.prepareStatement(sql_update);

			ps.setInt(1, order_number);
			ps.setInt(2, number_for_gift);
			ps.setInt(3, order_number);
			ps.setInt(4, product_id);
			ps.setInt(5, user_id);

			updated_num = ps.executeUpdate();

			if(con != null){
				con.close();
				ps.close();
			}

		} catch(SQLException e){
			e.printStackTrace();
		}

		return updated_num;

	}


	/**
	 * カート情報のうち、在庫切れになった商品を削除するメソッド
	 * */
	public String updateCart(int user_id, ArrayList<CartItemDTO>cartItemList){
		String condition = "update_failed";
		int updated_num = 0;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT product_id FROM product_table WHERE current_stock = 0";

			PreparedStatement ps = con.prepareStatement(sql_select);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				String sql_update = "DELETE FROM cart WHERE product_id = ? AND user_id = ?";
				ps = con.prepareStatement(sql_update);

				for(int i = 0; i < cartItemList.size(); i++){
					if(rs.getInt("product_id") == cartItemList.get(i).getProduct_id()){
						ps.setInt(1, cartItemList.get(i).getProduct_id());
						ps.setInt(2, user_id);
						updated_num = i + ps.executeUpdate();
					}
				}

			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

			if(updated_num == cartItemList.size()){
				condition = "update_successed";

			}


		} catch(SQLException e){
			e.printStackTrace();
		}

		return condition;

	}
































}
