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
	<s:include value="header.jsp"/>
</header>

<div class="contents" style="height:100％; padding-top:5px;">
<div style="text-align:right; margin-right:20px;"><b>ご注文情報入力</b>_ご注文情報確認_お手続き完了</div>

<!-- ここからまるっとs:form処理 -->
<s:form action="payment_input.jsp" theme="simple">

<br>
<h1>ご注文情報の入力</h1>
<h3>-----------------【1/2】お届け日の指定------------------</h3>
<small>お届けはご注文日の3日後からご指定が可能です。<br>
お日にち、時間帯を以下のフォームからお選びください</small>
<br>
<table class="visible_table" style="width:400px">
<tr>
<th style="width:80px">配達希望日</th>
<td>
  <s:select name="delivery_date" list="timeList" theme="simple"/>
</td>
</tr>
<tr>
<th style="width:80px">時間帯</th>
<td>
<label><input name="delivery_time" value="%{1}" type="radio" checked/>朝～お昼</label>
<label><input name="delivery_time" value="%{2}" type="radio" />お昼～夕方</label>
<label><input name="delivery_time" value="%{3}" type="radio" />夕方～夜</label>
</td>
</tr>
</table>


<br>

<h3>------------------【2/2】お支払い情報の入力-------------------</h3>

<small>お支払い方法を選んでください。</small><br>

<table style="margin:0 auto; text-align:left;">
<tr>
<td style="border:0px">
<input type="radio" checked/>代金引換(※手数料<font color="red">250円</font>がかかります)
</td>
</tr>
<tr>
<td style="border:0px">
<input type="radio"/>クレジットカード決済
</td>
</tr>
</table>
<br>




<small>
クレジットカードをご利用の方は<br>
以下のフォームに情報を入力してください。
</small>
<table class="visible_table" style="width:400px">
<tr>
 <th style="width:160px;">クレジットカード種類</th>
 <td colspan="2"><s:select name="card_type" list='{"testA","testB","testC"}' width="50px"/></td>
</tr>
<tr>
 <th>カード番号(16桁)</th>
 <td colspan="2">
   <input type="text" name="card_number_1" style="width:40px;" pattern="[0-9]{4}" title="数字で4桁ずつ入力してください" required/>-
   <input type="text" name="card_number_2" style="width:40px;" pattern="[0-9]{4}" title="数字で4桁ずつ入力してください" required/>-
   <input type="text" name="card_number_3" style="width:40px;" pattern="[0-9]{4}" title="数字で4桁ずつ入力してください" required/>-
   <input type="text" name="card_number_4" style="width:40px;" pattern="[0-9]{4}" title="数字で4桁ずつ入力してください" required/>
 </td>
</tr>
<tr>
 <th>カード名義</th>
  <td colspan="2">
   <input type="text" name="holder_name" pattern="[a-z|A-Z| |]{1,}" required/>
  </td>
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
   <s:select name="expiration_month" list="{1,2,3,4,5,6,7,8,9,10,11,12}"/>
	月
 </td>
</tr>
<tr>
 <th>セキュリティコード</th>
 <td colspan="2">
   <input type="text" name="security_code" pattern="[0-9]" required/>
 </td>
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
</s:form>
<div style="height:80px">
</div>
</div>


<footer style="margin-bottom:0%;">
</footer>
</body>
</html>