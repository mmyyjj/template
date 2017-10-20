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
			margin-top:20px;
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
			margin-top:20px;
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
	</style>

</head>
<body>
<header>
 <s:include value="header.jsp"/>
</header>


<div class="contents">
<div style="height:5px;"></div>
<h1 style="margin-top:15px;">商品一覧</h1>
<div class="side_menu"></div>
<div class="item_list">

<!-- ここからiterator処理 -->
<s:form theme="simple">
   <table class="item_table">
     <tr>
       <th colspan="3" style="font-size:16px; border:0px;">オリジナルマグカップ</th>
     </tr>
     <tr>
       <td style="width:100px; height:100px; border:0px;"><img src="img/sample_1.png"></td>
       <td colspan="2" style="padding-left:10px;padding-top:10px; vertical-align:top; border:0px;">
       <b>価格：1,280円(税込み)</b>
       <br>
       当店のイメージキャラをあしらったマグカップ。<br>
       耐熱素材でレンジ加熱もOKです。
       </td>
     </tr>
     <tr>
     	<td style="border:0px"></td>
       <td style="width:240px;text-align:right; padding-right:10px; border:0px;">
         購入数:
         <select name="order_number">
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
       <td style="border:0px;">
         <button class="actbtn">カートに入れる</button>
        </td>
     </tr>
   </table>
</s:form>
   <hr>
<!-- ここまでiterator処理 -->

</div>
<div class="clear"></div>
<div style="height:50px"></div>
</div>










<footer>
<small>All Rights Reserved</small>
</footer>

</body>
</html>