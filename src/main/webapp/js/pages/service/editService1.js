$(function () {
    $("#submit").click(function () {
        $('#fg').form('submit', {
            url:"service/editDispatch1",
            success:function(data){
            }
        });
    });
});