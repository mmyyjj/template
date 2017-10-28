package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * 注文履歴の削除を行うためのDAOクラス。<br>
 * 厳密にはレコードそのものの削除ではなく、各レコードの削除フラグを立てる処理を行う。
 * @author YUKA MATSUMURA
 * @since 2017/10/28
 * @version 1.0
 * */
public class DeleteHistoryDAO {

	/**
	 * 注文履歴削除メソッド
	 * */
	public int deleteHistory(int order_id){

		int successed_num = 0;

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_update = "UPDATE history_outline_table SET delete_flg = 0"
					+ " WHERE order_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_update);
			ps.setInt(1, order_id);

			successed_num = ps.executeUpdate();

			if(con != null){
				con.close();
				ps.close();
			}

		} catch(SQLException e) {
				e.printStackTrace();
		}

		return successed_num;
	}

}
