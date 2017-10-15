<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">

		body {
			margin:0;
			padding:0;
			background-color:#fff3b8;
			color:#5f6527;
			font-family:メイリオ;
			font-size:12px;
			text-align:center;
		}

		h1 {
			text-align:center;
			margin-top:50px;
			margin-right:0 auto;
			margin-left:0 auto;
		}

		button.actbtn {
			float:left;
			width:120px;
			height:40px;
			background-color:#7b8d42;
			color:#fff3b8;
			border-style:none;
			-moz-border-radius: 5px;
			-webkit-borderus: 5px;
			border-radius:5px;
		}

		button.actbtn:hover {
			float:left;
			width:120px;
			height:40px;
			background-color:#9fc24b;
			color:#fff3b8;
			border-style:none;
			-moz-border-radius: 5px;
			-webkit-borderadius: 5px;
			border-radius:5px;
			cursor:pointer;
		}


		/*ここ固有*/
		.entranceImg {
			margin:0 auto;
			//border:1px solid #7b8d42;
			width:360px;
			height:240px;
		}

		header{
			margin:0%;
			width:100%;
			height:50px;
			background-color:#7b8d42;
			color:#7b8d42;
			text-align:center;
		}

		footer{
			margin-top:10%;
			width:100%;
			height:80px;
			background-color:#7b8d42;
			clear:both;
		}

	</style>
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
    <td style="padding:10px;">
      <button class="actbtn" >商品を見る</button>
   </td>
   <td style="padding:10px;">
     <s:form action="HomeAction">
       <button class="actbtn">ログイン</button>
     </s:form>
   </td>
  </tr>
</table>


<footer>

</footer>
</body>
</html>