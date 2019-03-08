package com.dao;

import com.entity.Student;

import java.sql.ResultSet;
import java.util.List;

public interface StudentDao {
    List<Student> findStudentAll();
}
