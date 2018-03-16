package com.zking.crm.biz.impl;

import com.zking.crm.biz.IServiceBiz;
import com.zking.crm.mapper.ServiceMapper;
import com.zking.crm.model.Service;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceBizImpl implements IServiceBiz {

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public void addService(Service service) {
        serviceMapper.insertSelective(service);
    }

    @Override
    public void editService(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public List<Service> list(Service service, PageBean pageBean) {
        return serviceMapper.list(service);
    }

    @Override
    public void delService(Service service) {
        serviceMapper.deleteByPrimaryKey(service.getSvrId());
    }

    @Override
    public List<Service> list1(Service service, PageBean pageBean) {
        return serviceMapper.list1(service);
    }


    @Override
    public Service loadService(Service service) {
        return serviceMapper.selectByPrimaryKey(service.getSvrId());
    }

    @Override
    public List<Service> list2(Service service, PageBean pageBean) {
        return serviceMapper.list2(service);
    }

    @Override
    public List<Service> list3(Service service, PageBean pageBean) {
        return serviceMapper.list3(service);
    }

    @Override
    public List<Integer> listGroup(Service service) {
        return serviceMapper.listGroup(service);
    }
}
