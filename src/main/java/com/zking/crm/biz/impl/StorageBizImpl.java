package com.zking.crm.biz.impl;

import com.zking.crm.biz.IStorageBiz;
import com.zking.crm.mapper.StorageMapper;
import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageBizImpl implements IStorageBiz {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public List<Storage> listStorage(Storage storage, PageBean pageBean) {
        return storageMapper.listStorage(storage);
    }
}
