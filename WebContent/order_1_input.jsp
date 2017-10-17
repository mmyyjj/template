<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ご注文情報入力画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents" style="height:100％; padding-top:5px;">
<div style="text-align:right; margin-right:20px;"><b>ご注文情報入力</b>_ご注文情報確認_お手続き完了</div>

<br>
<h1>ご注文情報の入力</h1>
<h3>--------【1/2】お届け日の指定---------</h3>
<small>お届けはご注文日の3日後からご指定が可能です。<br>
お日にち、時間帯を以下のフォームからお選びください</small>
<br>
<table class="visible_table" style="width:540px">
<tr>
<th style="width:80px">お日にち</th>
<td>
  <select>
	<option value="2017/10/16">2017/10/16</option>
  </select>
</td>
<th style="width:80px">時間帯</th>
<td>
<input type="radio" checked/>朝～お昼
<input type="radio" />お昼～夕方
<input type="radio" />夕方～夜
</td>
</tr>
</table>

<br>

<h3>---------【2/2】お支払い情報の入力----------</h3>


<form action="payment_input.jsp">
お支払い方法を選んでください。<br>

<table style="margin:0 auto;:">
<tr>
<td style="border:0px">
<input type="radio" checked/>代金引換　　
<input type="radio"/>クレジットカード決済
</td>
</tr>
</table>





<small>
クレジットカード情報
</small>
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
<hr>

<br>
<!-- 操作ボタンの部分 -->
<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">確認</button></td>
</tr>
<tr>
  <td style="border:0px"><button class="actbtn">お買い物に戻る</button></td>
</tr>
</table>
</form>
<div style="height:80px">
</div>
</div>


<footer style="margin-bottom:0%;">
</footer>
</body>
</html>