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
public class InsertNewHistoryDAO2 {

	/**
	 * 在庫処理が完了した状態を表す定数
	 * */
	static final int STOCK_CHECKED =1;

	/**
	 * 処理中に在庫切れが発生した状態を表す定数
	 * */
	static final int STOCK_OUT = 2;

	/**
	 * 2つの処理のうち、片方が完了した状態を表す定数
	 * */
	static final int HALF_TRANSACTION = 3;

	/**
	 * 2つの処理の両方が完了した状態を表す定数
	 * */
	static final int TRANSACTION_COMPLETED = 4;

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

		int condition = TRANSACTION_FAILED;
		int successed_num = 0;



		try{

			/*接続の準備*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();
			con.setAutoCommit(false);

			/*はじめに、在庫から商品を割当てられるかの最終チェック*/
			String sql_stock = "UPDATE product_table set "
					+ "current_stock=(current_stock - ?),orderd_number = (ordered_number + ?)"
					+ " WHERE prduct_id = ?";

			PreparedStatement ps = con.prepareStatement(sql_stock);

			for(int i = 0; i < cartItemList.size();i++){
				ps.setInt(1, cartItemList.get(i).getOrder_number());
				ps.setInt(2, cartItemList.get(i).getOrder_number());
				ps.setInt(3, cartItemList.get(i).getProduct_id());
				successed_num = i + 1;//更新に成功した行数として扱う。
			}

			if(successed_num == cartItemList.size()){
				condition = STOCK_CHECKED;
			}else{
				con.rollback();
				condition = STOCK_OUT;
				return condition;
			}



			/*次に、「概要」テーブルへのデータ登録*/
			String sql_outline = "INSERT INTO history_outline_table"
					+ " (user_id, total_price, payment_method_id, delivery_date, delivery_time_id)"
					+ "VALUES"
					+ " (?, ?, ?, ?, ?)";

			ps = con.prepareStatement(sql_outline);
			ps.setInt(1, user_id);
			ps.setBigDecimal(2, total_price);
			ps.setInt(3, payment_method_id);
			ps.setString(4, delivery_date);
			ps.setInt(5, delivery_time_id);

			successed_num = ps.executeUpdate();
			if(successed_num > 0){
				condition = HALF_TRANSACTION;
			}



			/*テーブルに登録後、すぐにその注文IDを取得。*/
			String sql_select = "select MAX(order_id) from history_outline_table WHERE user_id = ?";
			ps = con.prepareStatement(sql_select);
			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();

			/*ここから、「詳細」テーブルへのデータ登録*/
			if(rs.next()){
				int detail_order_id = rs.getInt("MAX(order_id)");

				String sql_detail = "INSERT INTO history_detail_table"
						+ " (order_id, product_id,unit_price, order_number, number_for_gift,subtotal)"
						+ " VALUES"
						+ " (?,?,?,?,?,?)";

				ps = con.prepareStatement(sql_detail);

				/*カート情報を入れたリストを受取り、その中身を順番に履歴テーブルに追加。*/
				for(int i =0; i < cartItemList.size(); i++){
					ps.setInt(1, detail_order_id);//同じオーダーID=同じタイミングに購入された商品として登録
					ps.setInt(2, cartItemList.get(i).getProduct_id());
					ps.setBigDecimal(3, cartItemList.get(i).getUnit_price());
					ps.setInt(4, cartItemList.get(i).getOrder_number());
					ps.setInt(5, cartItemList.get(i).getNumber_for_gift());
					ps.setBigDecimal(6, cartItemList.get(i).getSubtotal());
					ps.executeUpdate();
					successed_num = i + 1;//登録に成功した商品の行の分として扱う
				}

				if(successed_num == cartItemList.size() ){
					String sql_delete = "DELETE FROM CART WHERE user_id =?";
					ps = con.prepareStatement(sql_delete);
					ps.setInt(1, user_id);
					ps.executeUpdate();
					con.commit();
					successed_num= TRANSACTION_COMPLETED;
				} else{
					con.rollback();
				}

			}


			if(con != null){
				con.close();
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}


		System.out.println("inhDAO-condition:" + condition);
		return condition;



	}
}