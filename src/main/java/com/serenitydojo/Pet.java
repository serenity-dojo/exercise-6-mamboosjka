package com.serenitydojo;

public abstract class Pet {

    private String name;
    private int age;
    public Pet(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public abstract String play();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
