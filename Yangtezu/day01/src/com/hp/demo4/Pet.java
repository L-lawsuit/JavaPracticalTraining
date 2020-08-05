package com.hp.demo4;

public class Pet {
    private int health;

    public Pet() {
    }

    public Pet(int health) {
        this.health = health;
    }

    public void eat(String food){
        System.out.println("动物吃" + food);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
