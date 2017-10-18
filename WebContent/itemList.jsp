<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品リスト画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">

		/*以下、アイテムリスト画面のみで使用*/
		.side_menu{
			margin:32px;
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
			width:480px;
			height:580px;
			text-align:left;
		}

		.clear{
			clear:both;
		}

		.item_table{
			width:430px;
			margin-left:5%;
			margin-right:5%;
			border:collapse:collapse;
			padding:0px;
			border:0px;
		}

		tr, td, th{
			border:0px;
		}
	</style>

</head>
<body>
<header>
<table style="margin:0 auto; width:640px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">TOP</th><th style="width:50px"></th><th>ABOUT</th><th>MY PAGE</th><th>CART</th><th>LOGOUT</th>
</tr>
</table>
</header>


<div class="contents">
<div class="side_menu"></div>
<div class="item_list">
<form>
   <table class="item_table">
     <tr>
       <th colspan="3" style="font-size:16px">オリジナルマグカップ</th>
     </tr>
     <tr>
       <td style="width:100px; height:100px"><img src="img/sample_1.png"></td>
       <td colspan="2" style="padding-left:10px;padding-top:10px; vertical-align:top;">
       <b>価格：1,280円(税込み)</b>
       <br>
       当店のイメージキャラをあしらったマグカップ。<br>
       耐熱素材でレンジ加熱もOKです。
       </td>
     </tr>
     <tr>
     	<td></td>
       <td style="width:240px;text-align:right; padding-right:10px;">
         購入数:
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
         </select>個
       </td>
       <td>
         <button class="actbtn">カートに入れる</button>
        </td>
     </tr>
   </table>
</form>
   <br>
   <hr>

</div>
<div class="clear"></div>
</div>










<footer style="margin-top:0px;">
<small>All Rights Reserved</small>
</footer>

</body>
</html>