<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">

		body {
			margin:0;
			padding:0;
			background-color:#fff3b8;
			color:#5f6527;
			font-family:メイリオ;
			font-size:14px;
			text-align:center;
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

		h1 {
			text-align:center;
			margin-top:0px;
			margin-right:0 auto;
			margin-left:0 auto;
		}

		.contents{
			text-align:center;
			margin:0 auto;
			width:840px;
			height:100%;
			background-color:lightyellow;
		}

		/*ここからぺージ固有*/
		.visible_table{
			border:2px solid #7b8d42;
			height:100%;
			margin:0 auto;
			border-collapse:collapse;
			padding:0px 0px;
		}

		tr, td, th{
			border:1px solid #7b8d42;
			padding:5px 0px;
		}



</style>


<title>お支払情報入力画面</title>
</head>
<body>
<header>
</header>

<div class="contents" style="height:100％; padding-top:5px;">
<div style="text-align:right; margin-right:20px;"><b>お支払情報入力</b>_お支払情報確認_お手続き完了</div>

<br>
<h1>お支払情報の入力</h1>
<small>
現金支払い・クレジットカード決済がご利用いただけます。<br>
クレジットカードをご利用の方は、
以下のフォームに情報をご入力ください。
<br>
</small>
<form action="payment_input.jsp">
<table style="margin:0 auto; height:80px;">
<tr>
<td style="border:0px">現金でのお支払はこちら：</td>
<td style="border:0px; width:80px"><button class="actbtn" style="width:80px;"  onClick="this.form.submit()">現金支払い</button>
</tr>
</table>
<table class="visible_table" style="width:540px">
<tr>
 <th>クレジットカード種類</th>
 <td colspan="2"></td>
</tr>
<tr>
 <th>カード番号</th>
 <td colspan="2"></td>
</tr>
<tr>
 <th>カード名義</th>
  <td colspan="2"></td>
</tr>
<tr>
 <th>有効期限</th>
  <td>
   <select>
   <option value="2017">2017</option>
   <option value="2018">2018</option>
   <option value="2019">2019</option>
   <option value="2020">2020</option>
   </select>
   年
 </td>
 <td>
   <select>
     <option value="1">1</option>
     <option value="2">2</option>
     <option value="3">3</option>
     <option value="4">4</option>
     <option value="5">5</option>
     <option value="6">6</option>
     <option value="7">7</option>
     <option value="8">8</option>
     <option value="9">9</option>
     <option value="10">10</option>
     <option value="11">11</option>
     <option value="12">12</option>
   </select>
	月
 </td>
</tr>
<tr>
 <th>セキュリティコード</th>
 <td colspan="2"></td>
</tr>
</table>
<br>
<hr style="border:1px dashed">


<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">確認</button></td>
</tr>
<tr>
  <td style="border:0px"><button class="actbtn">お買い物に戻る</button></td>
</tr>
</table>
</form>

</div>


<footer style="margin-bottom:0%;">
</footer>
</body>
</html>