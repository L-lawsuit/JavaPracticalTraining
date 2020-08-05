package com.hp.domain;

public class Carousel {
    private String id;
    private String url;
    private Integer sequence_num;

    public Carousel() {
    }

    public Carousel(String id, String url, Integer sequence_num) {
        this.id = id;
        this.url = url;
        this.sequence_num = sequence_num;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", sequence_num=" + sequence_num +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSequence_num() {
        return sequence_num;
    }

    public void setSequence_num(Integer sequence_num) {
        this.sequence_num = sequence_num;
    }
}
