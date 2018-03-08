package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.ISysTreeNodeBiz;
import com.zking.crm.model.SysTreeNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SysTreeNodeBizImplTest extends BaseTest {

    @Autowired
    private ISysTreeNodeBiz sysTreeNodeBiz;

    private SysTreeNode sysTreeNode;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        sysTreeNode = new SysTreeNode();
    }

    @Test
    public void list() throws Exception {
        List<SysTreeNode> treeNodeList = sysTreeNodeBiz.list(sysTreeNode);
        for (SysTreeNode treeNode : treeNodeList) {
            System.out.println(treeNode);
        }
    }

}