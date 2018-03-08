package com.zking.crm.mapper;

import com.zking.crm.model.SysTreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysTreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(SysTreeNode record);

    int insertSelective(SysTreeNode record);

    SysTreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(SysTreeNode record);

    int updateByPrimaryKey(SysTreeNode record);

    List<SysTreeNode> list(SysTreeNode sysTreeNode);
}