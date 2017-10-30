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
    <s:form>
    <s:hidden name="product_id" value="%{product_id}"/>
    <button class="oprbtn">編集</button>
    </s:form>
  </td>
  <td><button class="oprbtn">削除</button></td>
  </tr>
</s:iterator>
</table>
</div>

<div style="height:100px"></div>

<table>
  <tr>
    <td>
      <s:form action="UploadImageAction"  method="post" enctype="multipart/form-data">
        <input type="file" name="uploadFile" accept="image/*" required></input>
            <button class="oprbtn">画像追加</button>
      </s:form>
    </td>
  </tr>

</table>




<div style="height:100px"></div>

<table style="border:0px;">
<tr style="border:0px;">
<td style="border:0px; padding-top:5px; padding-bottom:5px;">
  <s:form action="GoProductAddPageAction">
    <button class="oprbtn_large">商品の追加</button>
  </s:form>
</td>
</tr>
<tr style="border:0px">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">トップに戻る</button></td>
</tr>
</table>
<footer>
</footer>
</body>
</html>