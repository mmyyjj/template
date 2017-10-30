package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.util.DBConnector;

/**
 * DBに登録されている画像パスをリストにして取得するためのDAOくらす。
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class SelectImagePathDAO {

	public ArrayList<String> selectImagePath(){

		ArrayList<String> imagePathList = new ArrayList<String>();

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT * FROM image_table";

			PreparedStatement ps = con.prepareStatement(sql_select);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				imagePathList.add(rs.getString("image_path"));
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}


		} catch(SQLException e){
			e.printStackTrace();
		}

		return imagePathList;




	}

}
