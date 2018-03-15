package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.IProductBiz;
import com.zking.crm.model.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductBizImplTest extends BaseTest {

    @Autowired
    private IProductBiz productBiz;

    private Product product;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        product = new Product();
    }

    @Test
    public void listProduct() throws Exception {
        List<Product> productList = productBiz.listProduct(product, null);
        for (Product p : productList) {
            System.out.println(p);
        }
    }

}