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

		header{
			margin:0%;
			width:100%;
			height:50px;
			font-size:16px;
			line-height:50px;
			background-color:#7b8d42;
			color:#fff3b8;
		}

		footer{
			width:100%;
			height:80px;
			background-color:#7b8d42;
			clear:both;
		}

		.contents{
			text-align:center;
			paddng:10px;
			margin:0 auto;
			width:1000px;
			height:100%;
			background-color:lightyellow;
		}

		.side_menu{
			margin:30px;
			float:left;
			border:2px solid #7b8d42;
			width:180px;
			folat:left;
			height:360px;
		}

		.item_list{
			padding:20px;
			float:left;
			margin:30px;
			border:2px solid #7b8d42;
			width:580px;
			height:580px;
			text-align:left;
		}

		.clear{
			clear:both;
		}


	</style>

</head>
<body>
<header>
about Mypage Cart Logout
</header>


<div class="contents">
<div class="side_menu"></div>
<div class="item_list">
商品名
<br>
   この辺に商品詳細<br>
   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
   bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb<br>
   ccccccccccccccccccccccccccccccc
 <select>
 	<option value="1">1</option>
 	<option value="2">2</option>
 	<option value="3">3</option>
 	<option value="4">4</option>
 	<option value="5">5</option>
 </select>
 <br>
 <button class="actbtn">カートにいれる</button>

</div>
<div class="clear"></div>
</div>










<footer style="margin-top:50px;">
<small>All Rights Reserved</small>
</footer>

</body>
</html>