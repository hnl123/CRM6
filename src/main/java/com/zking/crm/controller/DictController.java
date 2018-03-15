package com.zking.crm.controller;

import com.zking.crm.biz.IDictBiz;
import com.zking.crm.model.Dict;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private IDictBiz dictBiz;

    @RequestMapping("/listDict")
    @ResponseBody
    public ResponseData listDict(Dict dict, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<Dict> dictList = dictBiz.listDict(dict, pageBean);

        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(dictList);
        return responseData;
    }


    @RequestMapping("/list1")
    @ResponseBody
    public List<Dict> list1(Dict dict) {

        return dictBiz.list1(dict);
    }

    @RequestMapping("/loadDict")
    public String loadDict(Dict dict,HttpServletRequest request) {
        Dict loadDict = dictBiz.LoadDict(dict);
        request.setAttribute("d", loadDict);
        return "forward:/input/jsp/basd/dict_edit";
    }

    @RequestMapping("/editDict")
    public String editDict(Dict dict) {
        dictBiz.editDict(dict);
        return "redirect:/input/jsp/basd/dict";
    }

    @RequestMapping("/delDict")
    @ResponseBody
    public Object delDict(Dict dict) {
        dictBiz.delDict(dict);
        ResponseData responseData = new ResponseData();
        responseData.setCode(0);
        responseData.setMessage("删除成功");
        return responseData;
    }

    @RequestMapping("/list2")
    @ResponseBody
    public List<Dict> list2(Dict dict) {

        return dictBiz.list1(dict);
    }

    @RequestMapping("/addDict")
    public String addDict(Dict dict){
        dictBiz.addDict(dict);
        return "redirect:/input/jsp/basd/dict";
    }

}
