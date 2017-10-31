<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品管理</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>取扱商品一覧</h1>
<br>
<s:property value="message"/>
<br>
<table style="width:680px;">
<tr>
<th>商品ID</th>
<th>商品名</th>
<th>分類</th>
<th>単価</th>
<th>在庫</th>
<th>操作</th>
<th>操作</th>
</tr>

<s:iterator value="paginatedProductList">
  <tr>
  <td><s:property value="product_id"/></td>
  <td><s:property value="product_name"/></td>
  <td><s:property value="category"/></td>
  <td><s:property value="unit_price"/></td>
  <td><s:property value="current_stock"/></td>
  <td>
    <s:form action="GoProductEditPageAction">
    <s:hidden name="edit_product_id" value="%{product_id}"/>
    <button class="oprbtn">編集</button>
    </s:form>
  </td>
  <td>
    <s:form action="DeleteProductInfoAction">
      <s:hidden name="delete_product_id" value="%{product_id}"/>
      <button class="oprbtn">削除</button>
    </s:form>
  </td>
  </tr>
</s:iterator>
</table>
</div>

<div style="height:100px"></div>

<table style="border:0px; margin-right:0 auto; margin-left:0 auto;">
<tr style="border:0px;">
  <td style="width:80px; border:0px;">
   <!-- 最初へボタン -->
    <s:if test="(current_page -1) >= 1 ">
      <s:form theme="simple" action="GoManagerProductListAction">
       <s:hidden name="current_page" value="%{1}"/>
       <button class="oprbtn"style="width:60px;">最初へ</button>
      </s:form>
    </s:if>
    <s:else>
       <button class="oprbtn"style="width:60px; background-color:#dddddd; color:#999999">最初へ</button>
    </s:else>
  </td>
  <!-- 戻るボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="(current_page -1) >= 1 ">
      <s:form theme="simple" action="GoManagerProductListAction">
      <s:hidden name="current_page" value="%{current_page-1}"/>
      <button class="oprbtn"style="width:60px;">戻る</button>
    </s:form>
    </s:if>
    <s:else>
       <button class="oprbtn"style="width:60px; background-color:#dddddd; color:#999999">戻る</button>
    </s:else>
  </td>
  <!-- 進むボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="current_page < max_page ">
    <s:form theme="simple" action="GoManagerProductListAction">
    <s:hidden name="current_page" value="%{current_page+1}"/>
    <button class="oprbtn"style="width:60px;">進む</button>
    </s:form>
    </s:if>
    <s:else>
       <button class="oprbtn"style="width:60px; background-color:#dddddd; color:#999999">進む</button>
    </s:else>
  </td>
  <!-- 最後へボタン -->
  <td style="width:80px; border:0px;">
    <s:if test="current_page < max_page ">
    <s:form theme="simple" action="GoManagerProductListAction">
    <s:hidden name="current_page" value="%{max_page}"/>
    <button class="oprbtn" style="width:60px;">最後へ</button>
    </s:form>
  </s:if>
  <s:else>
     <button class="oprbtn"style="width:60px; background-color:#dddddd; color:#999999">最後へ</button>
  </s:else>
</td>
</tr>
</table>

<div style="height:100px"></div>

<!-- 商品追加ボタン -->
<table  style="border:0px;">
<tr style="border:0px;">
<td style="border:0px; padding-top:5px; padding-bottom:5px;">
  <s:form action="GoProductAddPageAction">
    <button class="oprbtn_large">商品の追加</button>
  </s:form>
</td>
</tr>
</table>

<div style="height:100px"></div>

<hr>
<!-- 商品画像の追加ボタン -->
<h3>商品画像の追加</h3>
<br>
<table style="width:480px">
  <tr>
        <s:form action="UploadImageAction"  method="post" enctype="multipart/form-data">
    <td style="text-align:left; width:360px;">
        <input type="file" name="uploadFile" accept="image/*" required></input>
    </td>
    <td>
        <button class="oprbtn">画像追加</button>
    </td>
        </s:form>
  </tr>
</table>


<div style="height:100px"></div>

<hr>
<!-- トップに戻るボタン -->
<table style="border:0px;">
<tr style="border:0px;">
<s:form action="GoManagerTopAction" theme="simple">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">トップに戻る</button></td>
</s:form>
</tr>
</table>


<footer>
</footer>
</body>
</html>