package com.zking.crm.biz.impl;

import com.zking.crm.biz.IProductBiz;
import com.zking.crm.mapper.ProductMapper;
import com.zking.crm.model.Product;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBizImpl implements IProductBiz {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> listProduct(Product product, PageBean pageBean) {
        return productMapper.listProduct(product);
    }
}
