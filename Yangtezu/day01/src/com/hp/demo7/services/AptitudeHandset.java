package com.hp.demo7.services;

public class AptitudeHandset extends HandSet implements TheakePictures,Network,PlayWiring {

    public AptitudeHandset() {
    }

    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带图片与文字的信息......");
    }

    @Override
    public void Call() {
        System.out.println("开始视频通话......");
    }

    @Override
    public void networkConn() {
        System.out.println("已经启动移动网络......");
    }

    @Override
    public void play(String film) {
        System.out.println("开始播放《" + film + "》......");

    }

    @Override
    public void takePictures() {
        System.out.println("咔嚓......拍照成功");
    }
}
