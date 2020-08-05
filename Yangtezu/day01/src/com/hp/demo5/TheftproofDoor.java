package com.hp.demo5;

public class TheftproofDoor extends Door implements Lock {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");

    }

    @Override
    public void lockUp() {
        System.out.println("上锁");

    }

    @Override
    public void openLock() {
        System.out.println("开锁");

    }
}
