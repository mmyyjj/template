package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

/**
 * DBに画像パスを登録するためのDAO
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class InsertImagePathDAO {

	public int InsertImagePath(String uploadFileFileName){

		int successed_num = 0;


		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_insert = "INSERT INTO image_table (image_path) VALUES(?)";

			PreparedStatement ps = con.prepareStatement(sql_insert);

			ps.setString(1, uploadFileFileName);

			successed_num = ps.executeUpdate();

			if(con != null){
				con.close();
				ps.close();
			}

		}catch(MySQLIntegrityConstraintViolationException e){
			successed_num = 0;
		} catch(SQLException e){
			e.printStackTrace();
		}

		return successed_num;




	}


}
