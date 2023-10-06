package com.example;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        // TODO: Initialize the list of products
        this.products = new ArrayList<Product>();
    }

    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public double totalCost(){
        double total = 0.0;
        for (Product product : products){
            total += product.getPrice();
        }
        return total;
    }
    

}
