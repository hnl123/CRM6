package com.zking.crm.mapper;

import com.zking.crm.model.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

    List<Dict> listDict(Dict dict);

    List<Dict> list1(Dict dict);
}