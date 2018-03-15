package com.zking.crm.biz;

import com.zking.crm.mapper.ServiceMapper;
import com.zking.crm.model.Service;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IServiceBiz {

    void addService(Service service);

    void editService(Service service);

    void delService(Service service);

    List<Service> list(Service service, PageBean pageBean);

    List<Service> list1(Service service, PageBean pageBean);

    List<Service> list2(Service service, PageBean pageBean);

    List<Service> list3(Service service, PageBean pageBean);

    Service loadService(Service service);

    List<Integer> listGroup(String yd);
}
