package com.aadiandjava.ex1;

public class Student {

    private Laptop laptop;

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void study() {
        laptop.start();   // use whatever method your Laptop has
    }
}