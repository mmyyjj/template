package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.UserInfoDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 顧客情報のリストを取得するためのDAOクラス
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class SelectCustomerListDAO {



	/**顧客情報の検索を行うメソッド
	 *
	 * */
	public ArrayList<UserInfoDTO> selectCustomerList(){

		ArrayList<UserInfoDTO> allCustomerList = new ArrayList<UserInfoDTO>();

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT * FROM user_info_table WHERE user_flg = 0";
			PreparedStatement ps = con.prepareStatement(sql_select);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO uidto = new UserInfoDTO();
				uidto.setUser_id(rs.getInt("user_id"));
				uidto.setUser_name(rs.getString("user_name"));
				uidto.setMail_address(rs.getString("mail_address"));
				uidto.setPostal_code(rs.getString("postal_code"));
				uidto.setStreet_address(rs.getString("street_address"));
				uidto.setPhone_number(rs.getString("phone_number"));
				allCustomerList.add(uidto);
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		} catch(SQLException e){
			e.printStackTrace();
		}

		return allCustomerList;




	}



}
