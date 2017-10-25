package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.util.DBConnector;

/**
 * 現在の年月日から、商品の配達希望日・カード有効期限(年)のリストを作成するためのDAO。
 * @author YUKA MATSUMURA
 * @since 2017/10/24
 * @version 1.0
 * */
public class TimeSetDAO {


	/**
	 * 配達希望日のリストを作成するメソッド。<br>
	 * DBから今日の日付＋1週間後の日にちと、そこからさらに１０日文の日付を取得する。
	 * */
	public ArrayList<String> createTimeList(){

		ArrayList<String> timeList = new ArrayList<String>();

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select ="SELECT DATE_ADD(CURDATE(), INTERVAL ? DAY) FROM DUAL";

			PreparedStatement ps = con.prepareStatement(sql_select);

			for(int i = 0; i <= 10; i++){
				ps.setInt( 1, (i + 7) );
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					timeList.add(rs.getString(1));
					System.out.println("TimeSetDAO-date:"+ timeList.get(i));
				}
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}

		return timeList;

	}


	/**
	 * カード有効期限(年)のリストを作成するメソッド。<br>
	 * DBから今日の日付を取得し、「今年」～「今年＋4年」までの年をリストにして返す。
	 * */
	public ArrayList<String> createYearList(){

		ArrayList<String> yearList = new ArrayList<String>();

		try{

			DBConnector dbc = new DBConnector();
			Connection con = dbc.getConnection();

			String sql_select ="SELECT DATE_ADD(CURDATE(), INTERVAL ? YEAR) FROM DUAL";

			PreparedStatement ps = con.prepareStatement(sql_select);

			for(int i = 1; i <= 4; i++){
				ps.setInt( 1, (i) );
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					yearList.add( (rs.getString(1)).substring(0,4) );
					System.out.println("TimeSetDAO-year:"+ yearList.get(i -1));
				}
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}

		return yearList;

	}

}
