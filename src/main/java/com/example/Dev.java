package com.example;

public class Dev {
    private Laptop laptop;
    public Dev(Laptop laptop){
        this.laptop=laptop;
    }
    public Dev(){
        System.out.println("Dev constructor");
    }
    public void build(){
        laptop.compile();
        System.out.println("built is running");
    }
    

    
}
