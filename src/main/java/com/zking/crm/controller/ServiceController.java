package com.zking.crm.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.zking.crm.biz.IServiceBiz;
import com.zking.crm.model.Service;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private IServiceBiz serviceBiz;

    @ModelAttribute
    public void init(Model model) {
        Service service = new Service();
        model.addAttribute("service", service);
    }

    @RequestMapping("/listDispatch")
    @ResponseBody
    public ResponseData listDispatch(Service service, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<Service> serviceList = serviceBiz.list(service, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(serviceList);
        return responseData;
    }

    @RequestMapping("/listDeal")
    @ResponseBody
    public ResponseData listDeal(Service service, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<Service> serviceList = serviceBiz.list1(service, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(serviceList);
        return responseData;
    }

    @RequestMapping("/delDispatch")
    @ResponseBody
    public Object delDispatch(Service service) {
        serviceBiz.delService(service);
        ResponseData responseData = new ResponseData();
        responseData.setCode(0);
        responseData.setMessage("删除成功!");
        return responseData;
    }

    @RequestMapping("/editDispatch")
    @ResponseBody
    public Object editDispatch(HttpServletRequest request,Service service) {
        service.setSvrDueDate(new Date());
        service.setSvrStatus("已分配");
        serviceBiz.editService(service);
        ResponseData responseData = new ResponseData();
        responseData.setCode(0);
        responseData.setMessage("分配成功");
        return responseData;
    }

    @RequestMapping("/addDispatch")
    public String addDispatch(HttpServletRequest request, Service service) {
        service.setSvrStatus("新创建");
        service.setSvrCreateId(1L);
        serviceBiz.addService(service);
        return "redirect:/input/jsp/cust/service/add";
    }

    @RequestMapping("/loadDispatch")
    public String loadDispatch(HttpServletRequest request, Service service, Model model) {
        Service service1 = serviceBiz.loadService(service);
        request.setAttribute("s", service1);
        return "forward:/input/jsp/cust/service/deal_detail";
    }

    @RequestMapping("/editDispatch1")
    public String editDispatch1(HttpServletRequest request,Service service) {
        service.setSvrDealId(1L);
        service.setSvrStatus("已处理");
        service.setSvrDealDate(new Date());
        serviceBiz.editService(service);
        return "redirect:/input/jsp/cust/service/deal";
    }

    @RequestMapping("/listFeedBack")
    @ResponseBody
    public ResponseData listFeedBack(Service service,HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<Service> serviceList = serviceBiz.list2(service, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(serviceList);
        return responseData;
    }

    @RequestMapping("/loadFeedBack")
    public String loadFeedBack(HttpServletRequest request, Service service, Model model) {
        Service service1 = serviceBiz.loadService(service);
        request.setAttribute("s", service1);
        return "forward:/input/jsp/cust/service/feedback_detail";
    }

    @RequestMapping("/editFeedBack")
    public String editFeedBack(HttpServletRequest request,Service service) {
        if(service.getSvrSatisfy()<3){
            service.setSvrStatus("已处理");
        }else{
            service.setSvrStatus("已归档");
        }
        serviceBiz.editService(service);
        return "redirect:/input/jsp/cust/service/feedback";
    }

    @RequestMapping("/listArch")
    @ResponseBody
    public ResponseData listArch(Service service, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<Service> serviceList = serviceBiz.list3(service, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(serviceList);
        return responseData;
    }

    @RequestMapping("/loadArch")
    public String loadArch(HttpServletRequest request, Service service, Model model) {
        Service service1 = serviceBiz.loadService(service);
        request.setAttribute("s", service1);
        return "forward:/input/jsp/cust/service/detail";
    }


    @RequestMapping("/listGroup")
    @ResponseBody
    public List<Integer> listGroup(String yd) {
        return serviceBiz.listGroup(yd) ;
    }
}
