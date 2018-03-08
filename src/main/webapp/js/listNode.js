$(function() {
    $("ul.myTree").each(function() {
        var url = "sysTreeNode/toNode?parentNodeId=" + $(this).attr("id");
        $(this).tree({
            url : url,
            onBeforeLoad : function(node, param) {
                // console.log("onBeforeLoad");
                var defaults = $(this).tree("options");
                if (node) {
                    var newUrl = "sysTreeNode/toNode?parentNodeId="
                        + node.id;
                    defaults.url = newUrl;
                }
            }, onSelect : function(node) {
                var text = node.text;
                var url = node.attributes.url;
                if (url) {
                    doOpenTab(text, url);
                }
            }
        });
    });
});


/**
 * 打开一个新的tab页面,如果存在就选中
 *
 * @param {}
 *            text
 * @param {}
 *            node
 */
function doOpenTab(text, url) {
    if ($("#wu-tabs").tabs('exists', text)) {
        $("#wu-tabs").tabs('select', text);

        var tabObj = $("#wu-tabs").tabs('getTab', text);
        $("iframe", tabObj).attr("src",contextPath + url);
    } else {
        url = contextPath + url;
        var content = '<iframe scrolling="no" frameborder="0" src="' + url
            + '" width="99%" height="99%"></iframe>';
        $('#wu-tabs').tabs('add', {
            title : text,
            content : content,
            closable : true
        });
    }

}