package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * カート内に登録された商品を削除するためのDAO。<br>
 * ユーザー画面で使用。
 * */
public class DeleteCartItemDAO {


	public int deleteCartItem(int user_id, int product_id){

		int deleted_num = 0;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_delete = "DLETE FROM cart WHERE user_id = ? AND product_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_delete);

			ps.setInt(1, user_id);
			ps.setInt(2, product_id);

			deleted_num = ps.executeUpdate();


		} catch(SQLException e) {
			e.printStackTrace();
		}

		return deleted_num;


	}
}
