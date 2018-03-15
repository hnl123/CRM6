package com.zking.crm.biz;

import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IStorageBiz {

    List<Storage> listStorage(Storage storage, PageBean pageBean);
}
