package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * DB内の商品情報を更新するためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class UpdateProductInfoDAO {

	public int updateProduct(int edit_product_id, String edit_product_name, String edit_category, BigDecimal edit_unit_price,
			int edit_current_stock, String edit_comment, String edit_img_path){

		int successed_num = 0;

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_update = "UPDATE product_table SET"
					+ " product_name = ?,"
					+ " category = ?,"
					+ " unit_price = ?,"
					+ " current_stock = ( current_stock + ?),"
					+ " comment = ?,"
					+ " img_path = ?"
					+ " WHERE product_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_update);

			ps.setString(1, edit_product_name);
			ps.setString(2, edit_category);
			ps.setBigDecimal(3, edit_unit_price);
			ps.setInt(4, edit_current_stock);
			ps.setString(5, edit_comment);
			ps.setString(6, edit_img_path);
			ps.setInt(7, edit_product_id);

			successed_num = ps.executeUpdate();

			if(con != null){
				con.close();
				ps.close();
			}


		}catch(SQLException e){
			e.printStackTrace();
		}


		return successed_num;


	}

}
