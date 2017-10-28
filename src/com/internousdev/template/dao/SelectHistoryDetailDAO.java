package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.HistoryDetailDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 購入履歴(詳細)を検索するためのDAOクラス。<br>
 * ユーザー側・管理者側双方で同じメソッドを利用する。
 * @author YUKA MATUMURA
 * @since 2017/10/28
 * @version 1.0
 *
 * */
public class SelectHistoryDetailDAO {


	/**
	 * 	注文履歴(詳細)リスト取得メソッド
	 * */
	public ArrayList<HistoryDetailDTO> selectHistoryDetail(int order_id){

		ArrayList<HistoryDetailDTO> historyDetailList = new ArrayList<HistoryDetailDTO>();

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select = "SELECT A.*, B.product_name FROM"
					+ " history_detail_table A, product_table B"
					+ " WHERE order_id = ?"
					+ " AND A.product_id = B.product_id";

			PreparedStatement ps = con.prepareStatement(sql_select);
			ps.setInt(1, order_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				HistoryDetailDTO hddto = new HistoryDetailDTO();
				hddto.setProduct_name(rs.getString("product_name"));
				hddto.setUnit_price(rs.getBigDecimal("unit_price"));
				hddto.setOrder_number(rs.getInt("order_number"));
				hddto.setNumber_for_gift(rs.getInt("number_for_gift"));
				hddto.setSubtotal(rs.getBigDecimal("subtotal"));
				historyDetailList.add(hddto);
			}



		} catch(SQLException e) {
			e.printStackTrace();
		}

		return historyDetailList;




	}


}
