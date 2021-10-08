package com.website.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.website.pojo.ProductInfo;
import com.website.pojo.vo.ProductInfoVo;

import java.util.List;

public interface ProductInfoService {
    List<ProductInfo> getAll();
    PageInfo splitPage(int pageNum,int pageSize);

    int save(ProductInfo info);
    ProductInfo getByID(int pid);
    int update(ProductInfo info);
    int delete(int pid);
    int deleteBatch(String []ids);
    List<ProductInfo> selectCondition(ProductInfoVo vo);
    public PageInfo splitPageVo(ProductInfoVo vo,int pageSize);
}
