<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">

</head>

<body>
<script type="text/javascript">
  history.pushState(null,null,null);
  window.addEventListener("popstate", function(){
	  history.pushState(null, null, null);
	  document.write("ブラウザバックは無効です。ページ下の戻るボタンをご利用ください");
  });
</script>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">
<div style="height:5px;"></div>
<h1>カート画面</h1>
<br>

<s:if test="cartItemList.size() >0">
<!-- カートが満杯になったときのメッセージ -->
<font color="red"><s:property value="cart_full_message"/></font>

<table class="visible_table" style="width:820px">
<tr>
  <th style="width:180px">商品名</th><th style="width:100px">単価</th><th>購入数</th><th>プレゼント包装</th><th style="width:100px">小計</th><th>操作</th>
</tr>
<!-- ここからiterator処理 -->
<s:iterator value="cartItemList">
<tr>
<td><s:property value="product_name"/></td>

<!-- ここに更新アクションの自動フォーム処理 -->

<td><s:property value="unit_price"/>円</td>
<s:form action="UpdateCartAction" theme="simple">
<s:hidden name="product_id" value="%{product_id}"/>
<td><!-- name属性指定で値を渡せるように -->
	<s:select list="{1,2,3,4,5,6,7,8,9,10}" name="order_number" value="%{order_number}" theme="simple" onChange="this.form.submit()">
	</s:select>個
</td>
<td>
	<s:select list="{0,1,2,3,4,5,6,7,8,9,10}" name="number_for_gift" value="%{number_for_gift}" theme="simple" onChange="this.form.submit()">
	</s:select>個
</td>
</s:form>


<td><s:property value="subtotal"/>円</td>
<td style="width:80px;">
<s:form action="DeleteCartItemAction" theme="simple">
<s:hidden name="product_id" value='%{product_id}'/>
<button class="actbtn" style="width:80px; margin-left:10px; margin-right:10px;">削除</button>
</s:form>
</td>
</tr>
</s:iterator>
</table>

<!-- ここまでiterator処理 -->

<br>
<div style="text-align:center; font-size:18px">商品小計 <s:property value="product_subtotal"/>円</div>
<div style="text-align:center; font-size:18px">プレゼント料金 <s:property value="gift_wrapping_fee"/>円</div>
<div style="text-align:center; font-size:18px">合計 <s:property value="total_price"/>円</div>
<br>
<br>
<hr>
</s:if>
<s:else>
  カートに商品がありません
  <div style="height:0px"></div>
</s:else>

<table style="margin:0 auto; height:120px;">
<tr>
  <s:form action="GoItemListPageAction" theme="simple">
  <td style="border:0px"><button class="actbtn">お買い物を続ける</button></td>
  </s:form>

  <s:if test="cartItemList.size()>0">
  <s:form action="GoOrderInputAction" theme="simple">
  <td style="border:0px"><button class="actbtn">ご注文へ</button></td>
  </s:form>
  </s:if>
  <s:else>
  <td style="border:0px"><button class="actbtn" style="background-color:#dddddd; color:#999999">ご注文へ</button></td>
  </s:else>

</tr>
</table>

<div style="height:200px"></div>
</div>


<footer style="padding-top:10px;">
<font color="lightyellow">All Rights Reserved</font>
</footer>
</body>
</html>