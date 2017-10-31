<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客情報</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
  <s:include value="header_manager.jsp"/>
</header>

<div class="contents">
<h1>顧客情報一覧</h1>
<table style="width:840px;">
<tr>
<th>ユーザーID</th>
<th>ユーザー名</th>
<th style="width:180px;">メールアドレス</th>
<th>郵便番号</th>
<th style="width:240px;">住所</th>
<th>連絡先</th>
</tr>
<s:iterator value="paginatedCustomerList">
<tr>
<td><s:property value="user_id"/></td>
<td><s:property value="user_name"/></td>
<td><s:property value="mail_address"/></td>
<td><s:property value="postal_code"/></td>
<td><s:property value="street_address"/></td>
<td><s:property value="phone_number"/></td>
</tr>
</s:iterator>
</table>


<div style="height:80px"></div>

<table style="border:0px; margin-right:0 auto; margin-left:0 auto;">
<tr style="border:0px;">
  <td style="width:80px; border:0px;">
   <!-- 最初へボタン -->
    <s:if test="(current_page -1) >= 1 ">
      <s:form theme="simple" action="GoUserHistoryOutlineAction">
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
      <s:form theme="simple" action="GoUserHistoryOutlineAction">
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
    <s:form theme="simple" action="GoUserHistoryOutlineAction">
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
    <s:form theme="simple" action="GoUserHistoryOutlineAction">
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

<table style="border:0px; margin:0 auto; height:120px;">
<tr style="border:0px;">
<s:form action="GoManagerTopAction" theme="simple">
  <td style="border:0px"><button class="oprbtn_large">トップに戻る</button></td>
</s:form>
</tr>
</table>
<div style="height:100px;"></div>

</div>


<footer>
</footer>
</body>
</html>