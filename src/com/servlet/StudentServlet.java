package com.servlet;/*
 *@ClassName :  StudentServlet
 *@Description :
 *@Date : 2019/2/14 12:17
 */

import com.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String action=req.getRequestURI().substring(req.getRequestURI().lastIndexOf("/")+1);
        switch(action){
            case "list":list(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
    }

    public void list(HttpServletRequest req,HttpServletResponse resp){
        List list =new StudentServiceImpl().findStudentAll();
        req.setAttribute("list",list);
        try {
            req.getRequestDispatcher("/student/list.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
