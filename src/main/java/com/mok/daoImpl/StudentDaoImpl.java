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
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
        String sql = "select * from student";
        list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return list;

    }
    public int updateStudent(){
        String sql = "update student set s_name = ? where s_number = ?";
        int update = jdbcTemplate.update(sql,"哈哈哈哈哈","170207");
        return update;
    }

}
