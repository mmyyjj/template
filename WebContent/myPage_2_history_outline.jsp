<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ご購入履歴一覧</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		table{
			margin:0 auto;
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

<div class="contents" style="padding-top:40px;">
<h1>ご購入履歴</h1>

<s:if test="u_historyOutlineList.size() > 0">
<table class="visible_table" style="width:820px; padding:0px 0px;">
<tr style="font-size:12px;">
  <th>注文番号</th>
  <th>合計金額</th>
  <th>注文日</th>
  <th>お支払い方法</th>
  <th>代引き手数料</th>
  <th>配達希望日</th>
  <th>購入商品</th>
  <th>削除</th>
</tr>

<s:iterator value='paginatedList' >
<tr>
  <td><s:property value="order_id"/></td>
  <td><s:property value="total_price"/> 円</td>
    <td><s:property value="order_date"/></td>
  <td><s:property value="payment_method_string"/></td>
  <td><s:property value="delivery_fee"/> 円</td>
  <td><s:property value="delivery_date"/>  <s:property value="delivery_time_string"/></td>

  <td style="width:80px">
    <s:form action="GoUserHistoryDetailAction" theme="simple">
    <s:hidden name="order_id" value="%{order_id}"/>
    <button class="actbtn" style="width:70px; margin-left:10px; margin-right:10px;">購入商品</button>
    </s:form>
  </td>
  <td style="width:80px">
    <s:form action="DeleteHistoryAction" theme="simple">
    <s:hidden name="order_id" value="%{order_id}"/>
    <button class="actbtn" style="width:70px; margin-left:10px; margin-right:10px;">削除</button>
    </s:form>
  </td>
</tr>
</s:iterator>
</table>
</s:if>

<s:else>
<div style="height:30px;"></div>
 現在、ご注文履歴はありません
 <div style="height:30px;"></div>
</s:else>


<table style="margin-right:0 auto; margin-left:0 auto;">
<tr>
  <td style="width:80px; border:0px;">
   <!-- 最初へボタン -->
    <s:if test="(current_page -1) >= 1 ">
      <s:form theme="simple" action="GoUserHistoryOutlineAction">
       <s:hidden name="current_page" value="%{1}"/>
       <button class="actbtn"style="width:60px;">最初へ</button>
      </s:form>
    </s:if>
    <s:else>
       <button class="actbtn"style="width:60px; background-color:#dddddd; color:#999999">最初へ</button>
    </s:else>
  </td>
  <!-- 戻るボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="(current_page -1) >= 1 ">
      <s:form theme="simple" action="GoUserHistoryOutlineAction">
      <s:hidden name="current_page" value="%{current_page-1}"/>
      <button class="actbtn"style="width:60px;">戻る</button>
    </s:form>
    </s:if>
    <s:else>
       <button class="actbtn"style="width:60px; background-color:#dddddd; color:#999999">戻る</button>
    </s:else>
  </td>
  <!-- 進むボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="current_page < max_page ">
    <s:form theme="simple" action="GoUserHistoryOutlineAction">
    <s:hidden name="current_page" value="%{current_page+1}"/>
    <button class="actbtn"style="width:60px;">進む</button>
    </s:form>
    </s:if>
    <s:else>
       <button class="actbtn"style="width:60px; background-color:#dddddd; color:#999999">進む</button>
    </s:else>
  </td>
  <!-- 最後へボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="current_page < max_page ">
    <s:form theme="simple" action="GoUserHistoryOutlineAction">
    <s:hidden name="current_page" value="%{max_page}"/>
    <button class="actbtn" style="width:60px;">最後へ</button>
    </s:form>
  </s:if>
  <s:else>
     <button class="actbtn"style="width:60px; background-color:#dddddd; color:#999999">最後へ</button>
  </s:else>
</td>
</tr>
</table>

<table style="margin:0 auto; height:120px;">
<tr>
<s:form action="GoMyPageAction" theme="simple">
  <td style="border:0px"><button class="actbtn">戻る</button></td>
</s:form>
</tr>
</table>
<div style="height:100px;"></div>
</div>



<footer>
</footer>
</body>
</html>