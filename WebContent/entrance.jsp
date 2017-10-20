<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入り口</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
</head>
<body>
<header>

</header>
<br>
<br>
<br>
生活雑貨とミニインテリアの販売サイト
<br>
<br>
<div class="entranceImg">
  <img src="img/mimizuku_logo.png" alt="みみずく商店ロゴ"/>
</div>
<br>
<table style="margin:0 auto;">
  <tr>
    <td style="padding:10px; border:0px">
      <s:form theme="simple" action="GoItemListPageAction">
        <s:hidden name="currentPage" value="1"/>
        <button class="actbtn">商品を見る</button>
      </s:form>
   </td>
   <td style="padding:10px; border:0px">
     <s:form action="GoLoginPageAction">
       <button class="actbtn">ログイン</button>
     </s:form>
   </td>
  </tr>
</table>


<footer>

</footer>
</body>
</html>