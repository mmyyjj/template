package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * DBのユーザー情報を更新し、ログアウトを行うためのDAOクラス。
 * */
public class LogoutDAO {


	/**
	 * ログアウト処理メソッド
	 * */
	public int logout(int user_id){


		int logout_num = 0;

		try{
			/*DBとの接続*/
			/*接続準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			/*sql文を準備*/
			String sql_logout = "UPDATE user_info_table SET login_flg = 1 WHERE user_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_logout);
			ps.setInt(1, user_id);

			logout_num = ps.executeUpdate();


		} catch(SQLException e){
			e.printStackTrace();
		}

		return logout_num;


	}

}
