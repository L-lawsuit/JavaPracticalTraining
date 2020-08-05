package com.hp.demo2;

public class test02 {

    public static void main(String[] args) {
        Pet pet1 = new Dog();
        Pet pet2 = new Cat();

        Master master = new Master();
        master.seeDoctor(pet1);
        master.seeDoctor(pet2);

    }
}
