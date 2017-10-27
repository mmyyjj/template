package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.HistoryOutlineDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 購入履歴を検索するためのDAOクラス。<br>
 * ユーザー側でselectUserHistoryOutlineメソッド、<br>
 * 管理側ではselectManagerHistoryOutlineメソッドを使用。
 *
 * */
public class SelectHistoryOutlineDAO {


	/**
	 * 購入履歴（概要）検索メソッド、ユーザー側
	 * */
	public ArrayList<HistoryOutlineDTO> selectUserHistoryOutline(int user_id){

		ArrayList<HistoryOutlineDTO> outlineList = new ArrayList<HistoryOutlineDTO>();

		try{
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT" +
					 " A.order_id, A.total_price, A.order_date, B.payment_method_string," +
					 " A.delivery_date, C.delivery_time_string" +
					 " FROM" +
					 " history_outline_table A, payment_method_table B, delivery_time_table C" +
					 " WHERE" +
					 " A.payment_method_id = B.payment_method_id" +
					 " AND A.delivery_time_id = C.delivery_time_id " +
					 " AND A.user_id = ?" +
					 " AND A.delete_flg = 0";

			PreparedStatement ps = con.prepareStatement(sql_select);

			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				HistoryOutlineDTO hodto = new HistoryOutlineDTO();
				hodto.setOrder_id(rs.getInt("order_id"));
				hodto.setTotal_price(rs.getBigDecimal("total_price"));
				/*秒数の後に「.0」がついてしまうので、ここで取り除いておきます*/
				hodto.setOrder_date( (rs.getString("order_date")).replace(".0", "") );
				hodto.setPayment_method_string(rs.getString("payment_method_string"));
				hodto.setDelivery_date(rs.getString("delivery_date"));
				hodto.setDelivery_time_string(rs.getString("delivery_time_string"));
				outlineList.add(hodto);
			}

			if(con != null){
				con.close();
				ps.close();
				rs.close();
			}


		} catch(SQLException e){
			e.printStackTrace();
		}

		return outlineList;



	}

}
