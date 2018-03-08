package com.zking.crm.model;

import java.io.Serializable;

public class SysTreeNode implements Serializable{
    private static final Integer LEAF = new Integer(2);
    private Integer treeNodeId;

    private String treeNodeName;

    private Integer treeNodeType;

    private Long position;

    private Integer parentNodeId;

    private String url;

    public SysTreeNode(Integer treeNodeId, String treeNodeName, Integer treeNodeType, Long position, Integer parentNodeId, String url) {
        this.treeNodeId = treeNodeId;
        this.treeNodeName = treeNodeName;
        this.treeNodeType = treeNodeType;
        this.position = position;
        this.parentNodeId = parentNodeId;
        this.url = url;
    }

    public SysTreeNode() {
        super();
    }

    public Integer getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Integer treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName;
    }

    public Integer getTreeNodeType() {
        return treeNodeType;
    }

    public void setTreeNodeType(Integer treeNodeType) {
        this.treeNodeType = treeNodeType;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public boolean isLeaf() {
        return LEAF.equals(treeNodeType);
    }
    @Override
    public String toString() {
        return "SysTreeNode{" +
                "treeNodeId=" + treeNodeId +
                ", treeNodeName='" + treeNodeName + '\'' +
                ", treeNodeType=" + treeNodeType +
                ", position=" + position +
                ", parentNodeId=" + parentNodeId +
                ", url='" + url + '\'' +
                '}';
    }
}