package com.hp.domain;

public class ProductType {
    private String id;
    private String product_type_name;
    private String product_type_desc;
    private String product_type_icon;

    public ProductType() {
    }

    public ProductType(String id, String product_type_name, String product_type_desc, String product_type_icon) {
        this.id = id;
        this.product_type_name = product_type_name;
        this.product_type_desc = product_type_desc;
        this.product_type_icon = product_type_icon;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "id='" + id + '\'' +
                ", product_type_name='" + product_type_name + '\'' +
                ", product_type_desc='" + product_type_desc + '\'' +
                ", product_type_icon='" + product_type_icon + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_type_name() {
        return product_type_name;
    }

    public void setProduct_type_name(String product_type_name) {
        this.product_type_name = product_type_name;
    }

    public String getProduct_type_desc() {
        return product_type_desc;
    }

    public void setProduct_type_desc(String product_type_desc) {
        this.product_type_desc = product_type_desc;
    }

    public String getProduct_type_icon() {
        return product_type_icon;
    }

    public void setProduct_type_icon(String product_type_icon) {
        this.product_type_icon = product_type_icon;
    }
}

