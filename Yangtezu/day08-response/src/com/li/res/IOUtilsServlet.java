package com.li.res;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/IOUtilsServlet")
public class IOUtilsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取输入流
        BufferedInputStream is = new BufferedInputStream(new FileInputStream(this.getServletContext().getRealPath("/WEB-INF/img/a.jpg")));
        //获取输出流
        BufferedOutputStream os = new BufferedOutputStream(response.getOutputStream());
        //调用IOUtils中的方法
        IOUtils.copy(is,os);


    }
}
