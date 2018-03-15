package com.zking.crm.biz;

import com.zking.crm.model.Dict;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IDictBiz {

    //查看全部字典
    List<Dict> listDict(Dict dict, PageBean pageBean);

    //增加字典
    void addDict(Dict dict);

    //修改字典
    void editDict(Dict dict);

    Dict LoadDict(Dict dict);


    List<Dict> list1(Dict dict);

    void delDict(Dict dict);
}
