package com.hp.web;

import com.hp.entity.Emps;
import com.hp.service.impl.EmpsServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/empsServlet")
public class empsServlet extends HttpServlet {
    private EmpsServiceImp service = new EmpsServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //取 查 存 转
        List<Emps> empsList = service.selectAll();

        request.setAttribute("empsList",empsList);


        request.getRequestDispatcher("/WEB-INF/emps/emps.jsp").forward(request,response);
    }
}
