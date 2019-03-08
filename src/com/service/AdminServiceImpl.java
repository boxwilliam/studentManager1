package com.service;/*
 *@ClassName :  AdminServiceImpl
 *@Description :
 *@Date : 2019/2/11 11:52
 */

import com.dao.Impl.AdminDaoImpl;
import com.entity.Admin;

public class AdminServiceImpl implements AdminService{

    @Override
    public boolean login(Admin admin) {

        return new AdminDaoImpl().findAdmin(admin);
    }

    @Override
    public boolean loginout(Admin admin) {
        return false;
    }
}
