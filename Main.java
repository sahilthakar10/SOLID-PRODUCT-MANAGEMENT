package com.ecommerce;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Ensure that regardless of the number of managers present, they can access a single instance of the database.
        Manager manager = ManagerFactory.instance();

        // Add Products
        manager.addProduct("USB", 100, 100);
        manager.addProduct("USB-Type-C", 100, 100);
        manager.addProduct("CPU", 10000, 100);
        manager.addProduct("Monitor", 7000, 100);

        //Create New Category
        manager.addCategory("Electronics");

        // Add Products
        manager.addProduct("Pants", 100, 100);
        manager.addProduct("T-Shirts", 100, 100);

        //Create New Category
        manager.addCategory("Cloths");

        //Display Category and their products
        List<Category> categoryList = manager.displayCategory();
        for (Category category : categoryList) {

            System.out.println("Category Name :- " + category.getCategoryName());

            for (Product product : category.getProductList()) {
                System.out.print("Product Name :- " + product.getProductName() + ", Price :- " + product.getProductPrice() + ", Qty :- " + product.getQty());
                System.out.println();
            }
            System.out.println();
        }

    }

}
