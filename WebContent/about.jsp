<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>このサイトについて</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		table{
			margin:0 auto;
			border:collapse:collapse;
			padding:0px;
			border:0px;
		}

		tr, td, th{
			border:0px;
		}
</style>
</head>
<body>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">
<br>
<h1>うぇるかむページ</h1>
<h3>---OUTLINE---</h3>
日用雑貨・ミニインテリアの販売サイトです。<br>
「なんだかほっとする風合い」をテーマに、<br>
毎日をささやかに彩るグッズを取り揃えました。
<br>
商品には、＋100円でプレゼント包装も可能！<br>
贈り物にぜひご利用ください。
<br>
<h3>---HOW TO BUY ITEMS---</h3>
ユーザー登録を行い、ログインをしていただくことで
商品のご購入が可能です。<br>
新規ユーザー登録は<a href="GoUserCreatePageAction" style="color:green;">【こちら】</a>から
<br>
お支払い方法は代金引換・クレジット決済の2種類をご利用いただけます。

<h3>---ABOUT US---</h3>
<div style="text-align:left; width:480px; margin:0 auto; margin-left:260px;">
<b>会社名</b>：<br>
  　プログラマカレッジ（御茶ノ水研修所）<br>
<b>住所</b>：<br>
  　〒113-0034　東京都文京区湯島3-2-12 御茶ノ水天神ビル2F<br>
<b>最寄り駅</b>：<br>
  　JR中央・総武線御茶ノ水駅　徒歩7分<br>
  　東京メトロ丸の内線御茶ノ水駅　徒歩7分<br>
<b>電話番号</b>：<br>
  　000-0000-0000<br>
<b>実施カリキュラム</b>：<br>
  　アルゴリズム演習　データベース演習<br>
  　バージョン管理システム演習<br>
  　Linux/UNIX演習　サイト構築の流れ<br>
  　Java演習　Java-DB接続　Javaサーバーサイド技術<br>
  　MVCモデルとフレームワーク<br>
  　フレームワークを使ったサイト構築<br>
  　プロトタイプサイト構築　ECサイト構築実践<br>
</div>

<div style="height:50px;"></div>


<table style="border:0px;">
<tr style="border:0px;">
  <td style="border:0px;">
  <s:form action="GoItemListPageAction" theme="simple">
  <button class="actbtn">トップに戻る</button>
  </s:form>
  </td>
</tr>
</table>

<div style="height:50px;"></div>
</div>




<footer style="padding-top:10px;">
<font color="lightyellow">All Rights Reserved</font>
</footer>
</body>
</html>