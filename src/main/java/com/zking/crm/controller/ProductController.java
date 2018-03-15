package com.zking.crm.controller;

import com.zking.crm.biz.IProductBiz;
import com.zking.crm.model.Product;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductBiz productBiz;

    @RequestMapping("/listProduct")
    @ResponseBody
    public ResponseData listProduct(Product product, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Product> productList = productBiz.listProduct(product, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(productList);
        return responseData;
    }
}
