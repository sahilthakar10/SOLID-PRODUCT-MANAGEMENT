package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ManageProductImpl implements ManageProduct {

    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public List<Product> listOfProduct() {
        return productList;
    }

    @Override
    public void clearProductList() {
        productList = new ArrayList<>();
    }


}
