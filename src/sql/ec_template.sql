DROP DATABASE IF EXISTS ec_template;

CREATE DATABASE IF NOT EXISTS ec_template;

USE ec_template;

-- ユーザー情報テーブルの作成・データ挿入

CREATE TABLE user_info_table(
 user_id INT NOT NULL AUTO_INCREMENT,
 user_name VARCHAR(20) NOT NULL,
 mail_address VARCHAR(50) NOT NULL,
 password VARCHAR(20) NOT NULL,
 postal_code VARCHAR(10) NOT NULL,
 street_address VARCHAR(200) NOT NULL,
 phone_number VARCHAR(20) NOT NULL,
 user_flg int(1) NOT NULL,
 PRIMARY KEY(user_id),
 UNIQUE INDEX(mail_address)
);

INSERT INTO user_info_table VALUES
(0, 'テストユーザー1', 'test1@aaa', 'aaaa1111', '111-1111', '東京都○○区××1-11', '111-0000-0000', 0),
(0, 'テストユーザー2', 'test2@bbb', 'bbbb2222', '222-2222', '東京都○○区××2-22', '222-0000-0000', 0),
(0, 'テストユーザー3', 'test3@ccc', 'cccc3333', '333-3333', '東京都○○区××3-33', '333-0000-0000', 0),
(0, '管理者1', 'admin1@aaa', 'aaaa1111', '111-1111', '東京都○○区××1-11-aa', '111-1111-0000', 1),
(0, '管理者2', 'admin2@bbb', 'bbbb2222', '222-2222', '東京都○○区××2-22-bb', '222-2222-0000', 1),
(0, '管理者3', 'admin3@ccc', 'cccc3333', '333-3333', '東京都○○区××3-33-cc', '333-3333-0000', 1);

-- -----------------------------------------------------------------------------------------------


-- 商品テーブルの作成・データ挿入

CREATE TABLE product_table(
 product_id INT NOT NULL AUTO_INCREMENT,
 product_name VARCHAR(50) NOT NULL,
 category VARCHAR(10) NOT NULL,
 unit_price DECIMAL(10,0) NOT NULL,
 current_stock INT NOT NULL,
 number_of_sales INT NOT NULL,
 comment VARCHAR(200) NOT NULL,
 img_path VARCHAR(200) NOT NULL,
 registration_date DATETIME NOT NULL,
 update_date TIMESTAMP NOT NULL,
 delete_flg INT(1) NOT NULL,
 PRIMARY KEY(product_id),
 UNIQUE INDEX(product_name)
);

INSERT INTO product_table
 (product_id, product_name,category,unit_price,current_stock,number_of_sales,comment,img_path,registration_date,update_date,delete_flg)VALUES
 (0, 'オリジナルマグカップ', 'キッチン用品', 1280, 50, 0, '当店のイメージキャラをあしらった限定マグカップ。<br>耐熱素材でレンジ加熱もOKです。', 'img/sample_1.png', NOW(), NOW(), 0),
 (0, '止まり木ボールペン', 'ステーショナリー', 980, 50, 0, '止まり木モチーフのボールペンです。5ミリサイズ。' , 'img/sample_1.png', NOW(), NOW(), 0),
 (0, '不苦労ミニだるま', 'ミニインテリア', 980, 50, 0, '幸運を呼ぶフクロウをモチーフにした小さなサイズのだるま。大きさ約5センチ。<br>玄関やリビングでそっとあなたを見守ります。', 'img/sample_1.png', NOW(), NOW(), 0);



-- -----------------------------------------------------------------------------------------------


-- カートテーブルの作成

CREATE TABLE cart(
 user_id INT NOT NULL,
 product_id INT NOT NULL,
 unit_price DECIMAL(10,0) NOT NULL,
 order_number INT NOT NULL,
 number_for_gift INT NOT NULL,
 subtotal DECIMAL(10,0) NOT NULL,
 INDEX(user_id)
);


-- -----------------------------------------------------------------------------------------------

-- 注文履歴(概要)テーブルの作成

CREATE TABLE history_outline_table(
 order_id INT NOT NULL,
 user_id INT NOT NULL,
 total_price DECIMAL(10,0) NOT NULL,
 order_date DATETIME NOT NULL,
 delivery_date DATE NOT NULL,
 delivery_time_id INT(1) NOT NULL,
 delete_flg INT(1) NOT NULL,
 PRIMARY KEY(order_id),
 INDEX(user_id)
);

-- 配達時間テーブルの作成
CREATE TABLE delivery_time_table(
 delivery_time_id INT(1) NOT NULL,
 delivery_time_string VARCHAR(10) NOT NULL,
 PRIMARY KEY(delivery_time_id)
);


-- 注文履歴(詳細)テーブルの作成

CREATE TABLE history_detail_table(
 order_id INT NOT NULL,
 product_id INT NOT NULL,
 unit_price DECIMAL(10,0) NOT NULL,
 order_number INT NOT NULL,
 number_for_gift INT NOT NULL,
 subtotal DECIMAL(10,0)
);


-- -----------------------------------------------------------------------------------------------

-- クレジットカード(架空)テーブルの作成・データ挿入

CREATE TABLE test_creditcard_table(
 card_register_id INT NOT NULL AUTO_INCREMENT,
 card_type VARCHAR(20) NOT NULL,
 card_number VARCHAR(16) NOT NULL,
 holder_name VARCHAR(50) NOT NULL,
 expiration_month INT(2) NOT NULL,
 expiration_year INT(4) NOT NULL,
 security_code INT(3) NOT NULL,
 PRIMARY KEY(card_register_id),
 UNIQUE INDEX(card_type)
);

INSERT INTO test_creditcard_table VALUES
( 0, 'TEST_A', '0000111122223333', 'testuser', 9, 2019, 123),
( 0, 'TEST_B', '0000444455556666', 'testuser', 10, 2020, 456),
( 0, 'TEST_C', '0000777788889999', 'testuser', 11, 2021, 789);

