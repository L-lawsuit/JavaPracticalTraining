package com.li;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forwardServlet")
public class forwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //转发只能在服务器内部访问资源，不能转到其他的服务器

        //该转发可以请求成功
        request.getRequestDispatcher("WEB-INF/img/a.jpg").forward(request,response);

//        //该转发会失败
//        request.getRequestDispatcher("https://www.baidu.com").forward(request,response);
    }
}
