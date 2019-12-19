package com.mok.service;

import com.mok.bean.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();
    public int updateStudent();
}
