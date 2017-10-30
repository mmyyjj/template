package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.LoginInfoDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	public LoginInfoDTO login(String mail_address, String password){

		/*空のdtoを準備*/
		LoginInfoDTO lidto = new LoginInfoDTO();

		try{

			/*接続準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			/*sql文を準備*/
			String sql = "SELECT * FROM user_info_table WHERE mail_address = ? AND password = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, mail_address);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){

				if(rs.getInt("login_flg") == 0){
					/*ログインフラグが0＝まだログインされていない状態のとき。
					 * フラグが1＝すでにログインされている状態のときは、ここが飛ばされからのlidtoが返されます*/

					/* セレクト文で合致したユーザーIDのログインフラグを1＝ログイン中に変更する処理*/
					String sql_login = "UPDATE user_info_table SET login_flg = 1 WHERE user_id = ?";
					ps = con.prepareStatement(sql_login);
					ps.setInt(1, rs.getInt("user_id"));
					ps.executeUpdate();

					/*DTOにデータを入れる処理*/
					lidto.setUser_id(rs.getInt("user_id"));
					lidto.setUser_name(rs.getString("user_name"));
					lidto.setMail_address(rs.getString("mail_address"));
					lidto.setPassword(rs.getString("password"));
					lidto.setPostal_code(rs.getString("postal_code"));
					lidto.setStreet_address(rs.getString("street_address"));
					lidto.setPhone_number(rs.getString("phone_number"));
					lidto.setUser_flg(rs.getInt("user_flg"));
					lidto.setLogin_flg(rs.getInt("login_flg"));

				} else {
					lidto = null;
				}

			} else {
				lidto = null;
			}


			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		} catch(SQLException e){
			e.printStackTrace();
		}

		return lidto;

	}

}
