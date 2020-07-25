package com.jl.demo;
public class Phone {

    private String name;
    private String brand;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Phone() {
        super();
    }

    public Phone(String name, String brand, String price) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + "]";
    }
}
