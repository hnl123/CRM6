<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/bacd/listStorage.js"></script>
</head>
<body>

<div class="page_title">产品查询</div>
<div class="button_bar">
	<button class="easyui-linkbutton" iconCls="icon-help" onclick="help('');">帮助</button>
	<button class="easyui-linkbutton" iconCls="icon-search" id="listBt">查询</button>
</div>
<table class="query_form_table">
	<tr>
		<th>产品</th>
		<td><input id="pName"/></td>
		<th>仓库</th>
		<td><input id="stkWarehouse"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
<br />
<table class="data_list_table" id="ds">

</table>
</body>
</html>