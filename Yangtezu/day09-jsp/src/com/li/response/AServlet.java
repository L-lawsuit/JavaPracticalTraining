package com.li.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        //Servlet输出页面呈现网页源码
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>你好，Servlet！</title>");

        writer.println("</head>");

        writer.println("<body>");

        writer.println("<h3>我是以Servlet来手动输出的网页，请查看代码文件AServlet.java和网页源码。</h3>");


        writer.println("</body>");
        writer.println("</html>");
    }
}
