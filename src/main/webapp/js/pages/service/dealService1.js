$ (function () {
    $ ('#ds').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'svrId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-Remove',
            text: '处理',
            handler: function () {
                var rows = $("#ds").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要处理的记录');
                    return;
                }else{
                    parent.doOpenTab("服务处理","service/loadDispatch?svrId="+rows.svrId)
                    // window.open('service/loadDispatch?svrId='+rows.svrId)
                }
            }
        }],
        url:"service/listDeal",
        columns : [[{
            field : 'svrCustName',
            title : '客户',
            width : "15%"
        }, {
            field : 'svrTitle',
            title : '概要',
            width : "30%"
        }, {
            field : 'svrStatus',
            title : '服务类型',
            width : "15%"
        }, {
            field:'svrType',
            title:'服务类型',
            width:'15%'
        }, {
            field : 'svrCreateBy',
            title : '创建人',
            width : "15%"
        }, {
            field : 'svrCreateDate',
            title : '创建日期',
            width : "15%"
        }]]

    });
    $("#listBt").click(function () {
        var formData = {
            svrCustName:$("#svrCustName").val()
            // svrType:$("#svrType").val(),
            // T1:$("#T1").val(),
            // T2:$("#T2").val()
        };
        $("#ds").datagrid(function () {
            queryParams : formData
        });
        return false;
    });
});