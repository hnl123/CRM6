package com.zking.crm.model;

import java.io.Serializable;

public class Dict implements Serializable{
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Boolean dictIsEditable;

    public Dict(Integer dictId, String dictType, String dictItem, String dictValue, Boolean dictIsEditable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEditable = dictIsEditable;
    }

    public Dict() {
        super();
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Boolean getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Boolean dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "dictId=" + dictId +
                ", dictType='" + dictType + '\'' +
                ", dictItem='" + dictItem + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", dictIsEditable=" + dictIsEditable +
                '}';
    }
}