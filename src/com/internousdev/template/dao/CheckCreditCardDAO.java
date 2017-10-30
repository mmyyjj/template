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



	public int checkCreditInfo (String card_type, String card_number, String holder_name,String expiration_month,
									String expiration_year, String security_code){

		int selected_num = 0;

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql = "SELECT * FROM credit_card_table WHERE"
					+ " card_type = ? AND"//1
					+ " card_number = ? AND"//2
					+ " holder_name= ? AND"//3
					+ " expiration_month = ? AND"//4
					+ " expiration_year = ? AND"//5
					+ " security_code = ?";//6

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, card_type);
			ps.setString(2, card_number);
			ps.setString(3, holder_name);
			ps.setString(4, expiration_month);
			ps.setString(5, expiration_year);
			ps.setString(6, security_code);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				selected_num = rs.getInt("card_register_id");
			}


			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}

		}  catch(SQLException e){
			e.printStackTrace();
		}

		return selected_num;

	}

}
