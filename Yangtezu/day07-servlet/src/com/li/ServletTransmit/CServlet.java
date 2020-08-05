package com.li.ServletTransmit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/CServlet")
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //接收属性
        Object drink = request.getAttribute("drink");
        System.out.println("从BServlet接收的属性值：" + drink);

        //输出所有请求的参数和值
        Map<String, String[]> map = request.getParameterMap();
        Set<String> sets = map.keySet();
        System.out.println("从BServlet接收的请求的参数和值：");
        for (String set : sets) {
            System.out.println(set + "\t" +Arrays.toString(map.get(set)));
        }
    }
}
