package com.internousdev.template.dto;

import java.io.File;
import java.math.BigDecimal;

/**
 * 商品情報の追加、編集を行う際、入力データを格納するためのクラス。
 * 商品の追加、編集両方で使用。
 * 格納された値はセッションに保持し、入力画面から確認画面を経て、DBへの登録に使用する。
 * */
public class InputProductInfoDTO {

	/**
	 * 商品名
	 * */
	private String product_name;

	/**
	 * 分類
	 * */
	private String category;

	/**
	 * 単価
	 * */
	private BigDecimal unit_price;

	/**
	 * 在庫
	 * */
	private int current_stock;

	/**
	 * 商品コメント
	 * */
	private String comment;

	/**
	 * 表示画像パス<br>
	 * URL/ + 画像名で1セットになる
	 * */
	private String img_path;

	/**
	 * 表示画像ファイル
	 * */
	private File image_file;

	/**
	 * 表示画像名
	 * */
	private String image_fileFileName;

	/**
	 * 表示画像のファイル形式
	 * */
	private String image_fileContentType;


	//以下、setter/getter-----------------------


	/**
	 * 商品名取得メソッド
	 * @return product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * 商品名格納メソッド
	 * @param product_name セットする product_name
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * 分類取得メソッド
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 分類格納メソッド
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 単価取得メソッド
	 * @return unit_price
	 */
	public BigDecimal getUnit_price() {
		return unit_price;
	}

	/**
	 * 単価格納メソッド
	 * @param unit_price セットする unit_price
	 */
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}

	/**
	 * 在庫取得メソッド
	 * @return current_stock
	 */
	public int getCurrent_stock() {
		return current_stock;
	}

	/**
	 * 在庫格納メソッド
	 * @param current_stock セットする current_stock
	 */
	public void setCurrent_stock(int current_stock) {
		this.current_stock = current_stock;
	}

	/**
	 * 商品コメント取得メソッド
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 商品コメント格納メソッド
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 表示画像パス取得メソッド
	 * @return img_path
	 */
	public String getImg_path() {
		return img_path;
	}

	/**
	 * 表示画像パス格納メソッド
	 * @param img_path セットする img_path
	 */
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	/**
	 * 表示画像ファイル取得メソッド
	 * @return image_file
	 */
	public File getImage_file() {
		return image_file;
	}

	/**
	 * 表示画像ファイル格納メソッド
	 * @param image_file セットする image_file
	 */
	public void setImage_file(File image_file) {
		this.image_file = image_file;
	}

	/**
	 * 表示画像ファイル名取得メソッド
	 * @return image_fileFileName
	 */
	public String getImage_fileFileName() {
		return image_fileFileName;
	}

	/**
	 * 表示画像ファイル名格納メソッド
	 * @param image_fileFileName セットする image_fileFileName
	 */
	public void setImage_fileFileName(String image_fileFileName) {
		this.image_fileFileName = image_fileFileName;
	}

	/**
	 * 表示画像ファイル形式取得メソッド
	 * @return image_fileContentType
	 */
	public String getImage_fileContentType() {
		return image_fileContentType;
	}

	/**
	 * 表示画像ファイル形式格納メソッド
	 * @param image_fileContentType セットする image_fileContentType
	 */
	public void setImage_fileContentType(String image_fileContentType) {
		this.image_fileContentType = image_fileContentType;
	}







}
