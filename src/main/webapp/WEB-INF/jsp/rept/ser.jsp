<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>jb-aptech毕业设计项目</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="script/jQuery.js"></script>
	<script type="text/javascript" src="script/jqplot.js"></script>
	<script type="text/javascript" src="script/m_jqplot.js"></script>
	<script type="text/javascript">
        $(document).ready(function() {
                $.ajax({
                    url: "service/listGroup?yd=",
                    success: function (str) {
                        var data = [];
                        var data_max = 15; //Y轴最大刻度
                        var line_title = []; //曲线名称
                        var y_label = "Y轴"; //Y轴标题
                        var x_label = "X轴"; //X轴标题
                        var x = ["咨询","建议","投诉"]; //定义X轴刻度值
                        var title = "这是标题"; //统计图标标题
                        var dd = eval(str);
                        data.push(dd);
//                    j.jqplot.diagram.base("chart1", data, line_title, "这是统计标题", x, x_label, y_label, data_max, 1);
                        j.jqplot.diagram.base("chart2", data, line_title, "客户服务分析", x, x_label, y_label, data_max, 2);
                    }
                });
        });

function ab(a) {
    $.ajax({
        url: "service/listGroup?yd="+a,
        success: function (str) {
            var data = [];
            var data_max = 15; //Y轴最大刻度
            var line_title = []; //曲线名称
            var y_label = "Y轴"; //Y轴标题
            var x_label = "X轴"; //X轴标题
            var x = ["咨询","建议","投诉"]; //定义X轴刻度值
            var title = "这是标题"; //统计图标标题
            var dd = eval(str);
            data.push(dd);
            j.jqplot.diagram.base("chart2", data, line_title, "客户服务分析", x, x_label, y_label, data_max, 2);
        }
    });
}
	</script>
</head>
<body>

<div class="page_title">客户服务分析</div>
<div class="button_bar">
	<%--<button class="easyui-linkbutton" iconCls="icon-help" onclick="help('');">帮助</button>--%>
	<%--<button class="easyui-linkbutton" iconCls="icon-search" id="listBt">查询</button>--%>
</div>
<table class="query_form_table">
	<tr>
		<th>年份</th>
		<td>
			<select onchange="ab(this.value)">
				<option>--请选择--</option>
				<option value="2018">2018</option>
				<option value="2017">2017</option>
				<option value="2016">2016</option>
				<option value="2015">2015</option>
				<option value="2014">2014</option>
				<option value="2013">2013</option>
				<option value="2012">2012</option>
			</select>
		</td>
		<th>&nbsp;</th>
		<td>
			&nbsp;
		</td>
	</tr>
</table>
<br />
<table class="data_list_table" id="dg">

</table>
<div id="chart2"></div>
</body>
</html>