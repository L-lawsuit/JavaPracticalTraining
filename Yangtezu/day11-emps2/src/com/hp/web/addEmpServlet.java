package com.hp.web;

import com.hp.entity.Emps;
import com.hp.service.IEmpsService;
import com.hp.service.impl.EmpsServiceImp;
import com.hp.utils.DruidUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/addEmpServlet")
public class addEmpServlet extends HttpServlet {

    private IEmpsService service = new EmpsServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");

        //取  调  存  转
        Map<String, String[]> map = request.getParameterMap();
        //封装emps
        Emps emp = DruidUtils.mapToBean(Emps.class, map);

        int i = service.addEmp(emp);

        if (i != 0){
            response.sendRedirect("/empsServlet");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/emps/add.jsp").forward(request,response);
    }
}
