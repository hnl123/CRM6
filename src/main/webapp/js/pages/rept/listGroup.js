$(function () {
    $("#dg").datagrid({
        remoteSort:true,
        rownumbers:true,
        url:"service/listGroup",
        columns:[[
            {field:'svrId',title:'编号',width:"25%",sortable:true},
            {field:'svrType',title:'服务类型',width:"25%"},
            {field:'serviceCount',title:'数量',width:"50%",align:'center'}
        ]]
    });

    $("#listBt").click(function () {
        var formData={
            yd:$("#yd").val()
        };
        $("#dg").datagrid({
            queryParams:formData,
        });
    });
});