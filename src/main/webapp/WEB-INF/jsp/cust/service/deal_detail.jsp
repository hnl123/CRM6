<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/service/editService1.js"></script>
</head>
<body>
<div class="page_title">客户服务管理 &gt; 服务处理</div>

<table class="query_form_table" id="dg">
	<tr>
		<th>编号</th>
		<td>${s.svrId}</td>
		<th>服务类型</th>
		<td>
			${s.svrType}</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3">${s.svrTitle}</td>
	</tr>
	<tr>
		<th>客户</th>
		<td>${s.svrCustName}</td>
		<th>状态</th>
		<td>${s.svrStatus}</td>
	</tr>
	<tr>
		<th>服务请求</th>
		<td colspan="3">${s.svrRequest}<br>
			　</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>${s.svrCreateBy}</td>
		<th>创建时间</th>
		<td><fmt:formatDate value="${s.svrCreateDate}" type="Date" pattern="yyyy-MM-dd"/></td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>
			${s.svrDueTo}</td>
		<th>分配时间</th>
		<td><fmt:formatDate value="${s.svrDueDate}" type="Date" pattern="yyyy-MM-dd"/></td>
	</tr>
</table>
<br />
<form id="fg" method="post">
<table class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea rows="6" cols="50" name="svrDeal"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><input name="svrDealBy" value="刘颖" readonly size="20" />
			<input type="hidden" value="${s.svrId}" name="svrId"/>

			<span class="red_star">*</span></td>
		<th>处理时间</th>
		<td><input id="t3" name="svrDealDate" disabled readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input name="svrResult" size="20" /><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
			<select name="svrSatisfy">
				<option>请选择...</option>
				<option value="5">☆☆☆☆☆</option>
				<option value="4">☆☆☆☆</option>
				<option value="3">☆☆☆</option>
				<option value="2">☆☆</option>
				<option value="1">☆</option>
			</select><span class="red_star">*</span></td>
	</tr>
</table>
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button class="common_button" id="submit">保存</button>
	</div>
</form>
<script>
    setCurTime('t3');
</script>
</body>
</html>