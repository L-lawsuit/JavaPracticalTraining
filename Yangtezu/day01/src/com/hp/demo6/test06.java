package com.hp.demo6;

import com.hp.demo6.service.impl.A4Paper;
import com.hp.demo6.service.impl.B5Paper;
import com.hp.demo6.service.impl.BlackInkBox;
import com.hp.demo6.service.impl.ColorInkBox;

public class test06 {

    public static void main(String[] args) {

        //需求：1、使用黑白墨盒在A4纸上打印
        Printer p1 = new Printer(new BlackInkBox(),new A4Paper());
        p1.print();

        //	2、使用彩色墨盒在B5纸上打印
        Printer p2 = new Printer(new ColorInkBox(),new B5Paper());
        p2.print();
    }
}
