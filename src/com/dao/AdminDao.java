package com.dao;

import com.entity.Admin;

public interface AdminDao {
    boolean findAdmin(Admin admin);
    boolean addAdmin(Admin admin);
    boolean deleteAdmin(Admin admin);
}
