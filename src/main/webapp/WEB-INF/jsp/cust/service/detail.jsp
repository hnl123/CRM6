<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
</head>
<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
</div>
<table class="query_form_table">
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
<table class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3">${s.svrDeal}</td>
	</tr>
	<tr>
		<th>处理人</th>
		<td>${s.svrDealBy}</td>
		<th>处理时间</th>
		<td><fmt:formatDate value="${s.svrDealDate}" type="Date" pattern="yyyy-MM-dd"/></td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td>${s.svrResult}</td>
		<th>满意度</th>
		<td>
			<c:if test="${s.svrSatisfy==3}">
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
			</c:if>
			<c:if test="${s.svrSatisfy==4}">
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
			</c:if>
			<c:if test="${s.svrSatisfy==5}">
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
				<img src="images/star.jpg" class="star_pic" />
			</c:if>
		</td>
	</tr>
</table>
</body>
</html>