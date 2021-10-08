package com.website.service.impl;

import com.website.mapper.ProductTypeMapper;
import com.website.pojo.ProductType;
import com.website.pojo.ProductTypeExample;
import com.website.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ProductTypeServiceImpl")
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    ProductTypeMapper productTypeMapper;


    @Override
    public List<ProductType> getAll() {
        return productTypeMapper.selectByExample(new ProductTypeExample());
    }
}
