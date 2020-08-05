package com.hp.domain;

import java.util.Date;

public class SearchHistory {
    private String id;
    private String search_words;
    private Integer num;
    private Date search_time;

    public SearchHistory() {
    }

    public SearchHistory(String id, String search_words, Integer num, Date search_time) {
        this.id = id;
        this.search_words = search_words;
        this.num = num;
        this.search_time = search_time;
    }

    @Override
    public String toString() {
        return "SearchHistory{" +
                "id='" + id + '\'' +
                ", search_words='" + search_words + '\'' +
                ", num=" + num +
                ", search_time=" + search_time +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSearch_words() {
        return search_words;
    }

    public void setSearch_words(String search_words) {
        this.search_words = search_words;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getSearch_time() {
        return search_time;
    }

    public void setSearch_time(Date search_time) {
        this.search_time = search_time;
    }
}
