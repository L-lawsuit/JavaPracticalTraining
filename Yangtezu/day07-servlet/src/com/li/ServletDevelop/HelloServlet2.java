package com.li.ServletDevelop;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


//Servlet演变2，GenericServlet相当于一个适配器，只保留我们需要的方法
public class HelloServlet2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet2服务中......");
    }
}
