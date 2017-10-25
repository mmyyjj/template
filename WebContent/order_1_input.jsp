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
<s:form name="form" action="CheckPaymentInfoAction" theme="simple">

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
	<th style="width:80px">時間帯</th>
	<td>
	<s:select name="%{delivery_time_id}" list='{"朝～昼","昼～夕方","夕方～夜"}' value="{%{1},%{2},%{3}}"/>
	</td>
	</tr>
	</table>


	<br>

	<h3>------------------【2/2】お支払い情報の入力-------------------</h3>

	<small>お支払い方法を選んでください。</small><br>

	<table style="margin:0 auto; text-align:left;">
	<tr>
	<td style="border:0px">
	<label>
	<input type="radio" name="%{payment_method_id}" value="%{CASH_ON_DELIVERY}" onClick="changeDisabled()"  checked/>
	  代金引換
	  </label>
	  (※手数料<font color="red" >250円</font>がかかります)
	</td>
	</tr>
	<tr>
	<td style="border:0px">
	<label>
	<input type="radio" name="%{payment_method_id}" value="%{2}" onClick="changeDisabled()"/>
	  クレジットカード決済
	</label>
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
	 <td colspan="2"><s:select name="card_type" list='{"TEST_A","TEST_B","TEST_C"}'/></td>
	</tr>
	<tr>
	 <th>カード番号(16桁)</th>
	 <td colspan="2">
	   <input type="text" name="card_number_1" style="width:40px;" pattern="[0-9]{4}" required/>-
	   <input type="text" name="card_number_2" style="width:40px;" pattern="[0-9]{4}" required/>-
	   <input type="text" name="card_number_3" style="width:40px;" pattern="[0-9]{4}" required/>-
	   <input type="text" name="card_number_4" style="width:40px;" pattern="[0-9]{4}" required/>
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
	    <s:select name="expiration_year" list="yearList" theme="simple"/>
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
	   <input type="text" name="security_code" pattern="[0-9]{3}" required/>
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


<script>
function changeDisabled(){
 if(document.form["%{payment_method_id}"][1].checked){

	document.form["card_type"].disabled = false;
	document.form["card_number_1"].disabled = false;
	document.form["card_number_2"].disabled = false;
	document.form["card_number_3"].disabled = false;
	document.form["card_number_4"].disabled = false;
	document.form["holder_name"].disabled = false;
	document.form["expiration_year"].disabled = false;
	document.form["expiration_month"].disabled = false;
	document.form["security_code"].disabled = false;

  } else {

	document.form["card_type"].disabled = true;
	document.form["card_number_1"].disabled = true;
	document.form["card_number_2"].disabled = true;
	document.form["card_number_3"].disabled = true;
	document.form["card_number_4"].disabled = true;
	document.form["holder_name"].disabled = true;
	document.form["expiration_year"].disabled = true;
	document.form["expiration_month"].disabled = true;
	document.form["security_code"].disabled = true;

  }

}

window.onload = changeDisabled;

</script>



<div style="height:80px">
</div>
</div>


<footer style="margin-bottom:0%;">
</footer>
</body>
</html>