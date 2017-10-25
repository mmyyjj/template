package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * 入力されたクレジットーカード情報をDBと照合するためのDAOクラス。ユーザー側で使用。
 * @author YUKA MATSUMURA
 * @since 2017/10/25
 * @version 1.0
 * */
public class CheckCreditCardDAO {



	public boolean sheckCreditInfo (String card_type, String card_number, String holder_name,String expiration_month,
									String expiration_year, String security_code){

		boolean result = false;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql = "SELECT * FROM credit_card_table WHERE"
					+ "card_type = ?,"
					+ "card_number = ?,"
					+ "holder_name= ?,"
					+ "expiration_month = ?,"
					+ "expiration_year = ?,"
					+ "security_code = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = true;

			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}  catch(SQLException e){
			e.printStackTrace();
		}

		return result;

	}

}
