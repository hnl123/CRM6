<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/bacd/listProduct.js"></script>
</head>
<body>

<div class="page_title">产品查询</div>
<div class="button_bar">
	<button class="easyui-linkbutton" iconCls="icon-help" onclick="help('');">帮助</button>
	<button class="easyui-linkbutton" iconCls="icon-search" id="listBt">查询</button>
</div>
<table class="query_form_table">
	<tr>
		<th>名称</th>
		<td><input id="prodName"/></td>
		<th>型号</th>
		<td><input id="prodType"/></td>
		<th>批次</th>
		<td><input id="prodBatch"/></td>
	</tr>
</table>
<br />
<table class="data_list_table" id="dp">

</table>
</body>
</html>