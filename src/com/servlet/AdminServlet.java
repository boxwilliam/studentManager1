package com.servlet;/*
 *@ClassName :  AdminServlet
 *@Description :
 *@Date : 2019/2/11 11:57
 */

import com.entity.Admin;
import com.service.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getRequestURI().substring(req.getRequestURI().lastIndexOf("/")+1);
        switch(action){
            case "login":login(req,resp);
            case"loginOut":loginOut(req,resp);
        }
       // super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void login(HttpServletRequest req, HttpServletResponse resp){
        Admin admin =new Admin();
        admin.setName(req.getParameter("name"));
        admin.setPwd(req.getParameter("pwd"));
        PrintWriter printWriter=null;
        try {
             printWriter=resp.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (new AdminServiceImpl().login(admin)) {
            printWriter.print("登陆成功");
        }else{
            printWriter.print("登陆失败");
        }
    }
    public void loginOut(HttpServletRequest req,HttpServletResponse resp){
        //此处注销
        req.getSession().invalidate();
        try {
            resp.sendRedirect("/studentManager/login.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
