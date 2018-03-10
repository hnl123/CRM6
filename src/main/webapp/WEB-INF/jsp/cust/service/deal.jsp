<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/service/dealService1.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<%--<div class="button_bar">--%>
	<%--<button class="common_button" onclick="help('');">帮助</button>--%>
	<%--<button class="common_button" onclick="reload();">查询</button>--%>
<%--</div>--%>
<%--<table class="query_form_table">--%>
	<%--<tr>--%>
		<%--<th height="28">客户</th>--%>
		<%--<td><input /></td>--%>
		<%--<th height="28">概要</th>--%>
		<%--<td><input /></td>--%>
		<%--<th height="28">服务类型</th>--%>
		<%--<td>--%>
			<%--<select name="D1">--%>
				<%--<option>全部</option>--%>
				<%--<option>咨询</option>--%>
				<%--<option>建议</option>--%>
				<%--<option>投诉</option>--%>
			<%--</select>--%>
		<%--</td>--%>
	<%--</tr>--%>
	<%--<tr>--%>
		<%--<th height="32">创建日期</th>--%>
		<%--<td colspan="3">--%>
			<%--<input name="T2" size="10" /> - <input name="T1" size="10" /></td>--%>
		<%--<th height="32">状态</th>--%>
		<%--<td>--%>
			<%--<select name="D1">--%>
				<%--<option selected>已分配</option>--%>
			<%--</select>--%>
		<%--</td>--%>
	<%--</tr>--%>
<%--</table>--%>
<div id="tb" style="padding:2px 5px;">
	客户名字:
	<input id="svrCustName" name="svrCustName" type="text" style="width:100px"/>
	<a id="listBt"  class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>
<br />
<table class="data_list_table" id="ds">

</table>
</body>
</html>