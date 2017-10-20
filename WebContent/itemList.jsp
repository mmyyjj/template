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
			height:100%;
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
<s:iterator value="paginatedItemList">
<s:form theme="simple" action="GoEntranceAction">
   <table class="item_table">
     <tr>
       <th colspan="3" style="font-size:16px; border:0px;"><s:property value="product_name"/></th>
     </tr>
     <tr>
       <td style="width:100px; height:100px; border:0px;"><img src="img/sample_1.png"></td>
       <td colspan="2" style="padding-left:10px;padding-top:10px; vertical-align:top; border:0px;">
       <b><s:property value="unit_price"/></b>
       <br>
         <s:property value="comment"/>
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
</s:iterator>
<!-- ここまでiterator処理 -->

</div>
<div class="clear"></div>

<div style="padding:20px; margin-left:360px;">
<!-- 前へボタン -->
<s:if test="(currentPage -1) >= 1 ">
  <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{currentPage-1}"/>
  <button class="actbtn">前へ</button>
  </s:form>
</s:if>
<s:else>

</s:else>

<!-- 次へボタン -->
<s:if test="currentPage < maxPage ">
  <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{currentPage+1}"/>
  <button class="actbtn">次へ</button>
  </s:form>
</s:if>
<s:else>
</s:else>
</div>




<div style="height:50px"></div>
</div>









<footer>
<small>All Rights Reserved</small>
</footer>

</body>
</html>