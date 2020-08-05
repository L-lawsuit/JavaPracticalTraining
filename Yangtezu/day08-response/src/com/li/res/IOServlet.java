package com.li.res;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/IOServlet")
public class IOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        //设置response响应类型
//        response.setContentType("text/html;charset=utf-8");
//
        //获取servletContext对象
        ServletContext context = this.getServletContext();
//
//        //响应字符流
//        //特殊字符打印流
//        PrintWriter writer = response.getWriter();
//        writer.print("你好,特殊字符打印流!");


        //响应字节流数据

        //设置响应头的类型，采用缓冲流来进行图片输入输出
        response.setContentType("image/jpg");
        BufferedOutputStream os = new BufferedOutputStream(response.getOutputStream());

        //获取路径两种方式
        //1、采用显示的绝对路径（不灵活）
        //BufferedInputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\14813\\IdeaProjects\\Yangtezu\\day08-response\\web\\WEB-INF\\img\\a.jpg"));
        //2、采用方法来获取当前工程路径（灵活性）
        BufferedInputStream is = new BufferedInputStream(new FileInputStream(context.getRealPath("/WEB-INF/img/a.jpg")));

        //输出图片
        byte[] b = new byte[1024];
        int i = 0;
        while ((i = is.read(b,0,1024)) != -1){
            os.write(b,0,i);
        }

    }
}
