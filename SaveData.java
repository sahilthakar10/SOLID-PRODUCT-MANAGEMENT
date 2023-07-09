package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class SaveData {

    private static List<Category> categoryList = new ArrayList<>();

    static void saveCategory(Category category) {
        categoryList.add(category);
    }

    static void deleteCategory(Category category) {
        categoryList.remove(category);
    }

    static List<Category> getListOfCategory() {
        return categoryList;
    }

}
