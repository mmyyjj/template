package com.internousdev.template.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.CartItemDTO;
import com.internousdev.template.util.DBConnector;

/**
 * DBに注文履歴を追加するためのDAOクラス。<br>
 * @author YUKA MATSUMURA
 * @since 2017/10/26
 * @version 1.0
 * */
public class InsertNewHistoryDAO {

	/**
	 * 2つの処理のうち、片方が完了した状態を表す定数
	 * */
	static final int HALF_TRANSACTION = 1;

	/**
	 * 2つの処理の両方が完了した状態を表す定数
	 * */
	static final int TRANSACTION_COMPLETED = 2;

	/**
	 * トランザクションに失敗したことを表す定数
	 * */
	static final int TRANSACTION_FAILED = 0;


	/**
	 * DBへのデータ登録メソッド<br>
	 * トランザクションを用いて2種類の注文履歴にデータの登録を行う。
	 * */
	public int insertHistory
	  (int user_id, BigDecimal total_price, int payment_method_id, String delivery_date, int delivery_time_id, ArrayList<CartItemDTO>cartItemList ){

		int successed_num = TRANSACTION_FAILED;


		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			/*自動コミットを切り、トランザクション開始。*/
			con.setAutoCommit(false);

			/*はじめに、「概要」テーブルへのデータ登録*/
			String sql_outline = "INSERT INTO history_outline_table"
					+ " (user_id, total_price, payment_method_id, delivery_date, delivery_time_id)"
					+ "VALUES"
					+ " (?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql_outline);
			ps.setInt(1, user_id);
			ps.setBigDecimal(2, total_price);
			ps.setInt(3, payment_method_id);
			ps.setString(4, delivery_date);
			ps.setInt(5, delivery_time_id);

			successed_num = ps.executeUpdate();

			/*概要テーブルの更新に成功したら、次の処理*/
			if(successed_num >= HALF_TRANSACTION){

				/*テーブルに登録後、すぐにその注文IDを取得。*/
				String sql_select = "select MAX(order_id) from history_outline_table WHERE user_id = ?";
				ps = con.prepareStatement(sql_select);
				ps.setInt(1, user_id);

				ResultSet rs = ps.executeQuery();

				/*ここから、「詳細」テーブルへのデータ登録*/
				if(rs.next()){
					int detail_order_id = rs.getInt("MAX(order_id)");
					rs.close();

					String sql_detail = "INSERT INTO history_detail_table"
							+ " (order_id, product_id,unit_price, order_number, number_for_gift,subtotal)"
							+ " VALUES"
							+ " (?,?,?,?,?,?)";

					ps = con.prepareStatement(sql_detail);

					for(int i =0; i < cartItemList.size(); i++){
						ps.setInt(1, detail_order_id);//同じオーダーID=同じタイミングに購入された商品として登録
						ps.setInt(2, cartItemList.get(i).getProduct_id());
						ps.setBigDecimal(3, cartItemList.get(i).getUnit_price());
						ps.setInt(4, cartItemList.get(i).getOrder_number());
						ps.setInt(5, cartItemList.get(i).getNumber_for_gift());
						ps.setBigDecimal(6, cartItemList.get(i).getSubtotal());
						ps.executeUpdate();
						successed_num ++;
					}

					/*概要・詳細ともに更新に成功したら、カートをきれいにして、コミット。*/
					if(successed_num == (HALF_TRANSACTION + cartItemList.size()) ){
						String sql_delete = "DELETE FROM CART WHERE user_id =?";
						ps = con.prepareStatement(sql_delete);
						ps.setInt(1, user_id);
						ps.executeUpdate();
						con.commit();
						successed_num= TRANSACTION_COMPLETED;
					}



				}


			}else{
				con.rollback();
				successed_num =  TRANSACTION_FAILED;
			}

			if(con != null){
				con.close();
				ps.close();

			}


		}catch(SQLException e) {
			e.printStackTrace();
		}

		return successed_num;



	}
}