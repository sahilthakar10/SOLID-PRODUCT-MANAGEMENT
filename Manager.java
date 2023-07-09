package com.ecommerce;

import java.util.List;

public class Manager {

    private ManageProduct manageProduct;
    private ManageCategory manageCategory;

    public Manager(ManageProduct manageProduct, ManageCategory manageCategory) {
        this.manageProduct = manageProduct;
        this.manageCategory = manageCategory;
    }

    void addCategory(String name) {
        List<Product> productList = manageProduct.listOfProduct();
        Category category = new Category(name, productList);
        manageCategory.addCategory(category);
        clearProductList();
    }

    void addProduct(String name, int price, int qty) {
        Product product = new Product(name, price, qty);
        manageProduct.addProduct(product);
    }

    void clearProductList() {
        manageProduct.clearProductList();
    }

    List<Category> displayCategory() {
        return manageCategory.getListOfCategory();
    }

}
