+$(function () {
    $("#dc").datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6,10],
        pageSize : 6,
        idField : 'svrId',
        singleSelect : true,
        toolbar: [{
            iconCls: 'icon-edit',
            text:"编辑",
            handler: function(){
                var rows = $("#dc").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要编辑的记录');
                    return;
                }else{
                    if(rows.dictIsEditable==false){
                        disabled:true;
                        $.messager.alert('警告', '此条记录不可编辑');
                    }else{
                        parent.doOpenTab("编辑","/dict/loadDict?dictId="+rows.dictId)
                    }

                }
            }
        },'-',{
            iconCls: 'icon-Remove',
            text:"删除",
            handler: function(){
                var rows = $("#dc").datagrid(("getSelected"));
                if(!rows) {
                    $.messager.alert('警告', '请选择要删除的记录');
                    return;
                }
                $.messager.confirm('提示', '你确定要删除该记录吗？', function (r) {
                    if(r) {
                        var dictId = rows.dictId;
                        var url = "dict/delDict?dictId="+dictId;
                        $.ajax({
                            dataType: 'json',
                            url: url,
                            success: function (data) {
                                if (0 == data.code) {
                                    $.messager
                                        .alert('提示', data.message);
                                    // alert(999);
                                    var ind = $("#dc").datagrid(
                                        "getRowIndex", dictId);
                                    $("#dc").datagrid("deleteRow", ind);
                                } else {
                                    $.messager.alert('警告', '字典删除失败');
                                }
                            }
                        });
                    }
                });
            }
        },'-',{
            iconCls: 'icon-Add',
            text:"新建",
            handler: function(){
                parent.doOpenTab("字典新增","/input/jsp/basd/dict_add")
            }
        }],
        url:"dict/listDict",
        columns:[[
            {field:'dictId',title:'编号',width:"15%"},
            {field:'dictType',title:'类别',width:"30%"},
            {field:'dictItem',title:'条目',width:"20%",align:'right'},
            {field:'dictValue',title:'值',width:"15%"},
            {field:'dictIsEditable',title:'是否可编辑',width:"20%"}
        ]]
    });

    $('#listBt').click(function () {
        var formData={
            dictType: $('#dictType').val(),
            dictItem: $('#dictItem').val(),
            dictValue: $('#dictValue').val()
        };
        $('#dc').datagrid({
            queryParams: formData,
        });
        return false;
    });
});