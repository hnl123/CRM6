<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>客户关系管理系统</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript" src="script/jQuery.js"></script>
	<script type="text/javascript" src="script/jqplot.js"></script>
	<script type="text/javascript" src="script/m_jqplot.js"></script>
	<script type="text/javascript">
        $(document).ready(function() {
                $.ajax({
                    url: "service/listGroup",
//					data:"yd="+yd,
                    dataType: "text",
                    success: function (str) {
                        var data = [];
                        var data_max = 15; //Y轴最大刻度
                        var line_title = []; //曲线名称
                        var y_label = "这是Y轴"; //Y轴标题
                        var x_label = "这是X轴"; //X轴标题
                        var x = ["咨询","建议","投诉"]; //定义X轴刻度值
                        var title = "这是标题"; //统计图标标题
                        var dd = eval(str);
                        data.push(dd);
                        j.jqplot.diagram.base("chart1", data, line_title, "这是统计标题", x, x_label, y_label, data_max, 1);
                        j.jqplot.diagram.base("chart2", data, line_title, "这是统计标题", x, x_label, y_label, data_max, 2);
                    }
                });
        });
	</script>
<body>
<div id="chart1"></div>
<div id="chart2"></div>
</div>
</body>
</html>
