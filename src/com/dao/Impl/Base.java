package com.dao.Impl;

import util.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @ClassName Base
 * @Description
 * @Date 2019/2/11 10:06
 */
public class Base {
    //创建查询的方法：需要参数是SQL语句，可变参数
    public ResultSet query(String sql,Object...objects){
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try {
            System.out.println("wgx");
            preparedStatement=new Database().getConnection().prepareStatement(sql);
            System.out.println("wgx2");
            for(int i=0;i<objects.length;i++){

                preparedStatement.setObject(i+1,objects[i]);
                System.out.println("wgx3");
            }
            System.out.println(preparedStatement.toString());
            resultSet=preparedStatement.executeQuery();
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    //创建更新的方法，需要的参数：sql,可变参数
    public int update (String sql,Object...objects){
        int in=0;

        PreparedStatement preparedStatement=null;
        try {
            new Database().getConnection().prepareStatement(sql);
            for (int i=0;i<objects.length;i++){
                preparedStatement.setObject(i+1,objects[i]);
            }
            in=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  in;
    }
}
