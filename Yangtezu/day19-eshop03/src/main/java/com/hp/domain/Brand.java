package com.hp.domain;

public class Brand {
    private String id;
    private String brand_name;
    private String brand_type;
    private String brand_img;

    public Brand() {
    }

    public Brand(String id, String brand_name, String brand_type, String brand_img) {
        this.id = id;
        this.brand_name = brand_name;
        this.brand_type = brand_type;
        this.brand_img = brand_img;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", brand_type='" + brand_type + '\'' +
                ", brand_img='" + brand_img + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_type() {
        return brand_type;
    }

    public void setBrand_type(String brand_type) {
        this.brand_type = brand_type;
    }

    public String getBrand_img() {
        return brand_img;
    }

    public void setBrand_img(String brand_img) {
        this.brand_img = brand_img;
    }
}
