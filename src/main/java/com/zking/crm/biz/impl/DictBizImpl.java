package com.zking.crm.biz.impl;

import com.zking.crm.biz.IDictBiz;
import com.zking.crm.mapper.DictMapper;
import com.zking.crm.model.Dict;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictBizImpl implements IDictBiz {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> listDict(Dict dict, PageBean pageBean) {
        return dictMapper.listDict(dict);
    }

    @Override
    public void addDict(Dict dict) {
        dictMapper.insertSelective(dict);
    }

    @Override
    public void editDict(Dict dict) {
        dictMapper.updateByPrimaryKeySelective(dict);
    }

    @Override
    public Dict LoadDict(Dict dict) {
        return dictMapper.selectByPrimaryKey(dict.getDictId());
    }

    @Override
    public List<Dict> list1(Dict dict) {
        return dictMapper.list1(dict);
    }

    @Override
    public void delDict(Dict dict) {
        dictMapper.deleteByPrimaryKey(dict.getDictId());
    }
}
