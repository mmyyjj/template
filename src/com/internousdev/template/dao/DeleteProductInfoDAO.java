package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * DB内の商品情報を削除するためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class DeleteProductInfoDAO {

	public int updateProduct(int delete_product_id){

		int successed_num = 0;

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_delete = "DELETE FROM product_table WHERE product_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_delete);

			ps.setInt(7, delete_product_id);

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
