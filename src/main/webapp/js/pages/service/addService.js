$(function () {
    $("#submit").click(function () {
        $('#ff').form('submit', {
            url:"service/addDispatch",
            success:function(data){
        }
    });
    });
});