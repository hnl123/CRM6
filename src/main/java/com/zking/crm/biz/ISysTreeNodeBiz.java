package com.zking.crm.biz;

import com.zking.crm.model.SysTreeNode;

import java.util.List;

public interface ISysTreeNodeBiz {

    //获取所有菜单
    List<SysTreeNode> list(SysTreeNode sysTreeNode);
}
