<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>统计图</title>
	<%@include file="/common/head.jsp"%>
	<script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
	<script type="text/javascript" src="js/highcharts.js" ></script>
	<style type="text/css">
		.clearfix:after {
			content: ".";
			display: block;
			height: 0;
			clear: both;
			visibility: hidden;
		}
		.clearfix {display: inline-block;}  /* for IE/Mac */

		.cpu{width:200px;height:200px; display:block;float:left;margin-right:10px;}
		.memory{height:200px; width:830px; margin-top:10px;}
	</style>
<script type="text/javascript">
    var chart;
    $(function() {
        $.ajax({
			url:"dict/listIn",
            success: function (str) {
			    alert(str);
                var data = eval(str);
                chart = new Highcharts.Chart({
                    chart: {
                        renderTo: 'chart_combo' //关联页面元素div#id
                    },

                    title: {  //图表标题
                        text: '客户构成分析'
                    },

//            xAxis: { //x轴
//                categories: ['柑橘', '香蕉','苹果', '梨子'],  //X轴类别
//                labels:{y:18}  //x轴标签位置：距X轴下方18像素
//            },
//            yAxis: {  //y轴
//                title: {text: '消费量（万吨）'}, //y轴标题
//                lineWidth: 2 //基线宽度
//            },
                    tooltip: {
                        formatter: function() { //格式化鼠标滑向图表数据点时显示的提示框
                            var s;
                            if (this.point.name) { // 饼状图
                                s = '<b>' + this.point.name + '</b>: <br>' + this.y+ '位(' + twoDecimal(this.percentage) + '%)';
                            } else {
                                s = '' + this.x + ': ' + this.y + '位';
                            }
                            return s;
                        }
                    },
                    labels: { //图表标签
                        items: [{
                            html: '',
                            style: {
                                left: '48px',
                                top: '8px'
                            }
                        }]
                    },
                    exporting: {
                        enabled: false  //设置导出按钮不可用
                    },
                    series: [
//                { //数据列
//                type: 'column',
//                name: '长春',
//                data: [8.4, 9.8, 11.4, 15.6]
//            },
//                {
//                    type: 'column',
//                    name: '沈阳',
//                    data: [9.2, 7.8, 10.2, 16.8]
//                },
//                {
//                    type: 'column',
//                    name: '哈尔滨',
//                    data: [6.5, 9.4, 13.2, 18.6]
//                },
//                {
//                    type: 'spline',
//                    name: '平均值',
//                    data: [8.03, 9, 11.6, 17]
//                },
                        {
                            type: 'pie', //饼状图
                            name: '水果消费总量',
                            data: [{
                                name: '战略合作伙伴',
                                y: data[0],
                                color: '#4572A7'
                            },
                                {
                                    name: '合作伙伴',
                                    y: data[1],
                                    color: '#AA4643'
                                },
                                {
                                    name: '大客户',
                                    y: data[2],
                                    color: '#89A54E'
                                },{
                                    name: '重点开发客户',
                                    y: data[3],
                                    color:'blue'
                                },{
                                    name: '普通客户',
                                    y: data[4],
                                    color: 'yellow'
                                }
                            ],
                            center: [600, 200],  //饼状图坐标
                            size: 300,  //饼状图直径大小
                            dataLabels: {
                                enabled: false  //不显示饼状图数据标签
                            }
                        }]
                });
			}
		});


    });
    //保留2位小数
    function twoDecimal(x) {
        var f_x = parseFloat(x);
        if (isNaN(f_x)) {
            alert('错误的参数');
            return false;
        }
        var f_x = Math.round(x * 100) / 100;
        var s_x = f_x.toString();
        var pos_decimal = s_x.indexOf('.');
        if (pos_decimal < 0) {
            pos_decimal = s_x.length;
            s_x += '.';
        }
        while (s_x.length <= pos_decimal + 2) {
            s_x += '0';
        }
        return s_x;
    }

</script>
</head>
<body>

<div id="content">

	<br><br><br>
	<!--DEMO start-->
	<div id="chart_combo" class="chart_combo"></div>
</div>
</body>
</html>