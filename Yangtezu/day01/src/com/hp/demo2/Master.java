package com.hp.demo2;

public class Master {
    public void seeDoctor(Pet pet){
        if (pet instanceof Dog){
            System.out.println("主人带狗狗去看病");
        }else if (pet instanceof Cat){
            System.out.println("主人带小猫去看病");
        }
    }
}
