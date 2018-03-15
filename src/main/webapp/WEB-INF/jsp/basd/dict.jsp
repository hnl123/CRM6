<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/bacd/listDict.js"></script>
</head>
<body>

<div class="page_title">数据字典管理</div>
<div class="button_bar">
	<button class="easyui-linkbutton" iconCls="icon-help" onclick="help('');">帮助</button>
	<button class="easyui-linkbutton" iconCls="icon-search" id="listBt">查询</button>
</div>
<c:import url="dict/listDict"></c:import>
<table class="query_form_table">
	<tr>
		<th>类别</th>
		<td><input id="dictType"/></td>
		<th>条目</th>
		<td><input id="dictItem"/></td>
		<th>值</th>
		<td><input id="dictValue"/></td>
	</tr>
</table>
<br />
<table class="data_list_table" id="dc" width="100%" >

</table>
</body>
</html>