package com.website.service.impl;

import com.website.mapper.AdminMapper;
import com.website.pojo.Admin;
import com.website.pojo.AdminExample;
import com.website.service.AdminService;
import com.website.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String name, String pwd) {
        AdminExample example = new AdminExample();
        example.createCriteria().andANameEqualTo(name);
        List<Admin> list = adminMapper.selectByExample(example);
        if (list.size() > 0){
           Admin admin = list.get(0);
           String miPwd = MD5Util.getMD5(pwd);
           if (miPwd.equals(admin.getaPass())){
               return admin;
           }
        }
        return null;
    }
}
