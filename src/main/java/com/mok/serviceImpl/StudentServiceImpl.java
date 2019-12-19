package com.mok.serviceImpl;

import com.mok.bean.Student;
import com.mok.dao.StudentDao;
import com.mok.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> students = null;

    @Autowired
    private StudentDao studentDao;

    public List<Student> findAll(){
       students = studentDao.findAll();
        return students;
    }
    public int updateStudent(){
        int update = studentDao.updateStudent();
        return update;
    }
}
