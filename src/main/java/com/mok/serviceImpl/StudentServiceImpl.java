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

    @Autowired(required = false)
    private StudentDao studentDao;

    public List<Student> findAll(){
       students = studentDao.findAll();
        return students;
    }
    public int updateStudent(String s_name,String s_number){
        int update = studentDao.updateStudent(s_name,s_number);
        return update;
    }

    public Student selectStudentByS_number(String s_number){
        Student student = studentDao.selectStudentByS_number(s_number);
        return student;
    }
}
