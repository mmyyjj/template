package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * カート内情報の更新を行うためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 201/10/24
 * @version 1.0
 * */
public class UpdateCartDAO {

	public int updateCart(int user_id, int product_id, int order_number, int number_for_gift){

		int updated_num = 0;

		//ギフト包装指定数が注文数より多くなっていたら、注文数に合わせる
		if(number_for_gift > order_number){
			number_for_gift = order_number;
		}

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_update = "UPDATE cart SET order_number = ?, number_for_gift = ?, subtotal = (? * unit_price)"
					+ " WHERE product_id = ? AND user_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_update);

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

}
