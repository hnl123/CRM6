package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.IDictBiz;
import com.zking.crm.model.Dict;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DictBizImplTest extends BaseTest{

    @Autowired
    private IDictBiz dictBiz;

    private Dict dict;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        dict = new Dict();
    }

    @Test
    public void listDict() throws Exception {
        List<Dict> dictList = dictBiz.listDict(dict, null);
        for (Dict d : dictList) {
            System.out.println(d);
        }
    }

    @Test
    public void addDict() throws Exception {
        dict.setDictType("企业客户等级");
        dict.setDictValue("6");
        dict.setDictItem("普通客户");
        dictBiz.addDict(dict);
        System.out.println("end...");
    }

    @Test
    public void editDict() throws Exception {
        dict.setDictId(11);
        dict.setDictType("企业客户等级");
        dict.setDictValue("8");
        dict.setDictItem("普通客户");
        dictBiz.editDict(dict);
        System.out.println("end...");
    }

    @Test
    public void loadDict() throws Exception {
        dict.setDictId(11);
        Dict dict = dictBiz.LoadDict(this.dict);
        System.out.println(dict);
    }

}