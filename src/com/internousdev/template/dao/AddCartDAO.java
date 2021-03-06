package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * DBのカートテーブルに商品を追加するためのクラス。<br>
 * jspからproduct_idをjspを受取り、同じidの商品を商品テーブルから検索、
 * 該当した商品をカートテーブルに追加する。<br>
 * 同じ商品が複数カートに入れられた場合は、数量を上書きする処理も。
 * @author YUKA MATSUMURA
 * @since 2017/10/23
 * @version 1.0
 * */
public class AddCartDAO {


	/**
	 * カートに追加するメソッド
	 * */
	public int addCart(int user_id, int product_id,BigDecimal unit_price, int order_number){

		int insert_num = 0;

		try{

			/*接続準備*/
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

			/*カート更新のsql文を準備*/
			String sql_insert = "INSERT INTO cart (user_id, product_id, unit_price, order_number,subtotal) VALUES"
					+ "( ?, ?, ?, ?, ?)";

			ps = con.prepareStatement(sql_insert);

			ps.setInt(1, user_id);
			ps.setInt(2, product_id);
			ps.setBigDecimal(3, unit_price);
			ps.setInt(4, order_number);
			ps.setBigDecimal(5, unit_price.multiply(BigDecimal.valueOf(order_number)));

			insert_num = ps.executeUpdate();

		} catch(SQLException e){
			e.printStackTrace();
		}

		return insert_num;

	}



	/**
	 * 行を一つにまとめるメソッド<br>
	 * 同じ商品が複数回カートに入れられたときに使用。
	 * */
	public int addItemNumber(int user_id, int product_id, int order_number){

		int updated_num = 0;

		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT product_id, order_number from cart WHERE product_id = ? AND user_id = ? ";

			PreparedStatement ps = con.prepareStatement(sql_select);
			ps.setInt(1, product_id);
			ps.setInt(2, user_id);

			ResultSet rs = ps.executeQuery();

			/*重複する商品があった場合に、以下の処理*/
			if(rs.next()){
				String sql_update = "UPDATE cart SET order_number = ?, subtotal = (? * unit_price)"
						+ " WHERE product_id = ? AND user_id = ?";

				ps = con.prepareStatement(sql_update);

				if( order_number + (rs.getInt("order_number")) > 10){
					order_number = 10;
				} else {
					order_number = order_number + rs.getInt("order_number");
				}

				ps.setInt(1, order_number);
				ps.setInt(2, order_number);
				ps.setInt(3, product_id);
				ps.setInt(4, user_id);


				updated_num = ps.executeUpdate();
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}catch(SQLException e){
		e.printStackTrace();
		}

		return updated_num;
	}

}
