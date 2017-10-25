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
					+ "card_type = ?,"//1
					+ "card_number = ?,"//2
					+ "holder_name= ?,"//3
					+ "expiration_month = ?,"//4
					+ "expiration_year = ?,"//5
					+ "security_code = ?";//6

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, card_type);
			ps.setString(2, card_number);
			ps.setString(3, holder_name);
			ps.setString(4, expiration_month);
			ps.setString(5, expiration_year);
			ps.setString(6, security_code);

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
