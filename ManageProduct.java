package com.ecommerce;

import java.util.List;

public interface ManageProduct {

    void addProduct(Product product);

    void deleteProduct(Product product);

    List<Product> listOfProduct();

    void clearProductList();
}
