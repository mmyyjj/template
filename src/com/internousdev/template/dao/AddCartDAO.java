package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

			/*sql文を準備*/
			String sql = "INSERT INTO cart (user_id, product_id, unit_price, order_number,subtotal) VALUES"
					+ "( ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

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

}