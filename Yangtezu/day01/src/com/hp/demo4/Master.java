package com.hp.demo4;

public class Master {

    public void feed(Pet pet){
        if (pet instanceof Dog){
            pet.eat("骨头");
        }else if (pet instanceof Penguin){
            pet.eat("南极鳕鱼");
        }
    }
}
