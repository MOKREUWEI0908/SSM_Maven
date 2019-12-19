package com.mok.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.beans.beancontext.BeanContextServicesSupport;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BaseDao<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Class<T> type;

    public int update(String sql,Object...params){
        int update = jdbcTemplate.update(sql,params);
        return update;
    }

    public List<T> getBeanList(String sql,Object...params){
        List<T> list = new ArrayList<>();
        list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<T>(type));
        return list;
    }

    public T getBean(String sql,Object...params){
        T Object = null;
        Object = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(type),params);
        return Object;
    }

    public Object getSingleValue(String sql,Object...params){
        Object object = jdbcTemplate.queryForObject(sql,Object.class,params);
        return object;
    }

}
