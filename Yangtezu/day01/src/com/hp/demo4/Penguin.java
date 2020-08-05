package com.hp.demo4;

public class Penguin extends Pet {
    public Penguin() {
    }

    public Penguin(int health) {
        super(health);
    }

    @Override
    public void eat(String food) {
        int health = getHealth();
        health+=5;
        System.out.println("主人带企鹅吃了" + food);
        System.out.println("恢复了5点健康值。" + "现在健康值为" + health);
    }
}
