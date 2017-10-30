package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * DBに商品を登録するためのDAO
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class InsertProductDAO {

	public int insertProduct(String new_product_name, String new_category,BigDecimal new_unit_price,
			int new_current_stock,String new_comment,String new_img_path){

		int successed_num = 0;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_insert = "INSERT INTO product_table"
					+ "(product_name, category, unit_price, current_stock, comment, img_path)"
					+ " VALUES"
					+ " (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql_insert);

			ps.setString(1, new_product_name );
			ps.setString(2, new_category);
			ps.setBigDecimal(3, new_unit_price);
			ps.setInt(4, new_current_stock);
			ps.setString(5, new_comment);
			ps.setString(6, new_img_path);

			successed_num = ps.executeUpdate();

			if(con != null){
				con.close();
				ps.close();
			}

		} catch(SQLException e){
			e.printStackTrace();
		}


		return successed_num;
	}

}
