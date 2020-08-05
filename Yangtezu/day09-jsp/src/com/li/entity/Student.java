package com.li.entity;

public class Student {
    Integer id;
    String name;
    Pet pet;

    public Student() {
    }
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(Integer id, String name, Pet pet) {
        this.id = id;
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
