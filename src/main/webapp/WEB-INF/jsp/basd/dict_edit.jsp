<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<style type="text/css">
		li{list-style: none}
		.la{background-color: #DCDCDC}
		.lb{}
	</style>
	<script type="text/javascript">

        function mysa(epname){
            $("#dictType").val(epname);
            $("#pa").hide();
        }

        function myv(){
            $("#pa").hide();
        }

        function myzd(dictType){//自动补全
            $("#pa").show();
            $.ajax({
                url:"dict/list1",
                data:"dictType="+dictType,
                dataType:"text",
                success:function(str){
                    var ss = eval(str);
                    var str="";
                    //遍历集合
                    for(var i=0;i<ss.length;i++){
                        if(i==0){
                            str+="<ul>";
                        }
                        str+="<li onmouseover=\"this.className='la'\" onmouseout=\"this.className='lb'\" onclick=\"mysa('"+ss[i].dictType+"')\">"+ss[i].dictType+"</li>";
                        if(i==ss.length){
                            str+="</ul>";
                        }
                    }
                    $("#pa").html(str);
                },
                error:function(){
                    alert("错了");
                }
            });
        }

        $(function () {
            $('#submit').click(function () {
                $('#fd').form('submit', {
                    url: "dict/editDict",
                    success: function (data) {
                    }
                });
            });
        });
	</script>
</head>
<body>

<div class="page_title">数据字典管理 > 编辑数据字典条目</div>
<form id="fd" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button id="submit">保存</button>
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>${d.dictId}</td>
		<th>类别</th>
		<td><input id="dictType" value="${d.dictType}" onkeyup="myzd(this.value)" name="dictType"/><span class="red_star">*</span><br />
			<div id="pa" style="position:absolute; top:80px; left:0px;width: 155px;margin-left:770px;border-color: #DCDCDC;border-style: groove;display:none;background-color: white;">
			</div>
		</td>
	</tr>
	<tr>
		<th>条目</th>
		<td><input value="${d.dictItem}" name="dictItem"/>
			<input type="hidden" name="dictId" value="${d.dictId}"/>
			<span class="red_star">*</span></td>
		<th>值</th>
		<td><input value="${d.dictValue}" name="dictValue"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>是否可编辑</th>
		<td><input type="checkbox" checked name="dictIsEditable"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
</body>
</html>