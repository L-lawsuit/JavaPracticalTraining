package com.li.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/AServlet")//映射请求
public class AServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取一个请求参数
//        String game = request.getParameter("game");
//        System.out.println(game);

        //获取所有的请求参数，进而可通过request.getParameter(参数);获得值
//        Enumeration<String> names = request.getParameterNames();
//        while (names.hasMoreElements()){
//            String s = names.nextElement();
//            System.out.println(s);
//        }

        //获取同一参数的所有值
        //1、先获取所有的参数
        //2、通过各个参数获得相应的值
//        Enumeration<String> names = request.getParameterNames();
//        while (names.hasMoreElements()){
//            String param = names.nextElement();
//            String[] values = request.getParameterValues(param);
//
//            System.out.println(Arrays.toString(values));
//        }

        //一次性获取所有参数和值
        //1、通过map集合提出每一个entry来获取参数和值
//        Map<String, String[]> map = request.getParameterMap();
//        Set<Map.Entry<String, String[]>> entries = map.entrySet();
//        for (Map.Entry<String, String[]> entry : entries) {
//
//            String key = entry.getKey();
//            String[] value = entry.getValue();
//
//            System.out.println(key);
//            System.out.println(Arrays.toString(value));
//
//        }

        //2、通过key的集合来得到所有值
//        Map<String, String[]> map = request.getParameterMap();
//        Set<String> keySet = map.keySet();
//        for (String s : keySet) {
//            System.out.println(s);
//            System.out.println(Arrays.toString(map.get(s)));
//
//        }

        //3、直接遍历若干个value，得不到key的值
        Map<String, String[]> map = request.getParameterMap();
        Collection<String[]> values = map.values();
        for (String[] value : values) {
            System.out.println(Arrays.toString(value));

        }

    }
}
