//装统计图表格的容器
function initDataWin(){
    $('#dataWinChart').window({
        iconCls : 'icon-save',
        width : 750,
        height: 450,
        modal : true,
        shadow : true,
        closed : true,
        closable : true,
        fit : false,
        minimizable : false,
        maximizable : false,
        collapsible : false,
        resizable : false
    });
}

/**
 * 增加条形统计和饼状统计的查看按钮
 */
function dataGridToolbar(){  //此方法只是增加两个按钮,你也可以用其它方法增加按钮
    return [ {
        iconCls : 'icon-edit',
        text : '条形统计图',
        plain : true,
        handler : function(){        //2d图形
            showFigure(0);
        }
    },'-',{
        iconCls : 'icon-edit',
        text : '饼状统计图',
        plain : true,
        handler :  function(){    //    3d图形
            showFigure(1);
        }
    } ];
}

/**
 * 统计图弹窗
 */
function showFigure(value){

    if($('#dataGrid').datagrid('getData').rows.length<=0){
        $.messager.alert('系统信息', '查询结果中无数据，请查询到数据后再查看统计图！', 'error');
        return;
    }

    $('#dataWinChart').window('open');
    $('#dataWinChart').window('center');

    if(value==0){
        $('#dataWinChart').window('setTitle', '条形统计图');
        var    figure="Column2D";        //条形统计图效果
        statisticalFigure(value,figure);
    }else{
        $('#dataWinChart').window('setTitle', '饼状统计图');
        var figure="pie3d";                //饼状统计图效果
        statisticalFigure(value,figure);
    }
}

/**
 * 统计图数据获取
 */
function statisticalFigure(value,figure){

    $.messager.progress({ msg : '处理中，请稍后...' });

    var queryParams=getDataGridParams();

    $.ajax({
        type : 'POST',
        data : queryParams,
        url : 'storage/listStudent',
        dataType : 'json',
        success : function(data) {

            alert(data);

            /**动态显示单位名称,若单位数量<=7个则显示名称,否则将名称隐藏
             说明:单位太多若全部显示名称会严重影响页面美观*/
            var showName = '0';

            /**动态设置统计图宽度*/
            var width = data.rows.length * 100;

            /**若动态设置的宽度小于默认宽度,或打开的是饼状统计图,则将宽度设置为默认宽度735*/
            if(width < 735 || value == 1){
                width = 735;
                showName = '1';
            }

            /**高度为父元素window窗口的高度*/
            var height = '100%';

            /**设置统计图表的相关属性存入map*/
            var chartDataMap ={
                'caption':'消防档案完成度统计图',
                'formatnumberscale':'1',
                'showBorder':'1',
                'showpercentvalues':'1',
                'pieslicedepth':'30',
                'numberSuffix':'%',
                'yAxisMinValue':'10',
                'yAxisMaxValue':'100',
//                     'xAxisName':'单位名称',
//                     'yAxisName':'完成度百分比',
                "canvasbgColor": "#1790e1",
                "canvasbgAlpha": "10",
                "showCanvasBorder": "1",
                "showLabels": showName,
//                     "labelDisplay": "rotate"
//                     "labelDisplay": "auto"
                "toolTipSepChar":"：",
                "baseFontSize":"14"
            };

            //将后台返回的数据与前台设置好的统计图属性数据一起封装成map集合给FusionCharts解析
            var showDataMap = {'data':data.rows,'chart':chartDataMap};

            var myChart = new FusionCharts(figure,"myChartId",width,height);

            myChart.setJSONData(showDataMap);

            //将对应的英文提换转为中文
            myChart.configure("ChartNoDataText","没有查询到相关数据");
            myChart.configure("LoadDataErrorText","加载数据出错啦!");
            myChart.configure("XMLLoadingText","加载数据中...");
            myChart.configure("InvalidXMLText","初始化...");
            myChart.configure("ReadingDataText","读取数据...");
            myChart.configure("ChartNotSupported","图表不支持");
            myChart.configure("LoadingText","加载");

            myChart.render("dataWinChart");
            $.messager.progress('close');
        },
        error : function() {
            $.messager.progress('close');
            $.messager.alert('系统信息', '网络故障，请检查网络情况。', 'error');
        }
    });
}