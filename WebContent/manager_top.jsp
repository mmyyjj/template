<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者画面トップ</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">

</head>

<body>
<header>
  <s:include value="header_manager.jsp"/>
</header>
<div class="contents">
<div style="height:50px;"></div>
<h1>Manager's Pape TOP</h1>

<a href="GoManagerProductListAction">■商品管理■</a><br>
<br>
<a href="GoManagerHistoryOutlineAction">■注文履歴確認■</a><br>
<br>
<a href="GoCustomerListAction">■顧客情報確認■</a><br>
<br>
<a href="LogoutAction">■ログアウト■</a><br>

</div>


<footer>
</footer>
</body>
</html>