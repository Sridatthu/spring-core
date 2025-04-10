package com.example;

public class Dev {
    private Computer comp;
    
    public Dev(){
        System.out.println("Dev constructor");
    }
    public void build(){
        comp.compile();
        System.out.println("built is running");
    }
    public Computer getComp() {
        return comp;
    }
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
