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
			background-color:#7b8d42;
			color:#fff3b8;
			border-style:none;
			-moz-border-radius: 5px;
			-webkit-borderadius: 5px;
			border-radius:5px;
			cursor:pointer;
		}

		.entranceImg {
			margin:0 auto;
		}

		header{
			margin:0%;
			width:100%;
			height:50px;
			background-color:#7b8d42;
		}

		footer{
			margin-top:30%;
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

<h1>てすと</h1>
<br>


<table style="margin:0 auto;">
  <tr>
    <td>
      <button class="actbtn" >商品を見る</button>
   </td>
   <td>
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