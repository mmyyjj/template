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
アカウントを作成し、ログインをしていただくことで
商品のご購入が可能です。<br>
アカウントの新規作成は【こちら】から
<br>
お支払い方法は代金引換・クレジット決済の2種類をご利用いただけます。

<table>
<tr>
<td style="border:0px;">
<s:form action="GoItemListPageAction">
<button class="actbtn">トップに戻る</button>
</s:form>
<td>
</tr>
</table>
<div style="height:50px;"></div>
</div>




<footer>
</footer>

</body>
</html>