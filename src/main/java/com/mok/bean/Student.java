package com.mok.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String s_number;
    private String s_name;
    private String s_sex;
    private String s_national;
    private String s_major;
    private String s_class;
    private String s_abnum;
    private String s_tel;
    private String s_adnum;

    public String getS_number() {
        return s_number;
    }

    public void setS_number(String s_number) {
        this.s_number = s_number;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_national() {
        return s_national;
    }

    public void setS_national(String s_national) {
        this.s_national = s_national;
    }

    public String getS_major() {
        return s_major;
    }

    public void setS_major(String s_major) {
        this.s_major = s_major;
    }

    public String getS_class() {
        return s_class;
    }

    public void setS_class(String s_class) {
        this.s_class = s_class;
    }

    public String getS_abnum() {
        return s_abnum;
    }

    public void setS_abnum(String s_abnum) {
        this.s_abnum = s_abnum;
    }

    public String getS_tel() {
        return s_tel;
    }

    public void setS_tel(String s_tel) {
        this.s_tel = s_tel;
    }

    public String getS_adnum() {
        return s_adnum;
    }

    public void setS_adnum(String s_adnum) {
        this.s_adnum = s_adnum;
    }
}
