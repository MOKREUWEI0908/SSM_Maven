package com.mok.controller;

import com.mok.bean.Student;
import com.mok.bean.WebUtils;
import com.mok.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = WebUtils.getBean(StudentService.class);
        List<Student> list = studentService.findAll();
        HttpSession session = request.getSession();
        session.setAttribute("students",list);
        response.sendRedirect(request.getContextPath()+"/helloStudents.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
