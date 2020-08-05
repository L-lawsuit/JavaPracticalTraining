package com.hp.demo4;

public class test04 {
    public static void main(String[] args) {
        Pet p1 = new Dog(80);
        Pet p2 = new Penguin(90);

        Master master = new Master();
        master.feed(p1);
        master.feed(p2);
    }
}
