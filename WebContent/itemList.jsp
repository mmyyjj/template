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
			margin-left:40px;
			margin-top:32px;
			float:left;
			//border:2px solid #7b8d42;
			width:180px;
			folat:left;
			height:360px;
		}

		.item_list{
			padding:20px;
			float:left;
			margin:30px;
			margin-top:5px;
			//border:2px solid #7b8d42;
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
<div style="height:8px;"></div>
<h1 style="margin-top:5px;">商品一覧</h1>


<div class="side_menu">
<div style="font-size:22px;">SEACH MENU</div>
<hr>
商品名検索
<s:form theme="simple" action="GoItemListPageAction">
<s:textfield name="selectWord"/>
<button class="actbtn" style="width:40px; height:20px;">検索</button>
</s:form>
<br>
<hr>
カテゴリー検索
<table style="margin:0 auto;">
<tr>
 <td style="border:0px">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="selectCategory" value="キッチン用品"/>
    <button class="actbtn" style="width:170px">キッチン用品</button>
  </s:form>
 </td>
</tr>
<tr>
 <td style="border:0px">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="selectCategory" value="ステーショナリー"/>
    <button class="actbtn" style="width:170px">ステーショナリー</button>
  </s:form>
 </td>
</tr>
<tr>
 <td style="border:0px">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="selectCategory" value="インテリア"/>
    <button class="actbtn" style="width:170px">インテリア</button>
</s:form>
 </td>
</tr>
</table>
</div>




<div class="item_list">
<!-- ここからiterator処理 -->
<s:iterator value="paginatedItemList">
<s:form theme="simple" action="AddCartAction">
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
       <s:hidden name="item_id" value='<s:property value="product_id"/>' />
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
<!-- ここから商品一覧下の前へ・次へボタン -->

<div style="padding:20px; margin-left:350px;">
<table>
<tr>
  <td style="width:80px; border:0px;">
   <!-- 最初へボタン -->
    <s:if test="(currentPage -1) >= 1 ">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{1}"/>
    <button class="actbtn"style="width:60px;">最初へ</button>
    </s:form>
    </s:if>
  </td>
  <td style="width:80px; border:0px;">
    <s:if test="(currentPage -1) >= 1 ">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{currentPage-1}"/>
    <button class="actbtn"style="width:60px;">戻る</button>
    </s:form>
    </s:if>
  </td>
  <td style="width:80px; border:0px;">
    <s:if test="currentPage < maxPage ">
    <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{currentPage+1}"/>
    <button class="actbtn"style="width:60px;">進む</button>
    </s:form>
    </s:if>
  </td>
  <td style="width:80px; border:0px;">
  <!-- 最後へボタン -->
<s:if test="currentPage < maxPage ">
  <s:form theme="simple" action="GoItemListPageAction">
    <s:hidden name="currentPage" value="%{maxPage}"/>
  <button class="actbtn" style="width:60px;">最後へ</button>
  </s:form>
</s:if>
  </td>
</tr>
</table>
</div>


<div style="height:50px"></div>
</div>


<footer>
<small>All Rights Reserved</small>
</footer>

</body>
</html>