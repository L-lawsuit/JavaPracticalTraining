package com.hp.domain;

import java.util.Date;

public class Product {
    private String id;
    private String product_name;
    private String product_image;
    private Double price;
    private String product_desc;
    private Date create_time;

    private Integer sale;//销量

    private ProductType productType;
    private ProductBrand productBrand;


    public Product() {
    }

    public Product(String id, String product_name, String product_image, Double price, String product_desc, Date create_time, Integer sale, ProductType productType, ProductBrand productBrand) {
        this.id = id;
        this.product_name = product_name;
        this.product_image = product_image;
        this.price = price;
        this.product_desc = product_desc;
        this.create_time = create_time;
        this.sale = sale;
        this.productType = productType;
        this.productBrand = productBrand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_image='" + product_image + '\'' +
                ", price=" + price +
                ", product_desc='" + product_desc + '\'' +
                ", create_time=" + create_time +
                ", sale=" + sale +
                ", productType=" + productType +
                ", productBrand=" + productBrand +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }
}
