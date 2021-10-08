package com.website.service;

import com.website.pojo.Admin;

public interface AdminService {
    Admin login(String name, String pwd);
}
