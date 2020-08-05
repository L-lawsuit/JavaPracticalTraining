package com.hp.demo5;

public class test05 {
    public static void main(String[] args) {
        // 上班出门：先关门，再上锁  下班回家：先开锁，再开门
        TheftproofDoor theftproofDoor = new TheftproofDoor();

        Door door = theftproofDoor;
        Lock lock = theftproofDoor;

        //上班出门
        door.closeDoor();
        lock.lockUp();
        //下班回家
        lock.openLock();
        door.openDoor();
    }
}
