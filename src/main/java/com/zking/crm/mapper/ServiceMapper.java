package com.zking.crm.mapper;

import com.zking.crm.model.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    List<Service> list(Service service);

    List<Service> list1(Service service);

    List<Service> list2(Service service);

    List<Service> list3(Service service);

    List<Integer> listGroup(String yd);
}