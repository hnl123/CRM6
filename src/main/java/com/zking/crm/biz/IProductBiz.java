package com.zking.crm.biz;

import com.zking.crm.model.Product;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IProductBiz {

    List<Product> listProduct(Product product, PageBean pageBean);
}
