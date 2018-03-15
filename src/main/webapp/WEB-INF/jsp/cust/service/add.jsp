<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="js/pages/service/addService.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 > 服务创建</div>

<form id="ff" method="post">
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button id="submit" class="common_button">保存</button>
	</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input disabled /></td>
		<th>服务类型</th>
		<td>
			<select id="svrType" name="svrType">
				<option>请选择...</option>
				<option value="咨询">咨询</option>
				<option value="投诉">投诉</option>
				<option value="建议">建议</option>
			</select><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3"><input size="53" id="svrTitle" name="svrTitle"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>客户</th>
		<td><input size="20" id="svrCustName" name="svrCustName"/><span class="red_star">*</span></td>
		<th>状态</th>
		<td>新创建</td>
	</tr>
	<tr>
		<th>服务请求</th>
		<td colspan="3"><textarea rows="6" cols="50" id="svrRequest" name="svrRequest"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input name="svrCreateBy" value="${sessionScope.user.userName}" readonly size="20" id="svrCreateBy"/><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><input id="svrCreateDate" name="svrCreateDate" readonly size="20" value="<%=new Date()%>"/><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<script>
    setCurTime('t1');
    setCurTime('t2');
    setCurTime('t3');
</script>
</body>
</html>