package com.ecommerce;

public class Product {

    private String productName;
    private int productPrice;
    private int qty;

    public Product(String productName, int productPrice, int qty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

}
