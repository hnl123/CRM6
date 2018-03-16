package com.zking.crm.model;

import java.io.Serializable;

public class Storage implements Serializable{
    private Long stkId;

    private Long stkProdId;

    private String stkWarehouse;

    private String stkWare;

    private Integer stkCount;

    private String stkMemo;

    //商品对象
    private Product product;

    private String pName;

    public Storage(Long stkId, Long stkProdId, String stkWarehouse, String stkWare, Integer stkCount, String stkMemo,Product product) {
        this.stkId = stkId;
        this.stkProdId = stkProdId;
        this.stkWarehouse = stkWarehouse;
        this.stkWare = stkWare;
        this.stkCount = stkCount;
        this.stkMemo = stkMemo;
        this.product = product;
    }

    public Storage() {
        super();
    }

    public Long getStkId() {
        return stkId;
    }

    public void setStkId(Long stkId) {
        this.stkId = stkId;
    }

    public Long getStkProdId() {
        return stkProdId;
    }

    public void setStkProdId(Long stkProdId) {
        this.stkProdId = stkProdId;
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse;
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare;
    }

    public Integer getStkCount() {
        return stkCount;
    }

    public void setStkCount(Integer stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "stkId=" + stkId +
                ", stkProdId=" + stkProdId +
                ", stkWarehouse='" + stkWarehouse + '\'' +
                ", stkWare='" + stkWare + '\'' +
                ", stkCount=" + stkCount +
                ", stkMemo='" + stkMemo + '\'' +
                '}';
    }
}