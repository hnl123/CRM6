$ (function () {
    $ ('#ds').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'svrId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-Remove',
            text: '查看',
            handler: function () {
                var rows = $("#ds").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要查看的记录');
                    return;
                }else{
                   parent.doOpenTab("服务查看","/service/loadArch?svrId="+rows.svrId)
                }
            }
        }],
        url:"service/listArch",
        columns:[[
            {field:'svrCustName',title:'客户',width:"15%"},
            {field:'svrTitle',title:'概要',width:"30%"},
            {field:'svrStatus',title:'状态',width:"20%",align:'right'},
            {field:'svrType',title:'类型',width:"15%"},
            {field:'svrCreateBy',title:'创建人',width:"20%"},
            {field:'svrCreateDate',title:'创建日期',width:"20%"}
        ]]

    });
    $('#dg').click(function () {
        var formData={
            svrCustName:$('#svrCustName').val(),
            svrType:$('#svrType').val(),
        };
        $('#ds').datagrid({
            queryParams: formData,
        });
        return false;
    });
});