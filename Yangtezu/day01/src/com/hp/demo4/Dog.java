package com.hp.demo4;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(int health) {
        super(health);
    }

    @Override
    public void eat(String food) {
        int health = getHealth();
        health+=3;
        System.out.println("主人带狗狗吃了" + food);
        System.out.println("恢复了3点健康值。" + "现在健康值为" + health);


    }
}
