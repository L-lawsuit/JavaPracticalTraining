package com.li.ServletDevelop;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet1 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //进行初始化servlet
        System.out.println("Servlet1初始化了");
    }

    @Override
    public ServletConfig getServletConfig() {
        //Servlet配置
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //Servlet服务，主要方法
        System.out.println("Servlet1服务中......");
    }

    @Override
    public String getServletInfo() {
        //得到Servlet信息
        return null;
    }

    @Override
    public void destroy() {
        //Servlet销毁
        System.out.println("Servlet1被销毁了");
    }
}
