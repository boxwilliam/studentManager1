package com.service;/*
 *@ClassName :  StudentServiceImpl
 *@Description :
 *@Date : 2019/2/14 12:13
 */

import com.dao.Impl.StudentDaoImpl;
import com.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findStudentAll() {
        return new StudentDaoImpl().findStudentAll();
//        return null;
    }
}
