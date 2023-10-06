package com.example;

public class Product {
    private String name;
    private double price;
    private int productID;

    public Product(String name, double price, int productID) {
        // TODO: Initialize the attributes
        this.name = name;
        this.price = price;
        this.productID = productID;

    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;

    }
    public int getProductID(){
        return this.productID;
    }

    public void NewName(String Name){
        this.name = Name;

    }
    public void NewPrice(double Price){
        this.price = Price;
    
    }

    public void NewProductID(int productID){
        this.productID = productID;
    }



}
