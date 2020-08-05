package com.hp.demo7.services;

public class HandSet {
    private String brand;//品牌
    private String type;//类型

    public HandSet() {
    }

    public HandSet(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    public void sendInfo(){
        System.out.println("发送文字信息......");
    }
    public void Call(){
        System.out.println("开始语音通话.....");
    }
    public void Info(){
        System.out.println("这是一款型号为" + type + "的" + brand + "手机");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
