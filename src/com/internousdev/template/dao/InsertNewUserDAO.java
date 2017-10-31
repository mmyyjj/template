package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * 新規ユーザー情報をDBに登録するためのDAOクラス。
 * @author YUKA MATSUMURA
 * @since 2017/10/31
 * @version 1.0
 * */
public class InsertNewUserDAO {

	public int insertNewUser(String new_user_name, String new_mail_address, String new_password, String new_postal_code,
			String new_street_address, String new_phone_number){

		int successed_num = 0;

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_insert = "INSERT INTO user_info_table"
					+ "(user_name, mail_address, password, postal_code, street_address, phone_number)"
					+ "VALUES"
					+ " (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql_insert);

			ps.setString(1, new_user_name);
			ps.setString(2, new_mail_address);
			ps.setString(3, new_password);
			ps.setString(4, new_postal_code);
			ps.setString(5, new_street_address);
			ps.setString(6, new_phone_number);

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
