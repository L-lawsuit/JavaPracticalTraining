package com.li;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirectServlet")
public class redirectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //第一种重定向
        response.setStatus(302);
        response.setHeader("location","https://www.baidu.com");

        //第二种重定向（简化版）
//        response.sendRedirect("https://www.baidu.com");
    }
}
