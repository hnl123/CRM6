package com.zking.crm.mapper;

import com.zking.crm.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Long prodId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long prodId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> listProduct(Product product);
}