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
 login_flg int(1) NOT NULL,
 PRIMARY KEY(user_id),
 UNIQUE INDEX(mail_address)
);

INSERT INTO user_info_table VALUES
(0, 'テストユーザー1', 'test1@aaa', 'aaaa1111', '111-1111', '東京都○○区××1-11', '111-0000-0000', 0, 0),
(0, 'テストユーザー2', 'test2@bbb', 'bbbb2222', '222-2222', '東京都○○区××2-22', '222-0000-0000', 0, 0),
(0, 'テストユーザー3', 'test3@ccc', 'cccc3333', '333-3333', '東京都○○区××3-33', '333-0000-0000', 0, 0),
(0, '管理者1', 'admin1@aaa', 'aaaa1111', '111-1111', '東京都○○区××1-11-aa', '111-1111-0000', 1, 0),
(0, '管理者2', 'admin2@bbb', 'bbbb2222', '222-2222', '東京都○○区××2-22-bb', '222-2222-0000', 1, 0),
(0, '管理者3', 'admin3@ccc', 'cccc3333', '333-3333', '東京都○○区××3-33-cc', '333-3333-0000', 1, 0);

-- -----------------------------------------------------------------------------------------------


-- 商品テーブルの作成・データ挿入

CREATE TABLE product_table(
 product_id INT NOT NULL AUTO_INCREMENT,
 product_name VARCHAR(50) NOT NULL,
 category VARCHAR(10) NOT NULL,
 unit_price DECIMAL(10,0) NOT NULL,
 current_stock INT NOT NULL,
 orderd_number INT DEFAULT 0 NOT NULL,
 comment VARCHAR(200) NOT NULL,
 img_path VARCHAR(200) NOT NULL,
 registration_date DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
 update_date TIMESTAMP NOT NULL,
 delete_flg INT(1) DEFAULT 0 NOT NULL,
 PRIMARY KEY(product_id),
 UNIQUE INDEX(product_name)
);

INSERT INTO product_table
 (product_name,category,unit_price,current_stock,comment,img_path)VALUES
 ('オリジナルマグカップ', 'キッチン用品', 1280, 50,'当店のイメージキャラをあしらった限定マグカップ。耐熱素材でレンジ加熱もOKです。', 'img/sample_1.png'),
 ('止まり木ボールペン', 'ステーショナリー', 380, 50, '止まり木モチーフのボールペンです。5ミリサイズ。' , 'img/sample_1.png'),
 ('不苦労ミニだるま', 'インテリア', 980, 50, '幸運を呼ぶフクロウをモチーフにした小さなサイズのだるま。玄関やリビングでそっとあなたを見守ります。', 'img/sample_1.png'),
 ('にわとりさんアラーム', 'インテリア', 1480, 50, 'コンパクトサイズの目覚まし時計。つぶらな瞳とエネルギッシュなアラーム音で寝起きを応援！', 'img/sample_1.png'),
 ('かもめハンガー', 'インテリア',480, 50, '羽を広げたかもめの形のハンガーです。2本セット。', 'img/sample_1.png'),
 ('小鳥達のマドラーセット', 'キッチン用品', 1580, 50, 'メジロ、スズメ、ゴジュウカラの3羽をモチーフにしたマドラー3本セット。', 'img/sample_1.png'),
 ('オリジナルブックカバー', 'ステーショナリー', 580, 50, '文庫本サイズのブックカバーです。しおり紐の青い鳥がワンポイント。', 'img/sample_1.png'),
 ('ペンギン携帯クリーナー', 'ステーショナリー', 380, 50, 'ペンギン型の携帯クリーナー。腹すべりで画面をお掃除。', 'img/sample_1.png'),
 ('すわん', 'キッチン用品', 780, 50, '毎日の食卓をよりエレガントに！白鳥柄のお椀が登場です。', 'img/sample_1.png'),
 ('すやすや鳥の巣オルゴール', 'インテリア', 2980, 50, '巣の中で眠るつばめの親子をモチーフにしたオルゴールです。優しい音色で就寝時のお供にも。', 'img/sample_1_png'),
 ('ハシビロコウキーケース', 'ステーショナリー', 580, 50 , 'お腹の部分に鍵をしまえるハシビロコウモチーフのキーケース。鍵は6本まで収納できます', 'img/sample_1.png'),
 ('ペリカンお砂糖ケース', 'キッチン用品', 680, 50, '口がパカッと開くペリカン型の砂糖ケースです。お塩を入れてもOK！','img/sample_1.png');



-- -----------------------------------------------------------------------------------------------


-- カートテーブルの作成

CREATE TABLE cart(
 user_id INT NOT NULL,
 product_id INT NOT NULL,
 unit_price DECIMAL(10,0) NOT NULL,
 order_number INT NOT NULL,
 number_for_gift INT DEFAULT 0 NOT NULL,
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
 payment_method_id INT(1) NOT NULL,
 delivery_date DATE NOT NULL,
 delivery_time_id INT(1) NOT NULL,
 delete_flg INT(1) NOT NULL,
 PRIMARY KEY(order_id),
 INDEX(user_id)
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


-- 配達時間テーブルの作成
CREATE TABLE delivery_time_table(
 delivery_time_id INT(1) NOT NULL,
 delivery_time_string VARCHAR(10) NOT NULL,
 PRIMARY KEY(delivery_time_id)
);


-- 支払い方法テーブルの作成
CREATE TABLE payment_method_table(
 payment_method_id INT(1) NOT NULL,
 payment_method_string VARCHAR(10) NOT NULL,
 PRIMARY KEY(payment_method_id)
);


-- -----------------------------------------------------------------------------------------------

-- クレジットカード(架空)テーブルの作成・データ挿入

CREATE TABLE credit_card_table(
 card_register_id INT NOT NULL AUTO_INCREMENT,
 card_type VARCHAR(20) NOT NULL,
 card_number VARCHAR(16) NOT NULL,
 holder_name VARCHAR(50) NOT NULL,
 expiration_month VARCHAR(2) NOT NULL,
 expiration_year VARCHAR(4) NOT NULL,
 security_code VARCHAR(3) NOT NULL,
 PRIMARY KEY(card_register_id),
 UNIQUE INDEX(card_type)
);

INSERT INTO credit_card_table VALUES
( 0, 'TEST_A', '0000111122223333', 'testuser', '10', '2019', '123'),
( 0, 'TEST_B', '0000444455556666', 'testuser', '11', '2020', '456'),
( 0, 'TEST_C', '0000777788889999', 'testuser', '12', '2021', '789');

