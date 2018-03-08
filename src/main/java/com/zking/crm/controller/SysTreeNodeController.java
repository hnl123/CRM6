package com.zking.crm.controller;

import com.zking.crm.biz.ISysTreeNodeBiz;
import com.zking.crm.model.SysTreeNode;
import com.zking.crm.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sysTreeNode")
public class SysTreeNodeController {

    @Autowired
    private ISysTreeNodeBiz treeNodeBiz;

//    @ModelAttribute
//    public void init(Model model, SysTreeNode sysTreeNode) {
//        sysTreeNode = new SysTreeNode();
//        model.addAttribute("sysTreeNode", sysTreeNode);
//    }

    @RequestMapping("/toNode")
    public String toNode(Model model, SysTreeNode sysTreeNode, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String method = request.getParameter("method");
        List<SysTreeNode> treeNodeList1 = treeNodeBiz.list(sysTreeNode);
        if ("list".equals(method)) {
            model.addAttribute("treeNodeList", treeNodeList1);
        }else{
            // 转换成easyui树节点的所需数据格式
            List<Map<String, Object>> treeNodeList = new ArrayList<Map<String, Object>>();
            Map<String, Object> map = null;

            Map<String, Object> attributes = null;
            for (SysTreeNode t : treeNodeList1) {
                map = new HashMap<String, Object>();
                // 节点的标准属性
                map.put("id", t.getTreeNodeId());
                map.put("text", t.getTreeNodeName());
                map.put("state", t.isLeaf() ? "open" : "closed");

                // 添加节点的自定义属性
                attributes = new HashMap<String, Object>();
                attributes.put("url", t.getUrl());
                map.put("attributes", attributes);

                treeNodeList.add(map);
            }
            response.setContentType("text/plain;charset=utf-8");
            ServletOutputStream os = response.getOutputStream();
            JsonUtils.writeValue(os, treeNodeList);
        }

        return "/jsp/listNode";
    }
}
