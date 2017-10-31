<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規ユーザー登録</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		table{
			margin:0 auto;
			border:collapse:collapse;
			padding:0px;
		}
</style>

</head>
<body>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">
<br>
<h1>新規ユーザー登録</h1>
<br>
<h3>お客様の情報を入力してください</h3>

<s:property value="message"/>

<s:form action="CreateNewAccountAction">
<table style="border-collapse:collapse; height:280px; width:380px;">
<tr>
<th>
  お名前
</th>
<td>
  <input type="text" name="new_user_name" required>様
</td>
</tr>
<tr>
<th>メールアドレス</th>
<td>
  <input type="text" name="new_mail_address_1" style="width:120px;" pattern="[A-Z|a-z|0-9]{1,}" min="1" required/>@
  <input type="text" name="new_mail_address_2" style="width:120px;" pattern="[A-Z|a-z|0-9]{1,}" min="1" required/>
</td>
</tr>
<tr>
<th rowspan="2">ご住所</th>
<td>
  郵便番号：
   <input type="text" name="new_postal_code_1" style="width:40px;" pattern="[0-9]{3,}" maxlength="3" required/>-
   <input type="text" name="new_postal_code_2" style="width:60px;" pattern="[0-9]{4,}" maxlength="4" required/>
</td>
</tr>
<tr>
<td>
  <textarea cols="30" name="new_street_address" rows="5" required></textarea>
</td>
</tr>
<tr>
<th>ご連絡先電話番号</th>
<td>
  <input type="text" name="new_phone_number_1" style="width:40px;" pattern="[0-9]{1,}" min="1" maxlength="4" required/>-
  <input type="text" name="new_phone_number_2" style="width:40px;" pattern="[0-9]{1,}" min="1" maxlength="4" required/>-
  <input type="text" name="new_phone_number_3" style="width:40px;" pattern="[0-9]{1,}" min="1" maxlength="4" required/>-
</td>
</tr>
<tr>
<th>
  パスワード
</th>
<td>
  <input type="password" name="new_password" pattern="[a-z|A-Z|0-9]{8,16}" title="8字以上16字以内でご入力ください" required>
</td>
</tr>
<tr>
<th>
  パスワード（確認用）
</th>
<td>
  <input type="password" name="new_password_confirm" pattern="[a-z|A-Z|0-9]{8,16}" title="8字以上16字以内でご入力ください" required>
</td>
</tr>
</table>
<br>
<br>
<label>
<input type="checkBox" required>上記の情報で登録する
</label>
<br>
<br>

<table>
<tr>
<td style="border:0px;">
<button class="actbtn" style="width:180px;">登録</button>
</td>
</tr>
</table>

</s:form>
<div style="height:50px"></div>

<table>
<tr>
<td style="border:0px;">
<button class="actbtn" style="width:180px;">ゲストとして商品を見る</button>
</td>
</tr>
<tr>
<td style="border:0px;">
<button class="actbtn" style="width:180px;">入り口に戻る</button>
</td>
</tr>
</table>
<div style="height:80px;"></div>
</div>



<footer>
</footer>
</body>
</html>