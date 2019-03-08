package com.service;/*
 *@ClassName :  AdminService
 *@Description :
 *@Date : 2019/2/11 11:50
 */

import com.entity.Admin;

public interface AdminService {
    boolean login(Admin admin);
    boolean loginout(Admin admin);
}
