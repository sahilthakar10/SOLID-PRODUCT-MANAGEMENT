package com.ecommerce;

import java.util.List;

public class Category {

    private String categoryName;
    private List<Product> productList;


    public Category(String categoryName, List<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
