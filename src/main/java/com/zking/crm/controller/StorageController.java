package com.zking.crm.controller;

import com.zking.crm.biz.IStorageBiz;
import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private IStorageBiz storageBiz;

    @RequestMapping("/listStorage")
    @ResponseBody
    public ResponseData listStorage(HttpServletRequest request, Storage storage) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Storage> storageList = storageBiz.listStorage(storage, pageBean);
        for (Storage s : storageList) {
            s.setpName(s.getProduct().getProdName()+"-"+s.getProduct().getProdType()+"-"+s.getProduct().getProdBatch());
        }
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(storageList);
        return responseData;
    }
}
