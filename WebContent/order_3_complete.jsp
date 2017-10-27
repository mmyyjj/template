<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お支払手続完了</title>
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
</style>


</head>
<body>
<script type="text/javascript">
  history.pushState(null,null,null);
  window.addEventListener("popstate", function(){
	  history.pushState(null, null, null);
  });
</script>
<header>
	<s:include value="header.jsp"/>
</header>


<div class="contents" style="padding-top:10px;">
<div style="text-align:right; margin-right:20px;">お支払情報入力_お支払情報確認_<b>お手続き完了</b></div>
<br>
<br>
<h1>お支払手続き完了</h1>
<br>
お手続きが完了いたしました。
<br>
ご購入ありがとうございます。
<br>
<div style="height:50px;"></div>
<table>
<tr>
<td style="border:0px;">
<button class="actbtn">お買い物を続ける</button>
</td>
<td style="border:0px;">
<button class="actbtn">ログアウト</button>
</td>
</tr>
</table>
<div style="height:290px;"></div>
</div>

<footer style="margin-top:0px;">
</footer>
</body>
</html>