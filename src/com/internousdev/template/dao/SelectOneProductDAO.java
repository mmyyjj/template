package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.ProductInfoDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 商品一つ分のデータを取得するためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class SelectOneProductDAO {

	public ProductInfoDTO selectOneProduct(int product_id){

		ProductInfoDTO pidto = null;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT * FROM product_table WHERE product_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_select);

			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				pidto = new ProductInfoDTO();
				pidto.setProduct_id(rs.getInt("product_id"));
				pidto.setProduct_name(rs.getString("product_name"));
				pidto.setCategory(rs.getString("category"));
				pidto.setUnit_price(rs.getBigDecimal("unit_price"));
				pidto.setCurrent_stock(rs.getInt("current_stock"));
				pidto.setComment(rs.getString("comment"));
				pidto.setImg_path(rs.getString("img_path"));
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}



		}catch(SQLException e) {
			e.printStackTrace();

		}

		return pidto;


	}

}
