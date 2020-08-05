package com.hp.demo7.services;

public class CommonHandset extends HandSet implements PlayWiring {

    public CommonHandset() {
    }

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void play(String film) {
        System.out.println("开始播放《" + film + "》......");
    }
}
