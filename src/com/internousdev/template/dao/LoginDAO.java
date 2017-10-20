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
					lidto.setUser_id(rs.getInt("user_id"));
					lidto.setUser_name(rs.getString("user_name"));
					lidto.setMail_address(rs.getString("mail_address"));
					lidto.setPassword(rs.getString("password"));
					lidto.setLogin_flg(true);
					String sql_login = "UPDATE user_info_table SET login_flg = 1 WHERE mail_address = ? AND password = ?";
					ps = con.prepareStatement(sql_login);
					ps.setString(1, mail_address);
					ps.setString(2, password);
					int updated = ps.executeUpdate();
					System.out.println("LoginDAO:updated" + updated);
				}
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
