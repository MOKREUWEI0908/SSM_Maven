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

@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = WebUtils.getBean(StudentService.class);
        String s_name = request.getParameter("s_name");
        String s_number = request.getParameter("s_number");
        int update = studentService.updateStudent(s_name,s_number);
        Student student = studentService.selectStudentByS_number(s_number);
        HttpSession session = request.getSession();
        session.setAttribute("studentByS_number",student);
        response.sendRedirect(request.getContextPath()+"/helloStudentByS_number.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
