package com.dao.Impl;/*
 *@ClassName  StudentDaoImpl
 *@Description
 *@Date 2019/2/11 10:07
 */

import com.dao.StudentDao;
import com.entity.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  extends Base implements StudentDao {
    private ResultSet resultSet;
//    public StudentDaoImpl (Connection connection){
//     //   super(connection);
//    }
    @Override
    public List<Student> findStudentAll() {

        List studentlist=new ArrayList();
        String sql="select * from student";
        //select s.*,c.name className from student s left join class c where s.sclass=c.id
        resultSet=super.query(sql);
        Student student=new Student();
        try {
            while(resultSet.next()){
                student.setName(resultSet.getString("name"));
                student.setNumber(resultSet.getInt("number"));
                student.setGender(resultSet.getString("gender"));
                student.setClasss(resultSet.getString("classs"));
                studentlist.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentlist;
    }
}
