<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/service/dispatchService.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 > 服务分配</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" id="reload1">查询</button>
<table class="query_form_table" height="53">
	<tr>
		<th height="28">客户</th>
		<td><input name="svrCustName" id="svrCustName"/></td>
		<th height="28">服务类型</th>
		<td>
			<select name="svrType" id="svrType">
				<option value="">全部</option>
				<option value="咨询">咨询</option>
				<option value="建议">建议</option>
				<option value="投诉">投诉</option>
			</select>
		</td>
	</tr>
	<tr>
		<th height="22">创建日期</th>
		<td colspan="3">
			<input name="T1" id="T1" size="10" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="wdate"/>
			- <input name="T2" id="T2" size="10" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="wdate" /></td>
		<th height="22">状态</th>
		<td>
			<select name="D1">
				<option>--请选择--</option>
				<option value="新创建">新创建</option>
				<option value="已分配">已分配</option>
				<option value="已处理">已处理</option>
				<option value="已归档">已归档</option>
			</select>
		</td>
	</tr>
</table>
</div>
	<div id="dd" class="easyui-dialog" data-options="closed:true" title="服务分配" style="width:400px;height:100px;display: none;">
		<select class="easyui-combobox" id="svrDueTo" style="width:380px;">
			<option value="aitem1">aitem1</option>
			<option value="bitem2">bitem2</option>
			<option value="bitem3">bitem3</option>
			<option value="ditem4">ditem4</option>
			<option value="eitem5">eitem5</option>
		</select>
</div>
<br />
<table class="data_list_table" id="ds" width="100%">

</table>
</body>
</html>