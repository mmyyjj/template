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
<br>
<br>
<h1>ユーザー登録完了</h1>
<br>
ユーザー登録が完了いたしました。
<br>
下記のボタンよりログイン画面へお進みください。
<br>
ご登録ありがとうございます！
<div style="height:50px;"></div>
<table>
<tr>
<td style="border:0px;">
<s:form action="GoLoginPageAction">
<button class="actbtn">ログイン画面へ</button>
</s:form>
</td>
<td style="border:0px;">
<s:form action="GoEntranceAction">
<button class="actbtn">入り口に戻る</button>
</s:form>
</td>
</tr>
</table>
<div style="height:290px;"></div>
</div>

<footer style="margin-top:0px;">
</footer>
</body>
</html>