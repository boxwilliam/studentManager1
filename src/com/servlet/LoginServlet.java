package com.servlet;/*
 *@ClassName :  LoginServlet
 *@Description :
 *@Date : 2019/2/13 9:16
 */

import com.entity.Admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin=new Admin();
        admin.setName(req.getParameter("name"));
//        admin.setPwd(req.getParameter("pwd"));
        //方法1，用转发
//        if(req.getParameter("name").equals("zs")&&req.getParameter("pwd").equals("123")){
//            req.getRequestDispatcher("/index.jsp").forward(req,resp);
//        }else{
//            resp.sendRedirect("/studentManager/login.jsp");
//        }
        //方法2，用重定向，配合session和attribute
        if(req.getParameter("name").equals("zs")&&req.getParameter("pwd").equals("123")){
            req.getSession().setAttribute("name",admin.getName());
            resp.sendRedirect("/studentManager/index.jsp");
        }else{
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
