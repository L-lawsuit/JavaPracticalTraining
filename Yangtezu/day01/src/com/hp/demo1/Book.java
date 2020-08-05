package com.hp.demo1;

public class Book {
    private String id;
    private String name;
    private String author;
    private int num;

    Book() {
    }

    public Book(String id, String name, String author, int num) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
