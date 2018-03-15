$(function () {
    $("#dp").datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6,10],
        pageSize : 6,
        idField : 'prodId',
        singleSelect : true,
        url:"product/listProduct",
        columns:[[
            {field:'prodId',title:'编号',width:"15%"},
            {field:'prodName',title:'名称',width:"30%"},
            {field:'prodType',title:'型号',width:"20%",align:'right'},
            {field:'prodBatch',title:'等级/批次',width:"15%"},
            {field:'prodUnit',title:'单位',width:"10%"},
            {field:'prodPrice',title:'单价/元',width:"15%"},
            {field:'prodMemo',title:'备注',width:"15%"}
        ]]
    });
    $("#listBt").click(function () {
        var formData={
            prodName: $('#prodName').val(),
            prodType: $('#prodType').val(),
            prodBatch: $('#prodBatch').val()
        };
        $("#dp").datagrid({
            queryParams:formData,
        });
    });
});