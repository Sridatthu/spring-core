package com.example;

public class Dev {
    private Laptop laptop;
    
    public Dev(){
        System.out.println("Dev constructor");
    }
    public void build(){
        laptop.compile();
        System.out.println("built is running");
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    

    
}
