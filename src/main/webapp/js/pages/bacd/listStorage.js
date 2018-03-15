$(function () {
    $("#ds").datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6,10],
        pageSize : 6,
        idField : 'stkId',
        singleSelect : true,
        url:"storage/listStorage",
        columns:[[
            {field:'stkId',title:'编号',width:"10%"},
            {field:'pName',title:'产品',width:"30%"},
            {field:'stkWarehouse',title:'仓库',width:"20%",align:'right'},
            {field:'stkWare',title:'货位',width:"15%"},
            {field:'stkCount',title:'件数',width:"10%"},
            {field:'stkMemo',title:'备注',width:"15%"}
        ]]
    });

    $("#listBt").click(function () {
        var formData={
            pName: $('#pName').val(),
            stkWarehouse: $('#stkWarehouse').val(),
        };
        $("#ds").datagrid({
            queryParams:formData,
        });
    });
});