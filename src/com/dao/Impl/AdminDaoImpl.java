package com.dao.Impl;

import com.dao.AdminDao;
import com.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @ClassName Impl
 * @Description
 * @Date 2019/2/11 10:02
 */
public class AdminDaoImpl extends Base implements AdminDao  {

    @Override
    public boolean findAdmin(Admin admin) {
        String sql="select * from admin where name=? and password=?";
        //调用父类的查询方法，就是Base
        ResultSet resultSet=super.query(sql ,admin.getName(),admin.getPwd());
        try {
            //读取结果集，如果
            if (resultSet.next()){
                admin.setId(resultSet.getInt("id"));
                admin.setName(resultSet.getString("name"));
                admin.setPwd(resultSet.getString("pwd"));
                admin.setPhone(resultSet.getInt("phone"));
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean addAdmin(Admin admin) {
        String sql="";
        return false;
    }

    @Override
    public boolean deleteAdmin(Admin admin) {
        return false;
    }
}
