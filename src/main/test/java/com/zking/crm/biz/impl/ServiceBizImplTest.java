package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.IServiceBiz;
import com.zking.crm.model.Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ServiceBizImplTest extends BaseTest {

    @Autowired
    private IServiceBiz serviceBiz;

    private Service service;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        service = new Service();
    }

    @Test
    public void addService() throws Exception {
    }

    @Test
    public void editService() throws Exception {
    }

    @Test
    public void list() throws Exception {
    }

    @Test
    public void listGroup() throws Exception {
        List<Integer> serviceList = serviceBiz.listGroup(service.getYd());
        for (Integer s : serviceList) {
            System.out.println(s);
        }
    }


}