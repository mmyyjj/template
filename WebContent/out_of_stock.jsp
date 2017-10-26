<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>在庫切れ商品のお知らせ</title>
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


<div class="contents" style="padding-top:10px;">
<br>
<br>
<br>
お手続き中に在庫切れとなった商品がございました。
<br><br>
カートをご購入可能な商品のみに更新いたしましたので、
<br><br>
大変お手数ですが内容をご確認の上、ご購入手続きをやり直してください。
<br><br>
(※金額の二重請求はございません)
<div style="height:50px;"></div>
<table>
<tr>
<td>
<button class="actbtn">確認</button>
<td>
</tr>
</table>
<div style="height:290px;"></div>
</div>

<footer style="margin-top:0px;">
</footer>
</body>
</html>