package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.IStorageBiz;
import com.zking.crm.model.Storage;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class StorageBizImplTest extends BaseTest {

    @Autowired
    private IStorageBiz storageBiz;

    private Storage storage;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        storage = new Storage();
    }

    @Test
    public void listStorage() throws Exception {
        List<Storage> storageList = storageBiz.listStorage(storage, null);
        for (Storage s : storageList) {
            System.out.println(s);
            System.out.println(s.getProduct());
        }
    }

}