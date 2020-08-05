package com.hp.demo3;

public class test03 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "小李", 23);
        Student s2 = new Student(1, "小李", 277);
        System.out.println(s1.equals(s2));//输出判断s1与s2为相同的对象

        Student s3 = new Student(2, "小李", 25);
        Student s4 = new Student(1, "小李", 55);
        System.out.println(s3.equals(s4));//输出判断s3与s4为不同的对象


    }
}
