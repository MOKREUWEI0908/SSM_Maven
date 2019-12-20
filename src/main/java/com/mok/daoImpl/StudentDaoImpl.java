package com.mok.daoImpl;

import com.mok.bean.Student;
import com.mok.dao.BaseDao;
import com.mok.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDaoImpl implements StudentDao {

    private List<Student> list = null;
    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
        String sql = "select * from student";
        list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return list;

    }
    public int updateStudent(String s_name,String s_number){
        String sql = "update student set s_name = ? where s_number = ?";
        int update = jdbcTemplate.update(sql,s_name,s_number);
        return update;
    }

    public Student selectStudentByS_number(String s_number){
        String sql = "select * from student where s_number = ?";
        Student stu = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Student.class),s_number);
        return stu;
    }

}
