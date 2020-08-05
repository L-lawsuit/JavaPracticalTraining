package com.li.entity;

public class Pet {
    String name;
    String eat;

    public Pet() {
    }

    public Pet(String name, String eat) {
        this.name = name;
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
