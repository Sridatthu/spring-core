package com.example;

public class Dev {
    public Dev(){
        System.out.println("Dev constructor");
    }

    private int age;
    public Dev(int age){
        this.age=age;
    }
    public void build(){
        System.out.println("built is running");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
