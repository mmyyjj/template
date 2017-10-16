<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品リスト画面</title>

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

		h1 {
			text-align:center;
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
			margin:0 auto;
			width:840px;
			height:100%;
			background-color:lightyellow;
		}

		/*以下、アイテムリスト画面固有*/
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

		table{
			width:430px;
			margin-left:5%;
			margin-right:5%;
			cellpadding:0px;
			/*border:1px dashed #7b8d42;*/
		}

		td{
			//border:1px dashed #7b8d42;

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
<form>
   <table>
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
   <hr style="border:1px dashed #7b8d42">

</div>
<div class="clear"></div>
</div>










<footer style="margin-top:50px;">
<small>All Rights Reserved</small>
</footer>

</body>
</html>