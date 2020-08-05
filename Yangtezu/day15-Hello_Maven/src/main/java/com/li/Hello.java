package com.li;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hello {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC","root","root");
            System.out.println(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
