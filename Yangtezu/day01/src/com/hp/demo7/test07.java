package com.hp.demo7;

import com.hp.demo7.services.AptitudeHandset;
import com.hp.demo7.services.CommonHandset;

public class test07 {
    public static void main(String[] args) {
        CommonHandset commonHandset = new CommonHandset("诺基亚", "G502c");
        commonHandset.Info();
        commonHandset.play("好运来");
        commonHandset.sendInfo();
        commonHandset.Call();
        System.out.println("--------------------------------");
        AptitudeHandset aptitudeHandset = new AptitudeHandset("华为", "HTC");
        aptitudeHandset.Info();
        aptitudeHandset.networkConn();
        aptitudeHandset.play("小时代");
        aptitudeHandset.takePictures();
        aptitudeHandset.sendInfo();
        aptitudeHandset.Call();


    }
}
