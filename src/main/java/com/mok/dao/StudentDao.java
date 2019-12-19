package com.mok.dao;

import com.mok.bean.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> findAll();
    public int updateStudent();
}
