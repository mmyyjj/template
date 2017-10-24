package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.CartItemDTO;
import com.internousdev.template.util.DBConnector;

/**
 * カート画面の表示に使用するDAOクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class GoCartDAO {

	/**
	 * カート情報のリストを作成するメソッド
	 * */
	public ArrayList<CartItemDTO> createCartItemList(int user_id){

		ArrayList<CartItemDTO> cartItemList = new ArrayList<CartItemDTO>();

		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql = "SELECT cart.*, product_table.product_name FROM cart, product_table"
					+ " WHERE user_id = ? AND cart.product_id = product_table.product_id";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartItemDTO cidto = new CartItemDTO();
				cidto.setUser_id(rs.getInt("user_id"));
				cidto.setProduct_id(rs.getInt("product_id"));
				cidto.setProduct_name(rs.getString("product_name"));
				cidto.setUnit_price(rs.getBigDecimal("unit_price"));
				cidto.setOrder_number(rs.getInt("order_number"));
				cidto.setNumber_for_gift(rs.getInt("number_for_gift"));
				cidto.setSubtotal(rs.getBigDecimal("subtotal"));
				cartItemList.add(cidto);
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}catch(SQLException e){
		e.printStackTrace();
		}

		return cartItemList;

	}


	/**
	 * カート内の合計金額を返すメソッド
	 * */
	public BigDecimal returnTotalPrice(int user_id){

		BigDecimal total_price = BigDecimal.valueOf(0);

		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql = "SELECT SUM(subtotal) from cart WHERE user_id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				total_price = rs.getBigDecimal("SUM(subtotal)");
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}catch(SQLException e){
		e.printStackTrace();
		}

		return total_price;

	}

	/**
	 * プレゼント包装料金の合計を出すメソッド
	 * */
	public BigDecimal returnGiftWrappingFee(int user_id){

		BigDecimal gift_wrapping_fee = BigDecimal.valueOf(100);

		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql = "SELECT SUM(number_for_gift) from cart WHERE user_id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				int total_number = rs.getInt("SUM(number_for_gift)");
				gift_wrapping_fee = gift_wrapping_fee.multiply(BigDecimal.valueOf(total_number));
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}catch(SQLException e){
		e.printStackTrace();
		}

		return gift_wrapping_fee;

	}





}
