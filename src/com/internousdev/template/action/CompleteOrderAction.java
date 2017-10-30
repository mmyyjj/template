package com.internousdev.template.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.InsertNewHistoryDAO;
import com.internousdev.template.dto.CartItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注文の完了操作を行うためのアクションクラス。
 * @author YUKA MATSUMURA
 * @since 2014/10/26
 * @version 1.0
 * */
public class CompleteOrderAction extends ActionSupport implements SessionAware {

	/**
	 * セッション
	 * */
	private Map<String, Object> session = new HashMap<String, Object>();

	/**
	 * トランザクション成功の状態を表す定数
	 * */
	static final String TRANSACTION_COMPLETED = "transaction_completed";


	@SuppressWarnings("unchecked")
	public String execute(){
		String result = ERROR;


		/*完了画面で画面更新されたとき用。
		 * 一つ前のCmpleteOrderActionでSUCCESSが出たとき、一緒にセッションのカート情報をカラにしています。
		 * 同じくカラの状態でアクションが動いたら、画面更新がされたものとして別のページに飛ぶようにします。*/
		if(session.get("cartItemList") == null){
			result = "reloaded";
			System.out.println("coAction-result:" + result);
			return result;
		}

		/*ここから実際の処理*/

		/*メソッドの引数に使用する変数をセッションから呼び戻す
		 * セッションから取り出してキャストしながら引数に渡すこともできそうですが、
		 * 自分で書いててわからなくなるので一旦移し替える手法を取りました。*/
		int user_id = (int)session.get("user_id");
		BigDecimal total_price = (BigDecimal)session.get("total_price");
		int payment_method_id = (int)session.get("payment_method_id");
		BigDecimal delivery_fee = (BigDecimal)session.get("delivery_fee");
		String delivery_date = (String)session.get("delivery_date");
		int delivery_time_id = (int)session.get("delivery_time_id");
		ArrayList<CartItemDTO>cartItemList = (ArrayList<CartItemDTO>)session.get("cartItemList");

		/*購入履歴に新しくデータを登録するためのDAOと、そのメソッド*/
		InsertNewHistoryDAO inhdao = new InsertNewHistoryDAO();
		String transaction = inhdao.insertHistory(user_id, total_price, payment_method_id,delivery_fee,
				delivery_date, delivery_time_id, cartItemList);

		if(transaction == TRANSACTION_COMPLETED){
			/*画面更新対策。セッションのカートリストの中身を別のものに変えておきます*/
			session.put("cartItemList", null);
			result = SUCCESS;
		}else if(transaction == "detail_completed" || transaction == "stock_out"){
			result = "nostock";
		}

		System.out.println("coAction-result:" + result);
		return result;
	}




	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}




	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
